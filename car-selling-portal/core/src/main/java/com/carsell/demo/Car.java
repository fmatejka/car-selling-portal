package com.carsell.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Car {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String first_registration;
	private String mileage;
	private String fuel;
	private String location;
	private String contact;
	private String cubic_capacity;
	private String gearbox;
	private String additional_accessories;
	private String description;
	private int model_id;
	private int manufacturer_id;
	//nema polja price ?
	
	public Car(int id, String first_registration, String mileage, String fuel, String location, String contact,
			String cubic_capacity, String gearbox, String additional_accessories, String description, int model_id,
			int manufacturer_id) {
		super();
		this.id = id;
		this.first_registration = first_registration;
		this.mileage = mileage;
		this.fuel = fuel;
		this.location = location;
		this.contact = contact;
		this.cubic_capacity = cubic_capacity;
		this.gearbox = gearbox;
		this.additional_accessories = additional_accessories;
		this.description = description;
		this.model_id = model_id;
		this.manufacturer_id = manufacturer_id;
	}
	public Car() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirst_registration() {
		return first_registration;
	}
	public void setFirst_registration(String first_registration) {
		this.first_registration = first_registration;
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
	public String getCubic_capacity() {
		return cubic_capacity;
	}
	public void setCubic_capacity(String cubic_capacity) {
		this.cubic_capacity = cubic_capacity;
	}
	public String getGearbox() {
		return gearbox;
	}
	public void setGearbox(String gearbox) {
		this.gearbox = gearbox;
	}
	public String getAdditional_accessories() {
		return additional_accessories;
	}
	public void setAdditional_accessories(String additional_accessories) {
		this.additional_accessories = additional_accessories;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getModel_id() {
		return model_id;
	}
	public void setModel_id(int model_id) {
		this.model_id = model_id;
	}
	public int getManufacturer_id() {
		return manufacturer_id;
	}
	public void setManufacturer_id(int manufacturer_id) {
		this.manufacturer_id = manufacturer_id;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", first_registration=" + first_registration + ", mileage=" + mileage + ", fuel="
				+ fuel + ", location=" + location + ", contact=" + contact + ", cubic_capacity=" + cubic_capacity
				+ ", gearbox=" + gearbox + ", additional_accessories=" + additional_accessories + ", description="
				+ description + ", model_id=" + model_id + ", manufacturer_id=" + manufacturer_id + "]";
	}
	
	
	

}
