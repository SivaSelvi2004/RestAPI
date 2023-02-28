package com.example.demo.pcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pchild.Child;
import com.example.demo.pservice.ChildService;

@RestController
@RequestMapping("/child")
public class ChildController {
	@Autowired
	ChildService service;
	
	@PostMapping("")
	public boolean add(@RequestBody Child child) {
		return service.addChild(child);
	}
	
	@GetMapping("/{field}")
	public List<Child> getSorted(@PathVariable String field){
		return service.getSortedChild(field);
	}
	
	@GetMapping("/{offset}/{pagesize}")
	public List<Child> getPagination(@PathVariable int offset,@PathVariable int pagesize){
		return service.getPaginationChild(offset,pagesize);
	}
	
	@GetMapping("/{offset}/{pagesize}/{field}")
	public List<Child> getSortedPagination(@PathVariable int offset,@PathVariable int pagesize,@PathVariable String field){
		return service.getSortedPaginationChild(offset,pagesize,field);
	}
	
}
