package com.carsell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carsell.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Integer>{

}
