package hst.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import net.sf.json.JSONObject;

/** 
* @author Ruby E-mail: 1104471752@qq.com
* @version ����ʱ�䣺2018��6��14�� ����9:40:42 
* ��˵�� 
*/
@Service("httpUtil")
public class HttpUtil {
		/**
	     * json 字符串
	     * @param url ���������URL
	     * @param param ��������������Ӧ���� name1=value1&name2=value2 ����ʽ��or �����url��Ҫ�Ĳ���, û�в���ֱ�Ӵ�null
	     * @return ����Զ����Դ����Ӧ���
	     */
	public static String getSerchPersion(String url,String param){
		/* 1 生成 HttpClinet 对象并设置参数 */
		HttpClient httpClient=new HttpClient();
		//设置http连接超时为5秒
		httpClient.getHttpConnectionManager().getParams().setConnectionTimeout(5000);
		
		//生成HttpMethod对象并设置参数
		GetMethod getMethod=new GetMethod(url);
		//设置get请求超时为5秒
		getMethod.getParams().setParameter(HttpMethodParams.SO_TIMEOUT, 5000);
		//设置请求重试处理，用的是默认的重试处理：请求三次
		getMethod.getParams().setParameter(HttpMethodParams.RETRY_HANDLER, new DefaultHttpMethodRetryHandler());
		String response="";
		
		try {
			//执行http get请求
			int statusCode=httpClient.executeMethod(getMethod);
			
			//判断访问的状态码
			if(statusCode != HttpStatus.SC_OK){
				System.out.println("请求出错:"+getMethod.getStatusLine());
			}
			
			//处理http响应内容
				//http响应头部信息，并简单打印
			Header[] headers=getMethod.getResponseHeaders();
			for(Header h:headers){
				System.out.println(h.getName()+"----------------"+h.getValue());
			}
			//读取http响应内容，并简单打印网页内容
			byte[] responseBody=getMethod.getResponseBody();//读取为字节数组
			response=new String(responseBody,param);
			System.out.println("------------response:"+response);
			
			
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			// 发生致命的异常，可能是协议不对或者返回的内容有问题
			System.out.println("���������URL��");
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			// 发生网络异常
			System.out.println("发生网络异常");
			e.printStackTrace();
		}finally {
			//释放连接
			getMethod.releaseConnection();
		}
		
		return response;
		
	}
	
	/**
	 * post请求
	 * @param url
	 * @param json
	 * @return
	 */
	public static JSONObject doPost(String url,JSONObject json){
		DefaultHttpClient client = new DefaultHttpClient();
		          HttpPost post = new HttpPost(url);
		          JSONObject response = null;
		          
		              StringEntity s;
		              
					try {
						s = new StringEntity(json.toString());
						s.setContentEncoding("UTF-8");
						s.setContentType("application/json");//发送json数据需要设置contentType
						post.setEntity(s);
						HttpResponse res;
						try {
							res = client.execute(post);
							if(res.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
								HttpEntity entity = res.getEntity();
								String result = EntityUtils.toString(res.getEntity(), HTTP.UTF_8);
								
								response = JSONObject.fromObject(result);
							}
						} catch (ClientProtocolException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					} catch (UnsupportedEncodingException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
		          return response;
		
	}
}
