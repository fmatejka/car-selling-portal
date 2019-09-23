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
import com.carsell.models.Comment;
import com.carsell.repositories.CarRepository;
import com.carsell.services.car.CarService;
import com.carsell.services.car.dto.CarDTO;
import com.carsell.services.comment.dto.CommentDTO;

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
	
	@GetMapping("/sorted")
	public ResponseEntity<List<CarDTO>> showSorted(){
		List<CarDTO> list = carService.showCarsSortedByPrice();
		return ResponseEntity.ok(list);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity<CarDTO> addCar(@RequestBody Car c){
		
		carService.addCar(c);
		CarDTO newCar = new CarDTO(c);
		return ResponseEntity.ok(newCar);
		
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<CarDTO> updateCar(@RequestBody Car c,@PathVariable Integer id){
		
		c.setId(id);
		carService.updateCar(id, c);
		CarDTO newCar = new CarDTO(c);
		return ResponseEntity.ok(newCar);
	
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<Void> deleteCar(@PathVariable Integer id){

		carService.deleteCar(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping("/selectedCar/{carId}/comments")
	public ResponseEntity<List<CommentDTO>> showComments(@PathVariable Integer carId){
		
		List<CommentDTO> comments = carService.showComments(carId);
		return ResponseEntity.ok(comments);
	}
	
	
	@PostMapping("/selectedCar/{carId}/addComment")
	public ResponseEntity<CommentDTO> addComment(@RequestBody Comment c,@PathVariable Integer carId){
		
	
		carService.addComment(carId, c);
		CommentDTO newComment = new CommentDTO(c);
		return ResponseEntity.ok(newComment);
		
	}
	
	@GetMapping("/selectedCar/{carId}/deleteComment/{commId}")
	public ResponseEntity<Void> deleteComment(@PathVariable Integer carId,@PathVariable Integer commId){
		carService.deleteComment(carId, commId);
		return ResponseEntity.ok().build();
	}
	
	@PutMapping("/selectedCar/{carId}/editComment/{commId}")
	public ResponseEntity<CommentDTO> editComment(@RequestBody Comment c, @PathVariable Integer carId, @PathVariable Integer commId){
		
		
		c.setId(commId);
		carService.editComment(carId, commId, c);
		CommentDTO commDto = new CommentDTO(c);
		return ResponseEntity.ok(commDto);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
