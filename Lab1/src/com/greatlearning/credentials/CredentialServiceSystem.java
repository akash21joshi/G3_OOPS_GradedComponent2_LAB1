package com.greatlearning.credentials;

import java.util.Random;

import com.greatlearning.employee.EmployeeDetails;

public class CredentialServiceSystem implements CredentialService {
	private static final String COMPANY_DOMAIN = ".gl.in" ;
	private static final int PASSWORD_SIZE = 8 ;
	
	public String generateEmail(EmployeeDetails employee) {
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String department = employee.getDepartment();
		return firstName+lastName+'@'+department+COMPANY_DOMAIN;
	}
	public String generatePassword() {
		String capitalCase = "ABCDEFGHIJKLMNOPQRST";
		String lowerCase = capitalCase.toLowerCase();
		String nums = "123456789";
		String splChars = "@#$%&_";
		String passChar = capitalCase + lowerCase + nums + splChars;
		String password = "";
		
		Random random = new Random();
		
		for (int i = 0; i< PASSWORD_SIZE; i++) {
			password = password + passChar.charAt(random.nextInt(passChar.length()));
		}
		return password;
				
				
	}
	public String showCredentials(EmployeeDetails employee) {
		
		System.out.println("Hi, " + employee.getFirstName()+ " your crendentials are as follows :");
		System.out.println("email is, " + employee.getEmail());
		System.out.println("email is, " + employee.getPassword());
		return null;
	}
	
	
	
	
	

}
