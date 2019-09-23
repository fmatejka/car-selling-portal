package com.carsell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carsell.models.Model;

public interface ModelRepository extends JpaRepository<Model, Integer>{

}
