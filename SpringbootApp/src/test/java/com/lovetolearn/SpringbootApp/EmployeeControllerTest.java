package com.lovetolearn.SpringbootApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockedStatic;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;
import com.lovetolearn.SpringbootApp.controller.EmployeeController;
import com.lovetolearn.SpringbootApp.entities.Employee;
import com.lovetolearn.SpringbootApp.exception.CustomExceptionForGetById;
import com.lovetolearn.SpringbootApp.service.EmployeeService;

@ExtendWith(MockitoExtension.class)
public class EmployeeControllerTest {

	@Mock
	EmployeeService employeeService;

	@InjectMocks
	EmployeeController employeeController;

	Employee employee;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
		employee = new Employee();
		employee.setId(1);
	}

	@Test
	public void saveOrUpdateEmployeeTest() {
		when(employeeService.saveOrUpdate(any())).thenReturn(employee);
		assertEquals(employeeController.saveOrUpdateEmployee(new Employee()), employee);
	}

	@Test
	public void existsByIdTest() {
		employeeController.existsById(1);
		verify(employeeService, times(1)).checkEmployee(any());
	}

	@Test
	public void verifyTest() {
		when(employeeService.checkExistingEmployee(any())).thenReturn(false);
		assertThrows(Exception.class, () -> employeeController.verify(1));
	}

	@Test
	public void verifyIdTest() {
		assertThrows(CustomExceptionForGetById.class, () -> employeeController.verifyId(0));
	}

	@Test
	public void healthCheckTest() {

		try (MockedStatic<EmployeeService> utilities = Mockito.mockStatic(EmployeeService.class)) {
			utilities.when(() -> EmployeeService.checkIt()).thenReturn(false);

			assertEquals("DOWN", employeeController.healthcheck());
		}
	}

}
