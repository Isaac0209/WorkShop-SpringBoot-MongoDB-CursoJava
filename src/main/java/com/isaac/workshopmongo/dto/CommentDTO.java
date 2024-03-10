package com.isaac.workshopmongo.dto;

import java.io.Serializable;
import java.time.Instant;

import com.isaac.workshopmongo.entity.User;

public class CommentDTO implements Serializable{


	private static final long serialVersionUID = 1L;
	
	private String text;
	private Instant data;
	private AuthorDTO user;
	
	public CommentDTO() {
		
	}

	public CommentDTO(String text, Instant data, AuthorDTO user) {
		super();
		this.text = text;
		this.data = data;
		this.user = user;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Instant getData() {
		return data;
	}

	public void setData(Instant data) {
		this.data = data;
	}

	public AuthorDTO getUser() {
		return user;
	}

	public void setUser(AuthorDTO user) {
		this.user = user;
	}
	
}
