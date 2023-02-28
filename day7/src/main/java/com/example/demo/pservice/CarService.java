package com.example.demo.pservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.pcar.Car;
import com.example.demo.prepository.CarRepository;

@Service
public class CarService {
	@Autowired 
	CarRepository repository;
	
	public boolean addAll(@RequestBody Car car) {
		repository.save(car);
		return true;
	}
	
	public List<Car> getCarAll(){
		return repository.findAll();
	}
	
	public List<Car> getCarByOwners(@PathVariable int owners) {
		return repository.findByOwners(owners);
	}
	
	public List<Car> getCarByAddress(@PathVariable String address) {
		return repository.findByAddress(address);
	}
	
	public List<Car> getCarByCarName(@PathVariable String carName) {
		return repository.findByCarName(carName);
	}
	
	public List<Car> getCarByOwnersAndCarType(@PathVariable int owners,@PathVariable String carType) {
		return repository.findByOwnersAndCarType(owners,carType);
	}
}
