package com.JPA;

import java.util.AbstractMap;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    
   /* @RequestMapping(value = "employees/{empId}/score", method = RequestMethod.GET)
    AbstractMap.SimpleEntry<String, Double> getEmployeeByFilter(@PathVariable long empId) {
        Employee employee = verifyEmployee(empId);
        double result = employeeService.calculateScore(employee);
        return new AbstractMap.SimpleEntry<String, Integer>("score", result);
    }*/
}
