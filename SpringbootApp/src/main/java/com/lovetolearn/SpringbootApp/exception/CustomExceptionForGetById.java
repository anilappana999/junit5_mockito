package com.lovetolearn.SpringbootApp.exception;

public class CustomExceptionForGetById  extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1817896252785198981L;
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
	public CustomExceptionForGetById(String message, String description) {
		super();
		this.message = message;
		this.description = description;
	}
	public CustomExceptionForGetById() {
		super();
	}
	@Override
	public String toString() {
		return "CustomExceptionForGetById [message=" + message + ", description=" + description + "]";
	}
	
	
	
	
	
	
}
