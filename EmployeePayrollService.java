package com.capgemini.employeepayroll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

	private List<EmployeePayrollData> employeePayrollList;
	public EmployeePayrollService() {}
	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) {
		this.employeePayrollList = employeePayrollList;
	}
	
	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner input = new Scanner(System.in);
		employeePayrollService.readEmployeePayrollData(input);
		employeePayrollService.writeEmployeePayrollData();
	}

	private void readEmployeePayrollData(Scanner input) {
		System.out.println("Enter Employee ID : ");
		int id = input.nextInt();
		System.out.println("Enter Employee Name : ");
		String name = input.next();
		System.out.println("Enter Employee Salary : ");
		double salary = input.nextDouble();
		employeePayrollList.add(new EmployeePayrollData(id, name, salary));
	}
	
	private void writeEmployeePayrollData() {
		System.out.println("\nWriting Employee Payroll Roaster to Console\n" + employeePayrollList);
	}

}
