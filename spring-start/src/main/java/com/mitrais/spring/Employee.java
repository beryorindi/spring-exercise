package com.mitrais.spring;

public class Employee {
	public String gender, name;
	
	public Employee(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	
	public Employee() {
		
	}

	public String getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}
	
	
}
