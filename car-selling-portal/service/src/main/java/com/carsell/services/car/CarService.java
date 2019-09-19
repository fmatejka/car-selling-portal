package com.carsell.services.car;

import java.util.List;

import com.carsell.models.Car;
import com.carsell.services.car.dto.CarDTO;



public interface CarService {
	
	public CarDTO getCarById(int id);
	public List<CarDTO> getCars();
	public Car addCar(Car c); 
	public Car updateCar(Integer id);
	public void deleteCar(Integer id);
	

}
