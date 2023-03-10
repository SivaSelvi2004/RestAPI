package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepo;

@RestController
public class AddressController {
	@Autowired
	private AddressRepo addRepository;
	
	@GetMapping("/address")
	public List<Address> getEmployees(){
		return addRepository.findAll();
	}
}
