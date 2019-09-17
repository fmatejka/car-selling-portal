package com.carsell.demo;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private ManufacturerRepository manufacturerRepository;
	
	@Autowired
	private ModelRepository modelRepository;

	
	@GetMapping("/getUsers")
	public List<User> getUsers() {
		
		return (List<User>) userRepository.findAll();
	}
	
	@PutMapping("/updateUser/{id}")
	public ResponseEntity<Object> updateUser(@RequestBody User u, @PathVariable int id) {

		Optional<User> us = userRepository.findById(id);

		if (!us.isPresent())
			return ResponseEntity.notFound().build();
		u.setId(id);
		userRepository.save(u);
		return ResponseEntity.noContent().build();
	}
	
	
	
	@GetMapping("/getCars")
	public List<Car> getCars() {
		
		return (List<Car>) carRepository.findAll();
		}
	
	
	@PostMapping("/addCar")
	public String addCar(@RequestBody Car car) {
		
		carRepository.save(car);
		System.out.println(car.toString());
		return "Car added";
		}
	
	@GetMapping("/deleteCar/{id}")
	public String deleteCar(@PathVariable("id") int id) {
	    Car car = carRepository.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid car Id:" + id));
	    carRepository.delete(car);
	    return "successfully deleted";
	}
	
	@PutMapping("/updateCar/{id}")
	public ResponseEntity<Object> updateCar(@RequestBody Car c, @PathVariable int id) {

		Optional<Car> ca = carRepository.findById(id);

		if (!ca.isPresent())
			return ResponseEntity.notFound().build();
		c.setId(id);
		carRepository.save(c);
		return ResponseEntity.noContent().build();
	}
	
	
	@GetMapping("/manufacturers")
	public List<Manufacturer> getManufacturers() {
		
		return (List<Manufacturer>) manufacturerRepository.findAll();
		}
	
	@PostMapping("/manufacturers/addManufacturer")
	public String addManufacturers(@RequestBody Manufacturer manufacturer) {
		
		manufacturerRepository.save(manufacturer);
		return "Manufacturer added";
		}

		
	@PutMapping("/manufacturers/updateManufacturer/{id}")
	public ResponseEntity<Object> updateManufacturer(@RequestBody Manufacturer m, @PathVariable int id) {

		Optional<Manufacturer> manu = manufacturerRepository.findById(id);

		if (!manu.isPresent())
			return ResponseEntity.notFound().build();
		
		m.setId(id);
		manufacturerRepository.save(m);
		return ResponseEntity.noContent().build();
	}
	
	
	@GetMapping("/manufacturers/deleteManufacturer/{id}")
	public String deleteManufacturer(@PathVariable("id") int id) {
		Manufacturer m = manufacturerRepository.findById(id)
	      .orElseThrow(() -> new IllegalArgumentException("Invalid manufacturer Id:" + id));
		manufacturerRepository.delete(m);
	    return "successfully deleted";
	}
	
	@GetMapping("/manufacturers/{id}/showModels")
	public List<Model> showModels(@PathVariable int id) {
		
		Manufacturer m = manufacturerRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid manufacturer Id:" + id));;
		return  m.getModels();
		
	}
	
	
	
	
	
}
