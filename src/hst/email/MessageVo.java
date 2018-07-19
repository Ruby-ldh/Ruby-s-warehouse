package hst.email; 
/** 
* @author Ruby E-mail: 1104471752@qq.com
* @version 创建时间：2018年7月9日 下午2:02:26 
* 类说明 
*/
public class MessageVo {
	private String subject;//发送主题
	private String text;//发送内容
	private String toMailAddress;//收件人地址
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getToMailAddress() {
		return toMailAddress;
	}
	public void setToMailAddress(String toMailAddress) {
		this.toMailAddress = toMailAddress;
	}
	
	
}
