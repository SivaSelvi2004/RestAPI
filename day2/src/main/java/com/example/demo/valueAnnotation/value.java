package com.example.demo.valueAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {
	@Value("${greeting.message}")
	private String s;
	@RequestMapping("/value")
	public String display() {
		return s;
	}
}
