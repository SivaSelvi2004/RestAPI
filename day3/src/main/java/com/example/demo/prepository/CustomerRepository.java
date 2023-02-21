package com.example.demo.prepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pcustomer.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{

}
