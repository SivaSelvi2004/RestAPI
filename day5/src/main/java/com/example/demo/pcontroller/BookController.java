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

import com.example.demo.pbook.Book;
import com.example.demo.pservice.BookService;
@RequestMapping("/book")
@RestController
public class BookController {
	@Autowired
	BookService service;
	
	@PostMapping("")
	public boolean add(@RequestBody Book book) {
		return service.addBook(book);
	}
	
	@GetMapping("")
	public List<Book> get(){
		return service.getBook();
	}
	
	@GetMapping("/{id}")
	public Optional<Book> getById(@PathVariable int id){
		return service.getBookById(id);
	}
	
	@PutMapping("/{id}")
	public Book updateById(@PathVariable int id,@RequestBody Book book) {
		return service.updateBookById(book);
	}
	
	@DeleteMapping("/{id}")
	public boolean deleteById(@PathVariable int id) {
		return service.deleteBookById(id);
	}
}
