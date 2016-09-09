package com.psl.app.dao;

import java.util.List;

import com.psl.app.SpringHelloWorldDemo.Employee;

public interface IEmployeeDAO {

	List<Employee> getAllEmployeees();
	void addEmployee(Employee e);
	
	
}
