package com.greatlearning.employee;

public class EmployeeDetails {
	public EmployeeDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	private static String firstName;
	private static String lastName;
	public static String department;
	private static String password;
	private static String email;
	
	public EmployeeDetails(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public static String getFirstName() {
		return firstName;
	}
	
	public static String getLastName() {
		return lastName;
	}
	
	public static String getDepartment() {
		return department;
	}
	public static void setDepartment(String department) {
		EmployeeDetails.department = department;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		EmployeeDetails.password = password;
	}
	public static String getEmail() {
		return email;
	}
	public static void setEmail(String email) {
		EmployeeDetails.email = email;
	}
	

}
