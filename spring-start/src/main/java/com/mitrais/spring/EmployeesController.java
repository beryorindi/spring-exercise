package com.mitrais.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeesController {
	private List<Employee> list = new ArrayList<Employee>();
	private List<Employee> emp = new ArrayList<Employee>();;
	
	public EmployeesController(){
		list.add(new Employee("Hendra","male"));
		list.add(new Employee("Gita","female"));
		list.add(new Employee("Bery","male"));
		list.add(new Employee("Amalia","female"));
	}
	
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	@ResponseBody
	public List<Employee> getMethod(@RequestParam (value="gender", defaultValue="none") String gender) {
		for(Employee x : list){
			if(x.getGender().equals(gender)){
				this.emp.add(x);
			}
		}
		return this.emp;
	}
	
	@RequestMapping(value="/employees", method=RequestMethod.POST)
	@ResponseBody
	public Employee postMethod(@RequestBody Employee employee) {
		this.list.add(employee);
	    return employee;
	}
	    
}
