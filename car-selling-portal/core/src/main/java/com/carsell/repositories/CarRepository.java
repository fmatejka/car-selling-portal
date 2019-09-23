package com.carsell.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.carsell.models.Car;

public interface CarRepository extends JpaRepository<Car, Integer>{
	
	@Query(
			  value = "select * from car c order by c.price", 
			  nativeQuery = true)
			List<Car> showCarsSorted();
	
	

}
