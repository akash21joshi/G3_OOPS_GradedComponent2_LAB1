package com.greatlearning.credentials;
import com.greatlearning.employee.EmployeeDetails;

public interface CredentialService {
	
	public String generateEmail(EmployeeDetails employee);
	public String generatePassword();
	public String showCredentials(EmployeeDetails employee);

}
