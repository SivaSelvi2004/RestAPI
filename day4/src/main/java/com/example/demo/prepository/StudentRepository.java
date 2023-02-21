package com.example.demo.prepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pstudent.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{

}
