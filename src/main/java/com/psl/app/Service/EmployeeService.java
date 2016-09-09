package com.psl.app.Service;


import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.psl.app.SpringHelloWorldDemo.Employee;
import com.psl.app.dao.IEmployeeDAO;


public class EmployeeService {
	
	private IEmployeeDAO dao;
	public IEmployeeDAO getDao() {
		return dao;
	}

	public void setDao(IEmployeeDAO dao) {
		this.dao = dao;
	}

	public List<Employee> getAllEmployeees() {
		return dao.getAllEmployeees();
		// TODO Auto-generated method stub
		
	}

	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		dao.addEmployee(e);
	}


	
	
}
