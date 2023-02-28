package com.example.demo.pcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pcar.Car;
import com.example.demo.pservice.CarService;

@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	CarService service;
	
	@PostMapping("")
	public boolean add(@RequestBody Car car) {
		return service.addAll(car);
	}
	
	@GetMapping("")
	public List<Car> getAll(){
		return service.getCarAll();
	}
	
	@GetMapping("/owners/{owners}")
	public List<Car> getByOwners(@PathVariable int owners) {
		return service.getCarByOwners(owners);
	}
	
	@GetMapping("/address/{address}")
	public List<Car> getByAddress(@PathVariable String address) {
		return service.getCarByAddress(address);
	}
	
	@GetMapping("/carname/{carName}")
	public List<Car> getByCarName(@PathVariable String carName) {
		return service.getCarByCarName(carName);
	}
	
	@GetMapping("/owners/cartype/{owners}/{carType}")
	public List<Car> getByOwnersAndCarType(@PathVariable int owners,@PathVariable String carType) {
		return service.getCarByOwnersAndCarType(owners,carType);
	}
}
