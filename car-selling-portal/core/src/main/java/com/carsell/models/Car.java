package com.carsell.models;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Entity
public class Car {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "first_registration")
	private String firstRegistration;
	private String mileage;
	private String fuel;
	private String location;
	private String contact;
	@Column(name = "cubic_capacity")
	private String cubicCapacity;
	private String gearbox;
	@Column(name = "additional_accessories")
	private String additionalAccessories;
	private String description;
	
	 
	@OneToMany(mappedBy = "car", fetch = FetchType.LAZY)
	private Set<Comment> comments;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Manufacturer manufacturer;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Model model;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	public Set<Comment> getComments() {
		return comments;
	}
	public void setComments(Set<Comment> comments) {
		this.comments = comments;
	}
	
	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", first_registration=" + firstRegistration + ", mileage=" + mileage + ", fuel="
				+ fuel + ", location=" + location + ", contact=" + contact + ", cubic_capacity=" + cubicCapacity
				+ ", gearbox=" + gearbox + ", additional_accessories=" + additionalAccessories + ", description="
				+ description  + "]";
	}
	
	
	

}
