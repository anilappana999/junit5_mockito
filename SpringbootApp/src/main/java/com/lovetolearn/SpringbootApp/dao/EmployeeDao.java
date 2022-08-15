package com.lovetolearn.SpringbootApp.dao;

import com.lovetolearn.SpringbootApp.entities.Employee;

public interface EmployeeDao {

	public Employee saveOrUpdate(Employee emp);
	
	public boolean delete(Integer id);
}
