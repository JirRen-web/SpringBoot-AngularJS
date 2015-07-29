package smarthome.service;

import java.util.List;

import smarthome.model.Employee;


public interface EmployeeService {

	void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployees(); 
	
	void deleteEmployeeBySsn(String ssn);
}
