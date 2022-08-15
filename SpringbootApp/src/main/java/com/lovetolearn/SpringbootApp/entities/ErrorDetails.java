package com.lovetolearn.SpringbootApp.entities;

public class ErrorDetails {

	private String message;
	private String description;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ErrorDetails(String message, String description) {
		super();
		this.message = message;
		this.description = description;
	}
	public ErrorDetails() {
		super();
	}
	@Override
	public String toString() {
		return "ErrorDetails [message=" + message + ", description=" + description + "]";
	}
	
	
}