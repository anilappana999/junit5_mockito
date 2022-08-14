package com.lovetolearn.SpringbootApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@GetMapping
	public String test() {
		
	return "test";	
	}
}
