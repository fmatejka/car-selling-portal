package com.carsell.services.model.dto;

import java.util.Set;

import com.carsell.models.Car;
import com.carsell.models.Manufacturer;
import com.carsell.models.Model;

public class ModelDTO {
	
	private String name;
	private Manufacturer manufacturer;
	private Set<Car> cars;
	

	
	public ModelDTO() {
		super();
	}
	public ModelDTO(String name, Manufacturer manufacturer, Set<Car> cars) {
		super();
		this.name = name;
		this.manufacturer = manufacturer;
		this.cars = cars;
	}
	
	public ModelDTO(Model m) {
		this.name = m.getName();
		this.cars = m.getCars();
		this.manufacturer = m.getManufacturer();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Set<Car> getCars() {
		return cars;
	}
	public void setCars(Set<Car> cars) {
		this.cars = cars;
	}

	

}
