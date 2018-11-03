package com.capg.employeeinsert.service;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capg.employeeinsert.bean.EmployeeBean;
import com.capg.employeeinsert.exception.EmpException;


public class EmployeeServiceImpTest {

	private static IEmployeeService employeeService = null;
	@BeforeClass
	public static void createInstance(){
		employeeService = new EmployeeServiceImp();
	}
	@Test(expected = EmpException.class)
	public void testEidForLength() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(22%67);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result= employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);	
	}
	@Test(expected = EmpException.class)
	public void testEidForNumber() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result= employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);
		
	}
	@Test(expected = EmpException.class)
	public void testEid() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(34565);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result= employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);
	}
	@Test(expected = EmpException.class)
	public void testempNameForLength() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123565);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result = employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);	
	}
	@Test(expected = EmpException.class)
	public void testempNameForNull() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123565);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result = employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);	
	}
	@Test(expected = EmpException.class)
	public void testempNameForChar() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123565);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result = employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);	
	}

	@Test(expected = EmpException.class)
	public void testempNameNull() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123565);
		employeeBean.setEmpName("");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result = employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);	
	}
	@Test(expected = EmpException.class)
	public void testBalanceForNull() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123565);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result = employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);	
	}
	

	@Test(expected = EmpException.class)
	public void testBalanceforPositive() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123565);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result = employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);	
	}
	
	
	@Test(expected = EmpException.class)
	public void testBalanceForMin() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123565);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result = employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);	
	}
	@Test(expected = EmpException.class)
	public void testDeptNameForNull() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123565);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result = employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);	
	}
	@Test(expected = EmpException.class)
	public void testDeptNameForChar() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123565);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result = employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);	
	}
	@Test(expected = EmpException.class)
	public void testDeptNameNull() throws EmpException{
		EmployeeBean employeeBean = new EmployeeBean();
		employeeBean.setEmpId(123565);
		employeeBean.setEmpName("shipra");
		employeeBean.setBalance(2000.00);
		employeeBean.setDeptName("CSE");
		boolean result = employeeService.ValidateEmployee(employeeBean);
		Assert.assertFalse(result);	
	}
}
