package com.isaac.workshopmongo.dto;

import java.io.Serializable;
import java.time.Instant;

import com.isaac.workshopmongo.entity.Post;

public class PostDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String id;
	private Instant data;
	private String title;
	private String body;
	
	public PostDTO() {
		
	}
	public PostDTO(Post post) {
		this.id = post.getId();
		this.data = post.getData();
		this.title = post.getTitle();
		this.body = post.getBody();
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Instant getData() {
		return data;
	}
	public void setData(Instant data) {
		this.data = data;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	

}
