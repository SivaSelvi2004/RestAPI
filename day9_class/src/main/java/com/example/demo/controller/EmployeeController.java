package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepo;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeRepo empRepository;
	
	@PostMapping("/employee")
	public ResponseEntity<String> saveEmployees(@RequestBody Employee empData){
		empRepository.save(empData);
		return ResponseEntity.ok("Data saved");
	}
	
	@GetMapping("employee")
	public List<Employee> getEmployees(){
		return empRepository.findAll();
	}
}
