package com.lovetolearn.SpringbootApp.service;

import com.lovetolearn.SpringbootApp.entities.Employee;

public interface EmployeeService {

	public Employee saveOrUpdate(Employee emp);
	
	public boolean delete(Integer id);
	
	
}
