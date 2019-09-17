package com.carsell.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="model")
public class Model {
	
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn
	private Manufacturer manufacturer;
	
	
	/* public Manufacturer getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(Manufacturer manufacturer) {
		this.manufacturer = manufacturer;
	}
	*/
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
	
	@Override
	public String toString() {
		return "Model [id=" + id + ", name=" + name +"]";
	}
	
	
	
	

}
