package com.carsell.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
	
	@Autowired
	private CarRepository cr;
	
	@PostMapping("/addCar")
	public String addUsers(@RequestBody List<Car> cars) {
		
		cr.saveAll(cars);
		return " booked:" + cr.count();
	}

}
