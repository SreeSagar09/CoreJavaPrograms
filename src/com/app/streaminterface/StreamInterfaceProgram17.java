package com.app.streaminterface;

import java.util.List;
import java.util.stream.Stream;

import com.app.models.Employee;

public class StreamInterfaceProgram17 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Stream<Employee> employeeStream = employeeList.stream();
		
		Object[] employeeArray = employeeStream.toArray();
		
		System.out.println("------ Traversing object array ------");
		for(Object o : employeeArray) {
			System.out.println(o);
		}
	}
}
