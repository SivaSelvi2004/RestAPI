package com.example.demo.prepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pbook.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer>{

}
