package hst.service.person.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import hst.mapper.person.PersonMapper;
import hst.model.person.PersonBean;
import hst.service.person.PersonService;
@Service("personService")
public class PersonServiceImpl implements PersonService{

	@Resource
	private PersonMapper personMapper;

	@Override
	public PersonBean checkLogin(Map<String, String> person) {
		// TODO Auto-generated method stub
		PersonBean personBean=personMapper.checkLogin(person);
		
		System.out.println(personBean);
		return personBean;
	}

	@Override
	public PersonBean check(String name) {
		// TODO Auto-generated method stub
		PersonBean person=personMapper.check(name);
		return person;
	}

	@Override
	public List<PersonBean> sendEmail(String jobId) {
		// TODO Auto-generated method stub
		List<PersonBean> person=personMapper.sendEmail(jobId);
		return person;
	}

	@Override
	public List<PersonBean> listPerson(@Param("department") String department,@Param("zhiwu") String zhiwu){
		// TODO Auto-generated method stub
		List<PersonBean> listPerson=personMapper.listPerson(department, zhiwu);
		return listPerson;
	}


	

}
