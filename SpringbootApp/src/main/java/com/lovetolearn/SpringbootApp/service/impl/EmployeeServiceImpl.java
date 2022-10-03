package com.lovetolearn.SpringbootApp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovetolearn.SpringbootApp.dao.EmployeeDao;
import com.lovetolearn.SpringbootApp.entities.Employee;
import com.lovetolearn.SpringbootApp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao empDao;

	@Override
	public Employee saveOrUpdate(Employee emp) {

		return empDao.saveOrUpdate(emp);
	}

	@Override
	public boolean delete(Integer id) {

		return empDao.delete(id);
	}

	@Override
	public void checkEmployee(Integer id) {

		boolean flag = empDao.delete(id);
		if (flag) {

			System.out.println("employee id exists");
		} else {

			System.out.println("employee id nota exists");
		}

	}

	@Override
	public boolean checkExistingEmployee(Integer id) {

		return empDao.checkEmployee(id);
	}
	
	


}
