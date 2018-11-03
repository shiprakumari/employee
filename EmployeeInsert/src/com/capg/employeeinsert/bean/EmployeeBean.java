package com.capg.employeeinsert.bean;

public class EmployeeBean {
	private int empId;
	private String empName;
	private double balance;
	private String deptName;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "EmployeeBean [empId=" + empId + ", empName=" + empName
				+ ", balance=" + balance + ", deptName=" + deptName + "]";
	}

	
}

