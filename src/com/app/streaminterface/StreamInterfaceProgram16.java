package com.app.streaminterface;

import java.util.List;

import com.app.models.Employee;

public class StreamInterfaceProgram16 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		System.out.println("------ Traversing stream by forEach method -------");
		employeeList.stream().forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("------ Traversing stream by forEachOrder method -------");
		employeeList.stream().forEachOrdered(e->{
			System.out.println(e);
		});
	}
}
