package com.ihusain.dao;

import com.ihusain.model.Employee;

public interface EmployeeDao {
	
	Employee findEmployee(Employee e);

	void saveEmployee(Employee e);
	
	void updateEmployee(Employee e);
	
	void removeEmployee(Employee e);
	
}
