package com.jdbc.controller;

import java.util.Scanner;

import com.jdbc.dto.Person;
import com.jdbc.service.PersonService;

public class InsertPersonDataController {
	static Scanner scan =new Scanner(System.in);
	public static void main(String[] args) {

		PersonService personService= new PersonService();
		System.out.println("Enter no.of Records to enter  :  ");
		int rec = scan.nextInt();
		for (int i = 0; i < rec; i++) {
			Person person=new Person();
			System.out.println("enter id");
			person.setId(scan.nextInt());
			System.out.println("enter name");
			person.setName(scan.next());
			System.out.println("enter age");
			person.setAge(scan.nextInt());
			System.out.println("enter email");
			person.setEmail(scan.next());
			System.out.println("enter password");
			person.setPassword(scan.next());
			int r=personService.insertIntoPersonTableService(person);
			if(r<=1) {
				System.out.println("data saved");
			}
			else {
				System.out.println("data not saved");
			}

		}
		

	}

}
