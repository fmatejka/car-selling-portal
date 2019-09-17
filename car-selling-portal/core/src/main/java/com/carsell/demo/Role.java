package com.carsell.demo;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {
	
	@Id
	private int id;
	private String name;
	
	
	@ManyToMany(mappedBy = "roles")
    Set<User> users;
	
	//Dok nisam uklonio getUsers(), ulazilo u beskonacnu petlju zbog spajanja
	
	/* public Set<User> getUsers() {
		return users;
	}
	public void setUsers(Set<User> users) {
		this.users = users;
	} */
	
	
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
		return "Role [id=" + id + ", name=" + name + "]";
	}
	
	

}
