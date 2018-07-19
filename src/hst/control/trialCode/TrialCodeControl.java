package hst.control.trialCode;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import hst.control.person.PersonControl;
import hst.model.equipment.EquipmentBean;
import hst.model.orderMain.OrderMainBean;
import hst.model.person.PersonBean;
import hst.service.apply.ApplyService;
import hst.service.equipment.EquipmentService;
import hst.service.orderMain.OrderMainService;
import hst.service.person.PersonService;
import hst.service.trialCode.TrialCodeService;
import hst.util.HttpUtil;
@Controller
public class TrialCodeControl {

	@Resource
	private OrderMainService orderMainService;
	@Resource
	private EquipmentService equipmentService;
	@Resource
	private TrialCodeService trialCodeService;
	@Resource
	private PersonService personService;
	@Resource
	private HttpUtil httpUtil;
	@Resource
	private ApplyService applyService;
	@Resource
	private PersonControl personControl;
	
	
	

/*--------------------------------------------������--------------------------------------------------------------------*/
	@RequestMapping("findOrderMain.do")
	public String findOrderMain(Model model,HttpServletRequest request,HttpServletResponse response,@Param("department") String department,@Param("zhiwu") String zhiwu) throws Exception {
		List<OrderMainBean> orderMain=orderMainService.findOrderMain();
		String ordId=new String(request.getParameter("ordId").getBytes("iso-8859-1"),"utf-8");
		String xmName=new String(request.getParameter("xmName").getBytes("iso-8859-1"),"utf-8");
		
		/*String xmName=new String(request.getParameter("xmName").getBytes("ISO-8859-1"),"UTF-8");*/
		List<PersonBean> listPerson=personService.listPerson(department, zhiwu);
		request.setAttribute("listPerson", listPerson);
		request.setAttribute("ordId", ordId);
		request.setAttribute("xmName", xmName);
		
		model.addAttribute("orderMain", orderMain);
		
		
		return "addEquipment";
	}
	@RequestMapping(value="findEquipmentBeanId.do/{ordId}",method=RequestMethod.GET)
	@ResponseBody
	public Object findEquipmentBeanId(@PathVariable("ordId") String ordId,Model model) {
		List<EquipmentBean> equipment=equipmentService.findEquipmentBeanId(ordId);
		
		return equipment;
	}

	
/*-----------------------------------------------根据设备id查找，申请试用码----------------------------------------------------------------------------*/

	
	@RequestMapping(value="findByorderName.do")
	public String findByorderName(HttpServletRequest request,HttpServletResponse response,Model m) throws Exception{
		int id=new Integer(request.getParameter("id"));
		
		List<EquipmentBean> findByorderName=equipmentService.findByorderName(id);
		for (EquipmentBean list:findByorderName){
			String ordId=list.getOrdId();//项目id
			 String xmName=list.getXmName();//项目名
			 String machineCode=list.getMachineCode();//机器码
			 String local=list.getLocal();//使用地点
			 String type=list.getType();//类型
			 int authorization=list.getAuthorization();//是否授权
			 String system=list.getSystem();//系统
			 String address=list.getAddress();//地址
			 String version=list.getVersion();//���ð汾
			 Date expirationTime=list.getExpirationTime();//����ʱ��
			 int state=list.getState();//审核状态
			 String OrderName=list.getorderName();
				 
			 request.setAttribute("id", id);
			 request.setAttribute("ordId", ordId);
			 request.setAttribute("xmName", xmName);
			 request.setAttribute("machineCode", machineCode);
			 request.setAttribute("local", local);
			 request.setAttribute("type", type);
			 request.setAttribute("authorization", authorization);
			 request.setAttribute("system", system);
			 request.setAttribute("address", address);
			 request.setAttribute("version", version);
			 request.setAttribute("expirationTime", expirationTime);
			 request.setAttribute("state", state);
			 request.setAttribute("OrderName", OrderName);
		}
		request.setAttribute("findByorderName", findByorderName);
		
		return "apply";
	}
	

}
