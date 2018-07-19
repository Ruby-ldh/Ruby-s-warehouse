package hst.control.equipment;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import hst.control.apply.ApplyControl;
import hst.control.trialCode.TrialCodeControl;
import hst.email.EmailDemo;
import hst.email.MessageVo;
import hst.model.apply.ApplyBean;
import hst.model.equipment.EquipmentBean;
import hst.model.person.PersonBean;
import hst.service.apply.ApplyService;
import hst.service.equipment.EquipmentService;
import hst.service.person.PersonService;
import hst.util.HttpUtil;
import net.sf.json.JSONObject;

/** 
* @author Ruby E-mail: 1104471752@qq.com
* @version ����ʱ�䣺2018��6��15�� ����10:17:15 
* ��˵�� 
*/
@Controller
public class EquipmentControl {
	
	@Resource
	private EquipmentService equipmentService;
	@Resource
	private PersonService personService;
	@Resource
	private HttpUtil httpUtil;
	@Resource
	private ApplyService applyService;
	@Resource
	private ApplyControl applyControl;
	@Resource
	private TrialCodeControl trialCodeControl;
	
	
/*----------------------------------------------------------------------------------------------------------------	*/
	/*
	 * 设备添加
	 */
	@RequestMapping("addEquipment.do")
	public String addEquipment(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		//获取数据	
		String ordId=request.getParameter("ordId");//项目编号
		 String xmName=new String(request.getParameter("xmName").getBytes("iso-8859-1"),"utf-8");//项目名	 
		 String orderName=new String(request.getParameter("orderName").getBytes("iso-8859-1"),"utf-8");//设备名称
		 String machineCode=new String(request.getParameter("machineCode").getBytes("iso-8859-1"),"utf-8");//机器码
		 String local=new String(request.getParameter("local").getBytes("iso-8859-1"),"utf-8");//使用地点
		 String type=new String(request.getParameter("type1").getBytes("iso-8859-1"),"utf-8");//类型
		 int authorization=new Integer(request.getParameter("authorization"));//是否授权
		 String system=new String(request.getParameter("system").getBytes("iso-8859-1"),"utf-8");//系统
		 String address=new String(request.getParameter("address").getBytes("iso-8859-1"),"utf-8");//地址
		 String version=new String(request.getParameter("version").getBytes("iso-8859-1"),"utf-8");//版本
		 String addPersonId=new String(request.getParameter("addPersonId").getBytes("iso-8859-1"),"utf-8");//地址
		 String addPersonName=new String(request.getParameter("addPersonName").getBytes("iso-8859-1"),"utf-8");//版本
		 Timestamp addTime=Timestamp.valueOf(request.getParameter("addTime"));//地址
		 int mailState=new Integer(request.getParameter("mailState"));//邮件状态
		 int state=new Integer(request.getParameter("state"));//正式版状态
		 
		EquipmentBean equipmentBean=new EquipmentBean();
		//往equipmentBean中赋值
		equipmentBean.setOrdId(ordId);
		equipmentBean.setXmName(xmName);
		equipmentBean.setorderName(orderName);
		equipmentBean.setMachineCode(machineCode);
		equipmentBean.setLocal(local);
		equipmentBean.setType(type);
		equipmentBean.setAuthorization(authorization);
		equipmentBean.setSystem(system);
		equipmentBean.setAddress(address);
		equipmentBean.setVersion(version);
		equipmentBean.setState(state);
		equipmentBean.setAddPersonId(addPersonId);
		equipmentBean.setAddPersonName(addPersonName);
		equipmentBean.setAddTime(addTime);
		equipmentBean.setMailState(mailState);
		equipmentService.addEquipment(equipmentBean);
		
		return "addEquipmenterror";
	}

/*-------------------------------------------------------------------------------------------------------*/
	/**
	 * 删除设备
	 * @throws UnsupportedEncodingException 
	 */
	@RequestMapping("deleteEquipment.do")
	public String deleteEquipment(HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException {
		String id=request.getParameter("id");
		String ordId=request.getParameter("ordId");
		String xmName=new String(request.getParameter("xmName").getBytes("iso-8859-1"),"utf-8");
		String[] ids=id.split(",");
		Integer[] intid=new Integer[ids.length];
		for (int i = 0; i < ids.length; i++) {
			if(ids[i]==null){
				break;
			}else{
				intid[i]=Integer.parseInt(ids[i]);
				equipmentService.deleteEquipment(intid[i]);
			}
		}
		request.setAttribute("ordId", ordId);
		request.setAttribute("xmName", xmName);
		return "deleteError";
	}
	
/*------------------------------------------------------------------------------------------------------*/
	/*
	 * 试用码申请审核
	 */
		@RequestMapping("addTrialCode.do")
		public String addTrialCode(ApplyBean applyBean,HttpServletRequest request,HttpServletResponse response) throws Exception{
			
			SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			EquipmentBean equipmentBean=new EquipmentBean();
			int state=new Integer(request.getParameter("state"));
			int id=new Integer(request.getParameter("id"));
			int applyId=new Integer(request.getParameter("applyId"));
			
			String ordId=new String(request.getParameter("ordId").getBytes("iso-8859-1"),"utf-8");
			String xmName=new String(request.getParameter("ordName").getBytes("iso-8859-1"),"utf-8");
			String orderName=new String(request.getParameter("equipment").getBytes("iso-8859-1"),"utf-8");
			 String machineCode=new String(request.getParameter("machineCode").getBytes("iso-8859-1"),"utf-8");
			 String applicantUserId=new String(request.getParameter("sqid").getBytes("iso-8859-1"),"utf-8");
			 String applicantUserName=new String(request.getParameter("sqname").getBytes("iso-8859-1"),"utf-8");
			 String local=new String(request.getParameter("local").getBytes("iso-8859-1"),"utf-8");
			 String type=new String(request.getParameter("type").getBytes("iso-8859-1"),"utf-8");
			 int authorization=new Integer(request.getParameter("authorization"));
			 String system=new String(request.getParameter("system").getBytes("iso-8859-1"),"utf-8");
			 String address=new String(request.getParameter("address").getBytes("iso-8859-1"),"utf-8");
			 String version=new String(request.getParameter("version").getBytes("iso-8859-1"),"utf-8");
			 
			 String auditorUserId=new String(request.getParameter("shid").getBytes("iso-8859-1"),"utf-8");
			 String auditorUserName=new String(request.getParameter("shname").getBytes("iso-8859-1"),"utf-8");
			 String auditorTime=new String(request.getParameter("shtime").getBytes("iso-8859-1"),"utf-8");
			 Date auditorTime1=format.parse(auditorTime);
			 String reason=new String(request.getParameter("sqreason").getBytes("iso-8859-1"),"utf-8");
			 String remark=new String(request.getParameter("remark").getBytes("iso-8859-1"),"utf-8");
			 
			 String applicantTime=new String(request.getParameter("sqtime").getBytes("iso-8859-1"),"utf-8");
			 int probationLength=Integer.parseInt(request.getParameter("shichang"));
			//计算到期时间
			 Date currdate=format.parse(applicantTime);
			 Calendar ca=Calendar.getInstance();
			 ca.add(Calendar.DATE, probationLength);
			 currdate=ca.getTime();
			 String expirationTime=format.format(currdate);
			 Date expirationTime1=format.parse(expirationTime);
			 
			 //试用码生成
			 String url="http://192.168.0.2:5050/";
			 JSONObject params=new JSONObject();
			 
			 params.put("mJQM", machineCode);
			 params.put("mDays", probationLength);
			 params.put("mOpMan", auditorUserName);
			 params.put("mXMID", orderName);
			 params.put("command", "gettrialcode");
			 JSONObject jsonObject = httpUtil.doPost(url,params);
			 System.out.println(jsonObject.toString());
			 Object code=jsonObject.get("sn");
			 request.setAttribute("sn", code);
			 System.out.println(code);
			 
			 equipmentBean.setId(id);
			 equipmentBean.setOrdId(ordId);
			 equipmentBean.setXmName(xmName);
			 equipmentBean.setorderName(orderName);
			 equipmentBean.setCode(String.valueOf(code));
			 equipmentBean.setMachineCode(machineCode);
			 equipmentBean.setApplicantUserId(applicantUserId);
			 equipmentBean.setApplicantUserName(applicantUserName);
			 equipmentBean.setLocal(local);
			 equipmentBean.setType(type);
			 equipmentBean.setSystem(system);
			 equipmentBean.setAuthorization(authorization);
			 equipmentBean.setAddress(address);
			 equipmentBean.setVersion(version);
			 equipmentBean.setAuditorUserId(auditorUserId);
			 equipmentBean.setAuditorUserName(auditorUserName);
			 
			 equipmentBean.setAuditorTime(auditorTime1);
			 equipmentBean.setReason(reason);
			 equipmentBean.setProbationLength(probationLength);
			 equipmentBean.setExpirationTime(expirationTime1);
			 equipmentBean.setRemark(remark);
			 equipmentBean.setApplicantTime(format.parse(applicantTime));
			 
					applyBean.setState(state);
					applyBean.setShId(auditorUserId);
					applyBean.setShName(auditorUserName);
					applyBean.setShTime(auditorTime1);
					applyBean.setRemark(remark);
					applyBean.setExpirationTime(expirationTime1);
				 applyService.updateApply(applyBean);
				 System.out.println(applyBean.getState());
				 equipmentService.updateBytrialCode(equipmentBean);
				 return "error2";
			
		}
/*----------------------------------------------------------------------------------*/
		/*
		 *通过项目id查找
		 *查找项目下对应的所以设备
		 */
		
		@RequestMapping("findEquipmentBeanId.do")
		public String findEquipmentBeanId(@RequestParam(value="PageNum",defaultValue="1",required=true)Integer PageNum,@RequestParam(value="PageSize",defaultValue="10",required=true)Integer PageSize,HttpServletRequest request,HttpServletResponse response) throws Exception {
			
			String ordId=request.getParameter("ordId");
			String xmName=new String(request.getParameter("xmName").getBytes("iso-8859-1"),"utf-8");
			
			/*
			String name=new String(request.getParameter("name").getBytes("iso-8859-1"),"utf-8");
			String department=new String(request.getParameter("department").getBytes("iso-8859-1"),"utf-8");
			String zhiwu=new String(request.getParameter("zhiwu").getBytes("iso-8859-1"),"utf-8");*/
			
			
			PageHelper.startPage(PageNum, PageSize);
			PageHelper.orderBy("TC_AuditorTime desc");
			
			
			List<EquipmentBean> findEquipmentBeanId=equipmentService.findEquipmentBeanId(ordId);
			List<EquipmentBean> findByNew=equipmentService.findByNew(ordId);
			List<EquipmentBean> codeNotNull=equipmentService.codeNotNull(ordId);
			List<EquipmentBean> codeNull=equipmentService.codeNull(ordId);
			PageInfo<EquipmentBean> page=new PageInfo<EquipmentBean>(findEquipmentBeanId);
			
			for (EquipmentBean e : findByNew) {
				
				 String orderName=e.getorderName();//�豸id	
				 String machineCode=e.getMachineCode();//������
				 String code=e.getCode();				 
				 String local=e.getLocal();//ʹ�õص�
				 String type=e.getType();//�豸����
				int authorization=e.getAuthorization();
				 String system=e.getSystem();//����ϵͳ
				 String address=e.getAddress();//��ַ
				 String version=e.getVersion();//���ð汾
				 Date expirationTime=e.getExpirationTime();//����ʱ��
				 String auditorUserName=e.getAuditorUserName();
				 String applicantUserName=e.getApplicantUserName();
				 int probationLength=e.getProbationLength();
				 int state=e.getState();
				 
				 request.setAttribute("orderName", orderName);
				 request.setAttribute("code", code);
				 request.setAttribute("machineCode", machineCode);
				 request.setAttribute("local", local);
				 request.setAttribute("type", type);
				 request.setAttribute("authorization", authorization);
				 request.setAttribute("system", system);
				 request.setAttribute("address", address);
				 request.setAttribute("version", version);
				 request.setAttribute("expirationTime", expirationTime);
				 request.setAttribute("auditorUserName", auditorUserName);
				 request.setAttribute("applicantUserName", applicantUserName);
				 request.setAttribute("probationLength", probationLength);
				 request.setAttribute("state", state);
			}
			
			/*request.setAttribute("name", name);
			request.setAttribute("department", department);
			request.setAttribute("zhiwu", zhiwu);
			*/
			request.setAttribute("pageInfo", page);
			
			request.setAttribute("xmName", xmName);
			request.setAttribute("ordId", ordId);
			request.setAttribute("findByNew", findByNew);
			request.setAttribute("codeNotNull", codeNotNull);
			request.setAttribute("codeNull", codeNull);
			request.setAttribute("findEquipmentBeanId", findEquipmentBeanId);
			
			System.out.println(xmName);
			
			return "orderMainTrialCode";
		}
		
/*----------------------------------------邮箱-------------------------------------------------------------------*/
		
		/*
		 * //根据项目名称查询,到期提醒
		 */	
		@RequestMapping("findByOrdName.do")
		public String findByOrdName(@RequestParam(value="PageNum",defaultValue="1",required=true)Integer PageNum,@RequestParam(value="PageSize",defaultValue="10",required=true)Integer PageSize,HttpServletRequest request,HttpServletResponse response) throws Exception{
			PageHelper.startPage(PageNum, PageSize);
			PageHelper.orderBy("TC_AuditorTime desc");
			
			EquipmentBean equipmentBean=new EquipmentBean();
			
			String xmName=request.getParameter("xmName");
			if(xmName==null){
				xmName="";
				equipmentBean.setXmName(xmName);
				
				List<EquipmentBean> findByOrdName=equipmentService.findByOrdName(equipmentBean);
				PageInfo<EquipmentBean> page=new PageInfo<EquipmentBean>(findByOrdName);
				
				request.setAttribute("xmName", xmName);
				request.setAttribute("findByOrdName", findByOrdName);
				request.setAttribute("pageInfo", page);
				
			}else {
				
				String xmName1=new String(request.getParameter("xmName").getBytes("iso-8859-1"),"utf-8"); 
				equipmentBean.setXmName(xmName1);
				
				List<EquipmentBean> findByOrdName=equipmentService.findByOrdName(equipmentBean);
				PageInfo<EquipmentBean> page=new PageInfo<EquipmentBean>(findByOrdName);
				
				request.setAttribute("xmName", xmName1);
				request.setAttribute("findByOrdName", findByOrdName);
				request.setAttribute("pageInfo", page);
			}
			System.out.println("------------===========================================---------------");
			System.out.println("到期提醒列表的展示");
			equipmentService.updateByExpirationTimeByOther(equipmentBean);
			
			//试用时长还剩10天
			List<EquipmentBean> findByExpirationTimebyTen=equipmentService.findByExpirationTimebyTen();
			if(findByExpirationTimebyTen!=null){
				for (int i = 0; i < findByExpirationTimebyTen.size(); i++) {
					List<PersonBean> person=personService.sendEmail(findByExpirationTimebyTen.get(i).getAuditorUserId());
					for (int j = 0; j < person.size(); j++) {
						MessageVo mv = new MessageVo();
						mv.setSubject("试用码到期提醒");
						System.out.println(findByExpirationTimebyTen.get(i).getorderName());
							mv.setText("“"+findByExpirationTimebyTen.get(i).getorderName()+"”"+"的试用码即将到期，请及时处理");
							/*mv.setText("“"+findByExpirationTimebyTen.get(i).getorderName()+"”"+"的试用码即将到期，请及时处理");
						System.out.println("“"+findByExpirationTimebyTen.get(i).getorderName()+"”"+"的试用码即将到期，请及时处理");*/
						mv.setToMailAddress(person.get(j).getEmail());
						System.out.println("==================================");
						System.out.println(person.get(j).getEmail());
						System.out.println("===================================");
						EmailDemo.sendMail(mv);
						break;
					}
				}
				equipmentService.updateByExpirationTimeByTen(equipmentBean);
			}
			
			
					//试用时长还剩四天
			List<EquipmentBean> findByExpirationTimebyFour=equipmentService.findByExpirationTimebyFour();
					if(findByExpirationTimebyFour!=null){
						equipmentService.updateByExpirationTimeByFourByFalse(equipmentBean);
						for (int i = 0; i < findByExpirationTimebyFour.size(); i++) {
							List<PersonBean> person=personService.sendEmail(findByExpirationTimebyFour.get(i).getAuditorUserId());
							for (int j = 0; j < person.size(); j++) {
								MessageVo mv = new MessageVo();
								mv.setSubject("试用码到期提醒");
								System.out.println(findByExpirationTimebyFour.get(i).getorderName());
									mv.setText("“"+findByExpirationTimebyFour.get(i).getorderName()+"”"+"的试用码即将到期，请及时处理");
								System.out.println("“"+findByExpirationTimebyFour.get(i).getorderName()+"”"+"的试用码即将到期，请及时处理");
								mv.setToMailAddress(person.get(j).getEmail());
								System.out.println("-------------------------------------");
								System.out.println(person.get(j).getEmail());
								System.out.println("---------------------------------------");
								EmailDemo.sendMail(mv);
								/*equipmentService.updateByExpirationTimeByTen(equipmentBean);*/
								break;
							}
						}
						equipmentService.updateByExpirationTimeByFourByTrue(equipmentBean);
					}
			
			return "index";
		}
		
		
		
	
		//一键切换修改state
		@RequestMapping("updateState.do")
		public String updateState(EquipmentBean equipmentBean,HttpServletRequest request,HttpServletResponse response) throws UnsupportedEncodingException{

			String ordId=request.getParameter("ordId");
			String xmName=new String(request.getParameter("xmName").getBytes("iso-8859-1"),"utf-8");
			
			System.out.println(equipmentBean.toString());
				equipmentService.updateState(equipmentBean);

				request.setAttribute("ordId", ordId);
				request.setAttribute("xmName", xmName);
				
				return "changeError";
		}
}
