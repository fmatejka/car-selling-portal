package com.carsell.services.manufacturer.dto;

import java.util.Set;

import com.carsell.models.Car;
import com.carsell.models.Manufacturer;
import com.carsell.models.Model;

public class ManufacturerDTO {
	
	private String name;
	private Set<Model> models;
	private Set<Car> cars;
	
	
	public ManufacturerDTO() {
		super();
	}


	public ManufacturerDTO(String name, Set<Model> models, Set<Car> cars) {
		super();
		this.name = name;
		this.models = models;
		this.cars = cars;
	}
	
	
	public ManufacturerDTO(Manufacturer m) {
		this.name = m.getName();
		this.cars = m.getCars();
		this.models = m.getModels();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Set<Model> getModels() {
		return models;
	}


	public void setModels(Set<Model> models) {
		this.models = models;
	}


	public Set<Car> getCars() {
		return cars;
	}


	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}
	
	
	

}
