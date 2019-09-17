package com.carsell.demo;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.Query;

@Entity
@Table(name="manufacturer")
public class Manufacturer {

	@Id
	@Column(name = "id")
	private int id;
	private String name;
	
	
	@OneToMany(mappedBy = "manufacturer")
	private List<Model> models;
	
	@OneToMany(mappedBy = "manufacturer")
	private List<User> users;
	
	@OneToMany(mappedBy = "manufacturer")
	private List<Car> cars;
	
	
	/* public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	*/
	
	/* public List<Car> getCars() {
		return cars;
	}
	public void setCars(List<Car> cars) {
		this.cars = cars;
	}*/
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Model> getModels() {
		return models;
	}
	public void setModels(List<Model> models) {
		this.models = models;
	}
	@Override
	public String toString() {
		return "Manufacturer [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
