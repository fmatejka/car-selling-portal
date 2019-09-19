package com.carsell.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsell.models.Car;
import com.carsell.services.car.CarService;
import com.carsell.services.car.dto.CarDTO;

@RestController
@RequestMapping("/car")
public class CarController {

	@Autowired
	private CarService carService;
	
	@GetMapping("/selectedCar/{id}")
	public ResponseEntity<CarDTO> getCar(@PathVariable Integer id) {
		CarDTO  car = carService.getCarById(id);
		return ResponseEntity.ok(car);
	}
	
	@GetMapping("/cars")
	public ResponseEntity<List<CarDTO>> getCars(){
	
		List<CarDTO> cars = carService.getCars();
		return ResponseEntity.ok(cars);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<CarDTO> addCar(@RequestBody Car c){
		
		carService.addCar(c);
		CarDTO newCar = new CarDTO(c);
		return ResponseEntity.ok(newCar);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<CarDTO> updateCar(@RequestBody Car c,@PathVariable Integer id){
		
		Car car = carService.updateCar(id);
		System.out.println(car);
		CarDTO newCar = new CarDTO(c);
		return ResponseEntity.ok(newCar);
		
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCar(@PathVariable Integer id){

		carService.deleteCar(id);
		return ResponseEntity.ok().build();
	}
	
	
}
