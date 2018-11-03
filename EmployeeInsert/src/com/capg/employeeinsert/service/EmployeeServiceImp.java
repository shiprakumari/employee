`package com.capg.employeeinsert.service;

import com.capg.employeeinsert.bean.EmployeeBean;
import com.capg.employeeinsert.dao.EmployeeDAOImp;
import com.capg.employeeinsert.dao.IEmployeeDAO;
import com.capg.employeeinsert.exception.EmpException;

public class EmployeeServiceImp implements IEmployeeService {
  IEmployeeDAO dao = new EmployeeDAOImp();
	@Override
	public int AddEmployee(EmployeeBean e) {
		// TODO Auto-generated method stub
		return dao.AddEmployee(e);
	}

	@Override
	public boolean ValidateEmployee(EmployeeBean e) throws EmpException{
		 
		
		if(ValidateempId(e.getEmpId()) && ValidateName(e.getEmpName()) && ValidateBalance(e.getBalance()) && ValidatedeptName(e.getDeptName())){
			return true;
		}
		
		return false;
		
	}
	
	private boolean ValidateempId(int empId) throws EmpException {
		
		if(empId ==0){
			throw new EmpException(" give any no");
		}
		else{
			if((empId < 999)){
				throw new EmpException("must have 4 digits");
				
			}
		}
		// TODO Auto-generated method stub
		return true;
	}

	
	
	private boolean ValidateName(String empName) throws EmpException{
		if(empName.isEmpty()|| empName== null){
			throw new EmpException(" enter correct name");
		}else {
			
			if(!(empName.matches("[A-Z][A-Za-z ]{4,}")))
					throw new EmpException("Name should have atleast 4 characters");
			}
		
		
		return true;
		
	}
	private boolean ValidateBalance(double balance) throws EmpException{
		if(balance==0){
			throw new EmpException("balance can't be zero");
		}
			if((balance<1000)){
				throw new EmpException("balance should be > 1000");
			}
			
		
		
		return true;
		
	}
	private boolean ValidatedeptName(String deptName) throws EmpException{
		if(deptName.isEmpty()){
			throw new EmpException("Department name can't be empty");
		}
		return true;
		
	}

}

