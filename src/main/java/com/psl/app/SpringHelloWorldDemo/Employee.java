package com.psl.app.SpringHelloWorldDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="emp")       //emp is bean id in xml
public class Employee {
	
	@Value(value="2")
 private int id;
	
	@Value(value="shweta")
 private String name;
	
	@Autowired
 private Address addr;
 
 public Employee(){
	 System.out.println("in defualt constroctor of employee");
 }
 public int getId() {
	return id;
}
public void setId(int id) {
	System.out.println("in setid");
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	System.out.println("in setname");

	this.name = name;
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	System.out.println("in setaddress");

	this.addr = addr;
}
public Employee(int id, String name, Address addr) {
	System.out.println("in param constroctor employee");
	this.id = id;
	this.name = name;
	this.addr = addr;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", addr=" + addr + "]";
}
public void abc(){
	System.out.println("in init abc");
}
public void pqr(){
	System.out.println("in destroy pqr");
}


}
