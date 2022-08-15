package com.lovetolearn.SpringbootApp.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.lovetolearn.SpringbootApp.entities.ErrorDetails;

@ControllerAdvice
public class ExceptionHandlr  extends ResponseEntityExceptionHandler{

	@ExceptionHandler
	public final ResponseEntity<Object> handleGlobalException(Exception ex){
		
		return new ResponseEntity<Object>("exception occurred internally while processing",HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(CustomExceptionForGetById.class)
	public final ResponseEntity<Object> handleCustomException(CustomExceptionForGetById ex){
		ErrorDetails er = new ErrorDetails(ex.getMessage(),ex.getDescription());
		return new ResponseEntity<Object>(er,HttpStatus.BAD_REQUEST);
		
		
		
	}
}