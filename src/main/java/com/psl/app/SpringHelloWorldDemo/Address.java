package com.psl.app.SpringHelloWorldDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component(value="addr")
public class Address {
	@Value(value="nagpur")
 private String city;
	@Value(value="FC Rd")
 private String street;
	@Value(value="411033")
 private String zip;
 
 public Address(){
	 System.out.println("in default construotor of address");
 }
public String getCity() {
	return city;
}

public void setCity(String city) {
	System.out.println("in city");
	this.city = city;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	System.out.println("in setstreet");
	this.street = street;
}
public String getZip() {
	return zip;
}
public void setZip(String zip) {
	System.out.println("in setzip");
	this.zip = zip;
}
public Address(String city, String street, String zip) {
	System.out.println("in param constroctor of address");

	this.city = city;
	this.street = street;
	this.zip = zip;
}
@Override
public String toString() {
	return "Address [city=" + city + ", street=" + street + ", zip=" + zip
			+ "]";
}

 
}
