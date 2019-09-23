package com.carsell.services.car;

import java.util.List;

import com.carsell.models.Car;
import com.carsell.models.Comment;
import com.carsell.services.car.dto.CarDTO;
import com.carsell.services.comment.dto.CommentDTO;

public interface CarService {
	
	public CarDTO getCarById(int id);
	public List<CarDTO> getCars();
	public List<CarDTO> showCarsSortedByPrice();
	public Car addCar(Car c); 
	public Car updateCar(Integer id,Car c);
	public void deleteCar(Integer id);
	public List<CommentDTO> showComments(Integer carId);
	public Comment addComment(Integer carId, Comment c);
	public void deleteComment(Integer carId, Integer commId);
	public Comment editComment(Integer carId, Integer commId, Comment c); 
	
	

}
