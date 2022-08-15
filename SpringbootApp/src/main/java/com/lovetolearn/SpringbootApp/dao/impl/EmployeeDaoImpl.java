package com.lovetolearn.SpringbootApp.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovetolearn.SpringbootApp.dao.EmployeeDao;
import com.lovetolearn.SpringbootApp.entities.Employee;
import com.lovetolearn.SpringbootApp.exception.CustomExceptionForGetById;
import com.lovetolearn.SpringbootApp.repo.EmployeeRepo;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	EmployeeRepo empRepo;

	@Override
	public Employee saveOrUpdate(Employee emp) {

		List<Employee> list = (List<Employee>) empRepo.findAll();
		System.out.println(list.size() + "anil");

		return empRepo.save(emp);
	}

	@Override
	public boolean delete(Integer id) {
		boolean check = false;

		if (empRepo.existsById(id)) {
			empRepo.deleteById(id);
			check = true;
		} else {
			throw new CustomExceptionForGetById("employee not found", "exception occurred");
		}
		return check;
	}

}
