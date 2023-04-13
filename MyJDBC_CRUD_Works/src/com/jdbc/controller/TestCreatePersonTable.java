package com.jdbc.controller;

import com.jdbc.service.PersonService;

public class TestCreatePersonTable {

	public static void main(String[] args) {
		PersonService personService= new PersonService();
		
		personService.createPersonTableService();
		System.out.println("table  Created");

	}

}
