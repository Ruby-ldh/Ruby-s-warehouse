package hst.control.apply;

import java.text.ParseException;
import java.text.SimpleDateFormat;
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

import hst.model.apply.ApplyBean;
import hst.service.apply.ApplyService;

@Controller
public class ApplyControl {

	@Resource
	private ApplyService applyService;
	
	@RequestMapping("listApply.do")
	public String listApply(HttpServletRequest request,HttpServletResponse response){
		
		List<ApplyBean> listApply=applyService.listApply();

		request.setAttribute("listApply", listApply);
		return "applyList";
	}
	
	@RequestMapping("addApply.do")
	public String addApply(HttpServletRequest request,HttpServletResponse response) throws ParseException, Exception {
		ApplyBean applyBean=new ApplyBean();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		
		int id=new Integer(request.getParameter("id"));
		int state=new Integer(request.getParameter("state"));
		 //项目id
		String ordId=new String(request.getParameter("ordId").getBytes("iso-8859-1"),"utf-8");
		 String ordName=new String(request.getParameter("xmName").getBytes("iso-8859-1"),"utf-8");//项目名
		 String orderName=new String(request.getParameter("orderName").getBytes("iso-8859-1"),"utf-8");//设备编号
		 String machineCode=new String(request.getParameter("machineCode").getBytes("iso-8859-1"),"utf-8");//机器码
		 String sqId=new String(request.getParameter("sqid").getBytes("iso-8859-1"),"utf-8");//申请人id
		 String sqName=new String(request.getParameter("sqname").getBytes("iso-8859-1"),"utf-8");//申请人名
		 String sqReason=new String(request.getParameter("sqreason").getBytes("iso-8859-1"),"utf-8");//申请理由
		 Date sqTime=sdf.parse(request.getParameter("sqtime"));//申请时间
		 
		 String local=new String(request.getParameter("local").getBytes("iso-8859-1"),"utf-8");//地点
		 String type=new String(request.getParameter("type").getBytes("iso-8859-1"),"utf-8");//类型
		 int authorization=new Integer(request.getParameter("authorization"));//是否授权
		
		 String system=new String(request.getParameter("system").getBytes("iso-8859-1"),"utf-8");//系统
		 String address=new String(request.getParameter("address").getBytes("iso-8859-1"),"utf-8");//地址
		 String version=new String(request.getParameter("version").getBytes("iso-8859-1"),"utf-8");//版本
			
			
			 applyBean.setOrdId(ordId);
			 applyBean.setOrdName(ordName);
			 applyBean.setOrderName(orderName);
			 applyBean.setMachineCode(machineCode);
			 applyBean.setSqId(sqId);
			 applyBean.setSqName(sqName);
			 applyBean.setSqReason(sqReason);
			 applyBean.setSqTime(sqTime);
			 applyBean.setLocal(local);
			 applyBean.setType(type);
			 applyBean.setAuthorization(authorization);
			 applyBean.setSystem(system);
			 applyBean.setAddress(address);
			 applyBean.setVersion(version);
			 applyBean.setId(id);
			 applyBean.setState(state);
				 
				 applyService.addApply(applyBean);
				 
				 return "error1";
			
		
	}
	
	//根据申请id，查找申请数据，前往审核表单
	@RequestMapping("findByMachineCode.do")
	public String findByMachineCode(HttpServletRequest request,HttpServletResponse response){
		int applyId=new Integer(request.getParameter("id"));
		
		ApplyBean applyBean=applyService.findByMachineCode(applyId);
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String sqtime=sdf.format(applyBean.getSqTime());
		
		request.setAttribute("applyBean", applyBean);
		request.setAttribute("sqtime", sqtime);
		return "audit";
	}
	
	
	//遍历某个特定设备下的试用码申请记录
	@RequestMapping("listApplyByOrderName.do")
		public String listApplyByOrderName(@RequestParam(value="PageNum",defaultValue="1",required=true)Integer PageNum,@RequestParam(value="PageSize",defaultValue="10",required=true)Integer PageSize,HttpServletRequest request,HttpServletResponse response) throws Exception{
		PageHelper.startPage(PageNum, PageSize);
		PageHelper.orderBy("shTime desc");
		
		int id=new Integer(request.getParameter("id"));
		String ordId=new String(request.getParameter("ordId").getBytes("iso-8859-1"),"utf-8");
		String xmName=new String(request.getParameter("xmName").getBytes("iso-8859-1"),"utf-8");
			List<ApplyBean> listApplyByOrderName=applyService.listApplyByOrderName(id);
			PageInfo<ApplyBean> page=new PageInfo<ApplyBean>(listApplyByOrderName);
			request.setAttribute("listApplyByOrderName", listApplyByOrderName);
			request.setAttribute("pageInfo", page);
			request.setAttribute("ordId", ordId);
			request.setAttribute("xmName", xmName);
			return "applicationRecord";
		}
	
	//某人的申请记录
	@RequestMapping("findByIdApply.do")
	public String findByIdApply(@RequestParam(value="PageNum",defaultValue="1",required=true)Integer PageNum,@RequestParam(value="PageSize",defaultValue="10",required=true)Integer PageSize,HttpServletRequest request,HttpServletResponse response){
		PageHelper.startPage(PageNum, PageSize);
		
		
		String sqId=request.getParameter("sqId");
		List<ApplyBean> findByIdApply=applyService.findByIdApply(sqId);
		PageInfo<ApplyBean> page=new PageInfo<ApplyBean>(findByIdApply);
		request.setAttribute("findByIdApply", findByIdApply);
		request.setAttribute("pageInfo", page);
		return "applicationHistory";
	}
}
