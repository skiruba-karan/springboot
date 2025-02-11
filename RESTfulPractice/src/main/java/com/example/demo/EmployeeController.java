package com.example.demo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

	private final AtomicLong employeeIdCounter = new AtomicLong();
	   @GetMapping("/employee")
	    public Employee getEmployee(@RequestParam(value = "name", defaultValue = "John") String name) {
	        // For simplicity, setting a default role for employees
	        String role = "Software Engineer"; 
	        
	        // Returning Employee details
	        return new Employee(employeeIdCounter.incrementAndGet(), name, role);
	    }
	
}
