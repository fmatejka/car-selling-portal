package com.carsell.services.car.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsell.models.Car;
import com.carsell.models.Comment;
import com.carsell.repositories.CarRepository;
import com.carsell.repositories.CommentRepository;
import com.carsell.services.car.CarService;
import com.carsell.services.car.dto.CarDTO;
import com.carsell.services.comment.dto.CommentDTO;

import net.bytebuddy.implementation.bytecode.Throw;

@Service
public class CarServiceImpl implements CarService{

	@Autowired
	private CarRepository carRepository;
	
	@Autowired
	private CommentRepository commentRepository;

	@Override
	public Car addCar(Car c) {

		return carRepository.save(c);
		
	}
	

	@Override
	public CarDTO getCarById(int id) {
		
		Car c = carRepository.getOne(id);
		if(c==null)
			return null;
		else 
			return new CarDTO(c);
	}

	@Override
	public List<CarDTO> getCars() {
		
		List <CarDTO> list = new ArrayList<CarDTO>();
		for (Car c : carRepository.findAll()) {
			CarDTO newCar = new CarDTO(c);
			list.add(newCar);
		}
		
		return list;
	}

	@Override
	public Car updateCar(Integer id,Car c) {
		
		return carRepository.save(c);
		
	}


	@Override
	public void deleteCar(Integer id) {

		Car c = carRepository.getOne(id);
		if(c != null)
			carRepository.deleteById(id);
	}


	@Override
	public List<CommentDTO> showComments(Integer carId) {
		
		Car c = carRepository.getOne(carId);
		List <CommentDTO> list = new ArrayList<CommentDTO>();
		
		for(Comment comm : c.getComments()) {
			
			CommentDTO commDto = new CommentDTO(comm);
			list.add(commDto);
			
		}
			
		return list;
	}

	@Override
	public Comment addComment(Integer carId, Comment c) {
		
		Car car = carRepository.getOne(carId);
		c.setCar(car);
		return commentRepository.save(c);
	}

	@Override
	public void deleteComment(Integer carId,Integer commId) {

		Comment comm = commentRepository.getOne(commId);
		if(comm!=null)
			commentRepository.deleteById(commId);
	}

	@Override
	public Comment editComment(Integer carId, Integer id, Comment c) {

		Car car = carRepository.getOne(carId);
		c.setCar(car);
		return commentRepository.save(c);
	
	}


	@Override
	public List<CarDTO> showCarsSortedByPrice() {
		
		List<CarDTO> list = new ArrayList<>();
		for(Car c : carRepository.showCarsSorted()) {
			CarDTO newCar = new CarDTO(c);
			list.add(newCar);
		}
			return list;
	}


	
	
}
