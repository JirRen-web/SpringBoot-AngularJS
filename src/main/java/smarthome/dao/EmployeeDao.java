package smarthome.dao;

import java.util.List;

import smarthome.model.Employee;

//<!-- 6 -->
public interface EmployeeDao {

	void saveEmployee(Employee employee);
	
	List<Employee> findAllEmployees();
	
	void deleteEmployeeBySsn(String ssn);
}
