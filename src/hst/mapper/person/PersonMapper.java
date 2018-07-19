package hst.mapper.person;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import hst.model.person.PersonBean;

public interface PersonMapper {
	public PersonBean checkLogin(Map<String,String> person);
	public PersonBean check(String name);
	public List<PersonBean> sendEmail(String jobId);
	public List<PersonBean> listPerson(@Param("department") String department,@Param("zhiwu") String zhiwu);
	public List<PersonBean> selectPerson(String name);
}
