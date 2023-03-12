package com.greatlearning.driver;

import java.util.Scanner;

import com.greatlearning.credentials.CredentialServiceSystem;
import com.greatlearning.employee.EmployeeDetails;

public class Drivar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee first name : ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter employee last name : ");
		String lastName = sc.nextLine();
		
		
		System.out.println("Enter employee last name");
		
		EmployeeDetails emp = new EmployeeDetails(firstName,lastName);
		CredentialServiceSystem system = new CredentialServiceSystem();
		System.out.println("Please select the department");
		System.out.println("1: Technical");
		System.out.println("2: Admin");
		System.out.println("3: Human Resource");
		System.out.println("4: Legal");
		
		int choice = sc.nextInt();
		String department = "null";
		switch(choice) {
		case 1:
			department = "tech";
			break;
		case 2:
			department = "admin";
			break;
		case 3:
			department = "hr";
			break;
		case 4:
			department = "legal";
			break;
		default:
			System.out.println("Please select valid options");
			
		}
		
		if (department != "null") {
			EmployeeDetails.setDepartment(department);
		}
		
		String email = system.generateEmail(emp);
		emp.setEmail(email);
		String password = system.generatePassword();
		emp.setPassword(password);
		
		system.showCredentials(emp);

	}

}
