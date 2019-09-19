package com.carsell.services.car.dto;

import java.util.Set;

import com.carsell.models.Car;
import com.carsell.models.Comment;
import com.carsell.models.Manufacturer;
import com.carsell.models.Model;

public class CarDTO {

	private Manufacturer manufacturer;
	private Model model;
	private String firstRegistration;
	private String mileage;
	private String fuel;
	private String location;
	private String contact;
	private String cubicCapacity;
	private String gearbox;
	private String additionalAccessories;	
	private String description;
	private Set<Comment> comments;

	
	
	public Manufacturer getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Set<Comment> getComments() {
		return comments;
	}

	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}

	public CarDTO() {
		super();
	}

	public CarDTO(Car c) {
		
		this.firstRegistration = c.getFirstRegistration();
		this.mileage = c.getMileage();
		this.fuel = c.getFuel();
		this.location = c.getLocation();
		this.contact = c.getContact();
		this.cubicCapacity = c.getCubicCapacity();
		this.gearbox = c.getGearbox();
		this.additionalAccessories = c.getAdditionalAccessories();
		this.description = c.getDescription();
		this.model = c.getModel();
		this.manufacturer = c.getManufacturer();
		this.comments = c.getComments();
				
	}

	


	public String getFirstRegistration() {
		return firstRegistration;
	}


	public void setFirstRegistration(String firstRegistration) {
		this.firstRegistration = firstRegistration;
	}


	public String getMileage() {
		return mileage;
	}


	public void setMileage(String mileage) {
		this.mileage = mileage;
	}


	public String getFuel() {
		return fuel;
	}


	public void setFuel(String fuel) {
		this.fuel = fuel;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public String getContact() {
		return contact;
	}


	public void setContact(String contact) {
		this.contact = contact;
	}


	public String getCubicCapacity() {
		return cubicCapacity;
	}


	public void setCubicCapacity(String cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}


	public String getGearbox() {
		return gearbox;
	}


	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}


	public String getAdditionalAccessories() {
		return additionalAccessories;
	}


	public void setAdditionalAccessories(String additionalAccessories) {
		this.additionalAccessories = additionalAccessories;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
