package com.example.demo.pcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pservice.StudentService;
import com.example.demo.pstudent.Student;
@RequestMapping("/student")
@RestController
public class StudentController {
	@Autowired
	StudentService service;
	
	@PostMapping("")
	public boolean add(@RequestBody Student student) {
		return service.addStudent(student);
	}
	
	@GetMapping("")
	public List<Student> get(){
		return service.getStudent();
	}
	
	@GetMapping("/{id}")
	public Optional<Student> getById(@PathVariable int id){
		return service.getStudentById(id);
	}
	
	@PutMapping("/{id}")
	public Student updateById(@PathVariable int id,@RequestBody Student student) {
		return service.updateStudentById(student);
		
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteById(@PathVariable int id) {
		return service.deleteStudentById(id);
	}
}
