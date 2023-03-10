package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

import com.example.demo.model.Baby;
import com.example.demo.service.BabyService;

import io.swagger.v3.oas.annotations.Operation;

@RestController 
public class BabyController {
	@Autowired
	BabyService service;
	
	@Operation(summary="Create a new data")
	@ApiResponses (value= {@ApiResponse(responseCode="201",description="created successfully"),
			@ApiResponse(responseCode="400",description="data is invalid"),
			@ApiResponse(responseCode="401",description="invalid credentials")
	})
	@ResponseStatus(HttpStatus.CREATED)
	
	@PostMapping(value="/baby", produces="application/json", consumes="application/json" )
	public boolean create(@RequestBody Baby baby) {
		return service.addBaby(baby);
	}
	
	@GetMapping("/baby/{field}")
	public List<Baby> getSorted(@PathVariable String field){
		return service.getBabySorted(field);
	}
	
	@GetMapping("/baby/{offset}/{pagesize}")
	public List<Baby> getWithPagination(@PathVariable int offset,@PathVariable int pagesize){
		return service.getBabyWithPagination(offset,pagesize);
	}
	
	@GetMapping("/baby/{offset}/{pagesize}/{field}")
	public List<Baby> getWithSortedPagination(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field){
		return service.getBabyWithPaginationAndSorting(offset, pagesize, field);
	}

}