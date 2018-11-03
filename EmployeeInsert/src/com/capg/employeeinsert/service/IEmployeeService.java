package com.capg.employeeinsert.service;

import com.capg.employeeinsert.bean.EmployeeBean;
import com.capg.employeeinsert.exception.EmpException;

public interface IEmployeeService {
int AddEmployee(EmployeeBean e);
boolean ValidateEmployee(EmployeeBean e) throws EmpException;

}
