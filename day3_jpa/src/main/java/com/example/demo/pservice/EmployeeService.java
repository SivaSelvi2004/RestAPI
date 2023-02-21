package com.example.demo.pservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pemployee.Employee;
import com.example.demo.prepository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository repository;
	
	public boolean addEmployee(Employee employee) {
		repository.save(employee);
		return true;
	}
	
	public List<Employee> getEmployee(){
		return repository.findAll();
	}
	
	public Optional<Employee> getEmployeeById(int id){
		return repository.findById(id);
	}
}
