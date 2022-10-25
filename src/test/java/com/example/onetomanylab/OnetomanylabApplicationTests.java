package com.example.onetomanylab;

import com.example.onetomanylab.models.Department;
import com.example.onetomanylab.models.Employee;
import com.example.onetomanylab.repositories.DepartmentRepository;
import com.example.onetomanylab.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnetomanylabApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("finance");
		departmentRepository.save(department);
		Employee employee = new Employee("billy", "bob", 1234, department);
		employeeRepository.save(employee);

	}

}
