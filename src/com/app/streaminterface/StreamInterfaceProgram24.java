package com.app.streaminterface;

import java.util.List;

import com.app.models.Employee;

public class StreamInterfaceProgram24 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		long totalEmployeesCount = employeeList.stream().count();
		
		System.out.println("------ Total employees count ------");
		System.out.println(totalEmployeesCount);
		
		long employeeCount1 = employeeList.stream()
				.filter(e->e.getAge()>=25).count();
		
		System.out.println("------- Age greaterthan or equals to 25 employee count ------");
		System.out.println(employeeCount1);
		
		long employeeCount2 = employeeList.stream()
				.filter(e->e.getEsal()>30000.0).count();
		
		System.out.println("----- Salary greaterthan 30000.0 employee count -----");
		System.out.println(employeeCount2);
	}
}
