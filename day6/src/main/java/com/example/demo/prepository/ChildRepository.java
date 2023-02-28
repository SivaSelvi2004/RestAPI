package com.example.demo.prepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pchild.Child;

@Repository
public interface ChildRepository extends JpaRepository<Child,Integer>{

}
