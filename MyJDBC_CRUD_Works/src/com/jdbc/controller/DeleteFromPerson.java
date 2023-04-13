
 package com.jdbc.controller;

import com.jdbc.dto.Person;
import com.jdbc.service.PersonService;
import java.util.*;
public class DeleteFromPerson {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {
		Person person = new Person();
		PersonService personService= new PersonService();
		System.out.println("enter the id to delete person data");
		person.setId(scan.nextInt());
		personService.deleteDataFromPersonservice(person);
		System.out.println("data deleted");
	}

}
