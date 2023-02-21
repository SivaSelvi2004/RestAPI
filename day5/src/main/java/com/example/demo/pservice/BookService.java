package com.example.demo.pservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pbook.Book;
import com.example.demo.prepository.BookRepository;

@Service
public class BookService {
	@Autowired
	BookRepository repository;
	
	public boolean addBook(Book book) {
		repository.save(book);
		return true;
	}
	
	public List<Book> getBook(){
		return repository.findAll();
	}
	
	public Optional<Book> getBookById(int id){
		return repository.findById(id);
	}
	
	public Book updateBookById(Book book) {
		return repository.save(book);
	}
	
	public boolean deleteBookById(int id) {
		repository.deleteById(id);
		return true;
	}
}
