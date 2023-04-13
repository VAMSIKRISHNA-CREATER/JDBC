package com.jdbc.service;

import java.util.ArrayList;

import com.jdbc.dao.PersonDao;
import com.jdbc.dto.Person;
public class PersonService {	
	PersonDao personDao=new PersonDao();
	
	public void createPersonTableService() {
		personDao.createPersonTable();
	}
	public int insertIntoPersonTableService(Person person) {
		return personDao.insertData(person);
	}
	public int updatePersonTableService(Person person) {
		return personDao.updateData(person);
	}
	public ArrayList<Person> getPersonDataService(Person person) {	
		return personDao.getPersonData(person);
		
	}
	public void deleteDataFromPersonservice(Person person) {
		personDao.deleteDataFromPerson(person);
	}
	public Person loginService(String email,String password1) {
		 return personDao.login(email,password1);
	}
}
