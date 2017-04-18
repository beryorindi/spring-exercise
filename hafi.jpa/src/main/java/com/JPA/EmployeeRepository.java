package com.JPA;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;


public interface EmployeeRepository extends PagingAndSortingRepository<Employee,Long>
{
	public List<Employee> findByLastName(@Param(value = "lastName") String lastName);
	
	public List<Employee> findByFirstName(String firstName);
}