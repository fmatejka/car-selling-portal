package com.carsell.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import com.carsell.models.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{
	
	

}
