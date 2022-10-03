package com.lovetolearn.SpringbootApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lovetolearn.SpringbootApp.entities.Employee;
import com.lovetolearn.SpringbootApp.exception.CustomExceptionForGetById;
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

	@GetMapping("/checkEmployee")
	public void existsById(Integer id) {

		empService.checkEmployee(id);
	}

	@GetMapping("/verify")
	public void verify(Integer id) throws Exception {

		if (empService.checkExistingEmployee(id)) {

		} else {
			throw new Exception("check");
		}
	}

	@GetMapping("/verify")
	@ExceptionHandler(CustomExceptionForGetById.class)
	public boolean verifyId(Integer id) throws Exception {

		if (id.equals(1)) {

			throw new Exception("check");
		} else {
			throw new CustomExceptionForGetById("exception", "no existing id");
		}
	}

	@GetMapping("/check")
	public String healthcheck() {

		boolean check = EmployeeService.checkIt();
		if (check) {
			return "UP";
		} else {
			return "DOWN";
		}
	}

}
