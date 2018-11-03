package com.capg.employeeinsert.dao;

import com.capg.employeeinsert.bean.EmployeeBean;

public interface IEmployeeDAO {
	
		int AddEmployee(EmployeeBean e);
		boolean ValidateEmployee(EmployeeBean e);

}
