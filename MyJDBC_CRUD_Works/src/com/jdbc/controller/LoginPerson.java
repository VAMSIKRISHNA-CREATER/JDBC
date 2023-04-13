package com.jdbc.controller;

import com.jdbc.service.PersonService;
import java.util.*;
public class LoginPerson {
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		PersonService personService= new PersonService();
			System.out.println("Enter the email");
			String email=scan.next();
			System.out.println("Enter the password");
			String password=scan.next();
			if(personService.loginService(email,password)!=null) {
				System.out.println("Login Successful");
				
			}
			else {
				System.out.println("plz check email and password");
			}
			
		}

	}





