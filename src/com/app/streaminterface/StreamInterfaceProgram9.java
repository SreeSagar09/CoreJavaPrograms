package com.app.streaminterface;

import java.util.List;
import java.util.stream.Stream;

import com.app.models.Employee;

public class StreamInterfaceProgram9 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		System.out.println("----- Employee list -----");
		employeeList.stream().forEach(e->{
			System.out.println(e);
		});
		
		Stream<Employee> employeeStream = employeeList.stream().sorted();
		
		System.out.println("----- Employees are sorted by Employee object natural order -----");
		employeeStream.forEach(e->{
			System.out.println(e);
		});
	}
}
