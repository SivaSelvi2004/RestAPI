package com.example.demo.controller3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class colorController {
	String yourFavColor="Green";
	@GetMapping("/color")
	public String getMyFav() {
		return "My favourite color is "+yourFavColor;
	}
}
