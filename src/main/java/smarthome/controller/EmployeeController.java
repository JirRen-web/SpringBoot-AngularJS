package smarthome.controller;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import smarthome.model.Employee;
import smarthome.service.EmployeeService;
//<!-- 6 -->
@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@RequestMapping("/add")
	@ResponseBody
	public Employee addEmploee(String name,String date,String salary,String ssn){
		Employee employee=new Employee();
		DateTimeFormatter d=new DateTimeFormatterBuilder().appendPattern("dd/MM/yyyy").toFormatter();
		employee.setJoiningDate(LocalDate.parse((CharSequence)date,d));
		employee.setName(name);
		employee.setSalary(new BigDecimal(salary));
		employee.setSsn(ssn);
		service.saveEmployee(employee);
		return employee;
	}
	@RequestMapping("/list")
	@ResponseBody
	public List<Employee>  listEmployees(){
		List<Employee> employees = service.findAllEmployees();
		return employees;
	}
}
