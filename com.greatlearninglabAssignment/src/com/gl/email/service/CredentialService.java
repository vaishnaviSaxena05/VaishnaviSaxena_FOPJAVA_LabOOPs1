package com.gl.email.service;


import java.util.Random;

import com.gl.email.model.Employee;

public class CredentialService {
	public char[] generatePassword(){
		String caps = "ABCDEFGHIJKLMPQRSTUVWXYZ";
		String lowerCase = "abcdefghijklmpqurstuvwxyz";
		String number = "0123456789";
		String special = "!@#$%^&*()_+";
		String bigString = caps+lowerCase+number+special;
		Random ramdom = new Random();
		char [] password = new char[8];
		for (int i=0;i<8;i++) {
			password[i]= bigString.charAt(ramdom.nextInt(bigString.length()));
		}
		return password;
	}

	public String generateEmailAddress(String firstName, String lastName , String Department  ){
		 return firstName+lastName+"@"+Department+".gl.com";
	}



	public void showCredentials(Employee emp, String email, char[] password){
		System.out.println("Dear "+emp.getFirstName()+", your generated credentials are as follows:- ");
		System.out.println("Email: "+email);
		String str = String.valueOf(password);
		System.out.println("Password: "+str);
		
	}

}
