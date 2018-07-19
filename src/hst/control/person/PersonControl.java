package hst.control.person;

import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import hst.model.person.PersonBean;
import hst.service.person.PersonService;

@Controller
public class PersonControl {

	@Resource
	private PersonService personService;
	
	@RequestMapping("checkLogin.do")
	public String checkLogin(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws Exception {
		String name=request.getParameter("name");
		String pass=request.getParameter("pass");
		 if(name==null||pass==null){
			 return "loginError";
		 }
		Map<String,String> personmap=new HashMap<String,String>();
		/*鍔犲瘑*/
		MessageDigest md5 = MessageDigest.getInstance("MD5"); ;  
        char[] charArray = pass.toCharArray();  
        byte[] byteArray = new byte[charArray.length];  
 
        for (int i = 0; i < charArray.length; i++){
        	byteArray[i] = (byte) charArray[i]; 
        }  
             
        byte[] md5Bytes = md5.digest(byteArray);  
        StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < md5Bytes.length; i++){  
            int val = ((int) md5Bytes[i]) & 0xff;  
            if (val < 16){
            	hexValue.append("0"); 
            }  

            hexValue.append(Integer.toHexString(val));  
            
        }  
        String pass1=hexValue.toString();
		
		System.out.println("姓名"+name);
		System.out.println("密码"+pass1);//pass1
		personmap.put("name", name);
		personmap.put("pass", pass1);//pass1
		PersonBean person=personService.checkLogin(personmap);
		if(person!=null){
			if (name.equals(name)&&pass.equals(pass)) {
				
				System.out.println(person.getDepartment());
				System.out.println(person.getZhiwu());
				
				
				session.setAttribute("department", person.getDepartment());
				session.setAttribute("zhiwu", person.getZhiwu());
				session.setAttribute("person", person);
				if(person.getSex().equals("男")){
					String sex="0";
					
					session.setAttribute("sex", sex);
				}else{
					String sex="1";
					session.setAttribute("sex", sex);
				}
				
				return "frame";
			}else{
				
				return "loginError";
			}
				
			
			
		}
		else {
			
			return "loginError";
		}
	}
	
	@RequestMapping(value="tologin.do")
    public String tologin(HttpServletRequest request,HttpServletResponse response) throws Exception {
		return "login";
    }

}
