package com.carsell.services.car.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsell.models.Car;
import com.carsell.repositories.CarRepository;
import com.carsell.services.car.CarService;
import com.carsell.services.car.dto.CarDTO;

@Service

public class CarServiceImpl implements CarService{

	@Autowired
	private CarRepository carRepository;

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
	public Car updateCar(Integer id) {
		Car c = carRepository.getOne(id);
		if (c == null) {
			c = new Car();
		}
		return carRepository.saveAndFlush(c);
	}


	@Override
	public void deleteCar(Integer id) {

		Car c = carRepository.getOne(id);
		if(c != null)
			carRepository.deleteById(id);
	}


	
	
}
