package com.app.streaminterface;

import java.util.List;
import java.util.stream.Collectors;

import com.app.models.Employee;

public class StreamInterfaceProgram8 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		List<String> enameList = employeeList
				.stream()
				.map(e->e.getEname())
				.collect(Collectors.toList());
		
		System.out.println("------- List of Employee Names --------");
		System.out.println(enameList);
		
		List<String> eidList = employeeList
				.stream().map(e->e.getEid())
				.collect(Collectors.toList());
		
		System.out.println("---------- List of Employee Ids --------");
		System.out.println(eidList);
	}
}
