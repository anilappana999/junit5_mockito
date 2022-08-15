package com.lovetolearn.SpringbootApp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.lovetolearn.SpringbootApp.entities.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
