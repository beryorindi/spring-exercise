package com.JPA;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Autowired
	private EmployeeRepository repository;
	
	@Bean
	public CommandLineRunner printAll(ApplicationContext ctx){
		return args -> {
			Employee e = new Employee("Bery","Orindi","male", Date.valueOf("1994-12-23"));
			repository.save(e);
		};
	}
		
}
