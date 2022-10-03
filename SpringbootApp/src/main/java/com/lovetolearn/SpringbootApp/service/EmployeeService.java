package com.lovetolearn.SpringbootApp.service;

import com.lovetolearn.SpringbootApp.entities.Employee;

public interface EmployeeService {

	public Employee saveOrUpdate(Employee emp);

	public boolean delete(Integer id);

	public void checkEmployee(Integer id);

	public boolean checkExistingEmployee(Integer id);
	
	public static boolean checkIt() {

		return true;
	}

}
