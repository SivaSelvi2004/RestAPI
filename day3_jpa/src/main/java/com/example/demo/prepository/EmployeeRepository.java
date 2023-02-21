package com.example.demo.prepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pemployee.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{

}
