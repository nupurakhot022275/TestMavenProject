package com.psl.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.psl.app.SpringHelloWorldDemo.Employee;

public class EmployeeDAOImplementation implements IEmployeeDAO{
private JdbcTemplate template;
	public JdbcTemplate getTemplate() {
	return template;
}

public void setTemplate(JdbcTemplate template) {
	this.template = template;
}

	public List<Employee> getAllEmployeees() {
		// TODO Auto-generated method stub
	return template.query("select * from employee" , new RowMapper<Employee>() {

	public Employee mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
    Employee e=new Employee();
    e.setId(rs.getInt("id"));
    e.setName(rs.getString("name"));
    return e;
	}
			
		});
	}

	public void addEmployee(Employee e) {
		// TODO Auto-generated method stub
		String sql="insert into employee(id, name) values(" + e.getId()+",'" +e.getName()+"')";
		//template.update(sql);
		
		String sql1="update employee set email='nupurakhot@gmail.com' where id = "+e.getId();
		//template.update(sql1);
		
		String sql2="delete from employee where id="+e.getId();
		template.update(sql2);
	}

}
