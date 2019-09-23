package com.carsell.services.comment.dto;

import com.carsell.models.Comment;

public class CommentDTO {
	
	private String text;


	public CommentDTO(Comment c) {
		
		this.text = c.getText();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
