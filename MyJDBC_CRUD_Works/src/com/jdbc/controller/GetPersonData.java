package com.jdbc.controller;

import java.util.ArrayList;

import com.jdbc.dto.Person;
import com.jdbc.service.PersonService;

public class GetPersonData {

	public static void main(String[] args) {
		Person person=new Person();
		PersonService personservice=new PersonService();
		ArrayList<Person> li=personservice.getPersonDataService(person);
		while(li.size()>0) {
				System.out.println("Name of the person -->"+person.getName());
				System.out.println("Age of the person -->"+person.getAge());
				System.out.println("ID of the person -->"+person.getId());
				System.out.println("Email of the Person -->"+person.getEmail());
				System.out.println("Password of the person -->"+person.getPassword());
				System.out.println("------------------------------------");	
				
			
		}	
	}
}