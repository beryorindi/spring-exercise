package com.mitrais.spring;

public class Employee {
	public String gender, name;
	public String id;
	
	public Employee(String id, String name, String gender){
		this.name = name;
		this.gender = gender;
		this.id = id;
	}
	
	public Employee() {
		
	}

	public String getGender() {
		return gender;
	}
	
	public String getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	
}
