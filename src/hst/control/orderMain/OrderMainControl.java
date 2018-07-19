package hst.control.orderMain;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import hst.email.EmailDemo;
import hst.email.MessageVo;
import hst.model.orderMain.OrderMainBean;
import hst.service.orderMain.OrderMainService;

@Controller
public class OrderMainControl {
	@Resource
	private OrderMainService orderMainService;
	
	@RequestMapping("findOrderMain1.do")
	public String findOrderMain1(@RequestParam(value="PageNum",defaultValue="1",required=true)Integer PageNum,@RequestParam(value="PageSize",defaultValue="10",required=true)Integer PageSize, HttpServletRequest request,HttpServletResponse response){
		PageHelper.startPage(PageNum, PageSize);
		PageHelper.orderBy("F_OrdID desc");
		List<OrderMainBean> findOrderMain=orderMainService.findOrderMain();
		PageInfo<OrderMainBean> page=new PageInfo<OrderMainBean>(findOrderMain);
		/*PageInfo pageInfo=new PageInfo(findOrderMain);*/
		request.setAttribute("pageInfo", page);
		request.setAttribute("findOrderMain", findOrderMain);
		return "orderMain";
	}
	//项目表的模糊查询
	@RequestMapping("select.do")
			public String select(@RequestParam(value="PageNum",defaultValue="1",required=true)Integer PageNum,@RequestParam(value="PageSize",defaultValue="10",required=true)Integer PageSize, HttpServletRequest request,HttpServletResponse response) throws Exception{
				PageHelper.startPage(PageNum, PageSize);
				PageHelper.orderBy("F_OrdID desc");
				
				OrderMainBean orderMain=new OrderMainBean();
				
				String ordId=request.getParameter("ordId");
				String cliname=request.getParameter("cliName");
				String xmName=request.getParameter("ordName");
				
				if(ordId==null){
					ordId="";
				}
				if (cliname==null) {
					cliname="";
				}
				if(xmName==null){
					xmName="";
				}
				String ordId1=new String(ordId.getBytes("iso-8859-1"),"utf-8");
				String xmName1=new String(xmName.getBytes("iso-8859-1"),"utf-8");
				String cliname1=new String(cliname.getBytes("iso-8859-1"),"utf-8");
				orderMain.setOrdId(ordId1);
				orderMain.setCliname(cliname1);
				orderMain.setXmName(xmName1);
				
				List<OrderMainBean> select=orderMainService.select(orderMain);
				PageInfo<OrderMainBean> pageInfo=new PageInfo<OrderMainBean>(select);
				
				
				
				request.setAttribute("ordId", ordId1);
				request.setAttribute("cliname", cliname1);
				request.setAttribute("xmName", xmName1);
				request.setAttribute("select", select);
				request.setAttribute("pageInfo", pageInfo);
				return "orderMain";
				
			}
}
