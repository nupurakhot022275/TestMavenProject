package com.psl.app.SpringHelloWorldDemo;



import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.psl.app.Service.EmployeeService;
import com.psl.app.aop.Performer;

public class Client {

	private static EmployeeService service;
	
	public EmployeeService getService() {
		return service;
	}

	public void setService(EmployeeService service) {
		this.service = service;
	}

	public static void main(String[] args){
		
		
		
		//spring container initialization 
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("config1.xml");
		
		//get beans
//	Employee e=(Employee)context.getBean("emp");
//		
		//invoking busineess logic
//		System.out.println(e.toString());
		//context.registerShutdownHook();
//		context.registerShutdownHook();
//		System.out.println("In client add employee flow");
//	//	service.addEmployee(e);
//		System.out.println("Done with employee adding");
//		
//		System.out.println("In get employees");
//		List<Employee> list=service.getAllEmployeees();
//		for(Employee employee: list){
//			System.out.println(" ~ " + employee.getId() +" ~ " +employee.getName());
//		}
//		
//	}
	
//	public void call(Employee e){
//		service.addEmployee(e);
//	}
		
		
		
		
		Performer p=(Performer) context.getBean("performer");
		p.peform();
}
}
