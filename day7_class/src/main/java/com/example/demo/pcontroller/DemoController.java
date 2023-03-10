package com.example.demo.pcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pdemo.Demo;
import com.example.demo.prepository.DemoRepository;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired 
	DemoRepository repository;
	
	@PostMapping("")
	public String add(@RequestBody Demo demo) {
		repository.save(demo);
		return "Added";
	}
	
	@GetMapping("")
	public List<Demo> getAll(){
		return repository.findAll();
	}
	
	@GetMapping("/count")
	public long getCount(){
		return repository.count();
	}
	
	@GetMapping("/name/{name}")
	public List<Demo> getDemoByName(@PathVariable String name) {
		return repository.findByName(name);
	}
	
	@GetMapping("/status/{status}")
	public List<Demo> getDemoByStatus(@PathVariable String status) {
		return repository.findByStatus(status);
	}
	
	@GetMapping("/and/{id}/{name}")
	public List<Demo> getDemoByIdAndName(@PathVariable int id,@PathVariable String name){
		return repository.findByIdAndName(id, name);
	}
	
	@GetMapping("/or/{id}/{name}")
	public List<Demo> getDemoByIdOrName(@PathVariable int id,@PathVariable String name){
		return repository.findByIdOrName(id, name);
	}
	
	@GetMapping("/and2/{name}/{status}")
	public List<Demo> getDemoByIdAndName(@PathVariable String name,@PathVariable String status){
		return repository.findByNameAndStatus(name, status);
	}
	
	@GetMapping("/start/{start}")
	public List<Demo> getDemoByStart(@PathVariable String start) {
		return repository.findByNameStartingWith(start);
	}
	
	@GetMapping("/end/{end}")
	public List<Demo> getDemoByEnd(@PathVariable String end) {
		return repository.findByNameEndingWith(end);
	}
	
	@GetMapping("/all")
	public List<Demo> getAllData(){
		return repository.getAllDemo();
	}
	
	@GetMapping("/all/or/{id}/{name}")
	public List<Demo> getAllData(@PathVariable int id,@PathVariable String name){
		return repository.getAllIdOrName(id,name);
	}
	
	@GetMapping("/all/{id}/{status}")
	public String updateAll(@PathVariable int id,@PathVariable String status){
		String result="";
		int res=repository.updateStatusById(id,status);
		if(res>0) {
			result="Updated"+res;
		}
		else {
			result="Not Updated"+res;
		}
		return result;
	}
	
}

