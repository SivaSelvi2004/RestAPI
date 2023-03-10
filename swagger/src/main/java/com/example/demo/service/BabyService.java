package com.example.demo.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.model.Baby;
import com.example.demo.repository.BabyRepository;

@Service
public class BabyService {
	@Autowired
	BabyRepository repository;
	
	public boolean addBaby(Baby baby) {
		repository.save(baby);
		return true;
	}
	
	public List<Baby> getBabySorted(String field){
		return repository.findAll(Sort.by(Sort.Direction.ASC,field));
	}
	
	public List<Baby> getBabyWithPagination(int offset,int pageSize){
		Page<Baby> baby=repository.findAll(PageRequest.of(offset, pageSize));
		return baby.getContent();
	}
	
	public List<Baby> getBabyWithPaginationAndSorting( int offset, int pageSize,String field){
		Page<Baby> baby=repository.findAll(PageRequest.of(offset, pageSize,Sort.by(field)));
		return baby.getContent();
	}

}