package com.lovetolearn.SpringbootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lovetolearn.SpringbootApp.entities.Employee;
import com.lovetolearn.SpringbootApp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService empService;

	@PostMapping("/saveOrUpdate")
	public Employee saveOrUpdateEmployee(@RequestBody Employee emp) {

		return empService.saveOrUpdate(emp);
	}

	@GetMapping("/delete")
	public boolean deleteEmpById(Integer id) {

		return empService.delete(id);
	}

	
	
}
