package com.example.demo.pservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pcustomer.Customer;
import com.example.demo.prepository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository repository;
	
	public String addCustomer(Customer customer) {
		repository.save(customer);
		return "Added";
	}
	
	public List<Customer> getCustomer(){
		return repository.findAll();
	}
	
	public Optional<Customer> getCustomerById(int id){
		return repository.findById(id);
	}
	
	public String updateCustomer(Customer customer) {
		repository.save(customer);
		return "Updated";
	}
	
	public String deleteCustomerById(int id) {
		repository.deleteById(id);
		return "Customer deleted";
	}
}
