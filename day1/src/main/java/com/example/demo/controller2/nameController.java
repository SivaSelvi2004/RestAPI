package com.example.demo.controller2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class nameController {
	String studentName="IamNeo!";
	@GetMapping("/neo")
	public String getName() {
		return "Welcome "+studentName;
	}
}
