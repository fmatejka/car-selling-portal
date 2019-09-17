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
	
	public List<Model> getUsers() {
		return models;
	}
	public void setUsers(List<Model> models) {
		this.models = models;
	}
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
