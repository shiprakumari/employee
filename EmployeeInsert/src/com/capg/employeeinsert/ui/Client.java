package com.capg.employeeinsert.ui;

import java.util.Scanner;
import java.util.ArrayList;

import com.capg.employeeinsert.bean.EmployeeBean;
import com.capg.employeeinsert.exception.EmpException;
import com.capg.employeeinsert.service.EmployeeServiceImp;
import com.capg.employeeinsert.service.IEmployeeService;

public class Client{
	 static //ArrayList<EmployeeBean> e= new ArrayList<EmployeeBean>();
	 IEmployeeService service =new EmployeeServiceImp();
	private static EmployeeBean e;
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String choice =null;
		Client c= new Client();
		while(true){
		System.out.println("-----Employee-----");
		System.out.println("1. Add Employee");
		System.out.println("2. Exit");
		System.out.println("Enter your choice");
		choice = sc.nextLine();
		switch (choice) {
		case "1":
			c.AddEmployee();
			
			break;
		case "2":
			System.exit(0);

		default:
			System.out.println("Enter the correct choice");
			break;
		}
		}

	}

	private void AddEmployee() {
		// TODO Auto-generated method stub
		
		
		EmployeeBean e= new EmployeeBean();
		System.out.println("Enter employee id");
		int eId = sc.nextInt();
		e.setEmpId(eId);
		System.out.println("Enter your name");
		String empName= sc.next();
		e.setEmpName(empName);
		System.out.println("Enter Balance");
		double balance =sc.nextDouble();
		e.setBalance(balance);
		System.out.println("Enter your Department name");
		String deptName =sc.next();
		e.setDeptName(deptName);
		try {
			boolean result = service.ValidateEmployee(e);
			if(result)
			{
				System.out.println("Employee added successfully");
			}
		} catch (EmpException e1) {
			// TODO Auto-generated catch block
		System.err.println("Enter the details properly");
			//e1.printStackTrace();
		}
		
	}

}
