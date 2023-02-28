package com.example.demo.prepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.pcar.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer>{
	
	public List<Car> findByOwners(int owners);
	
	public List<Car> findByAddress(String address);
	
	public List<Car> findByCarName(String CarName);
	
	public List<Car> findByOwnersAndCarType(int owners,String carType);

}
