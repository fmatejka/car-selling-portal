package com.carsell.demo;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ModelRepository extends CrudRepository<Model, Integer>{
	
	

}
