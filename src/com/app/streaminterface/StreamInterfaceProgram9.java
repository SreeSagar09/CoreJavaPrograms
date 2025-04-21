package com.app.streaminterface;

import java.util.List;
import java.util.stream.Collectors;

import com.app.models.Employee;

public class StreamInterfaceProgram9 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();

		List<Employee> filteredEmployeeList1 = employeeList
				.stream()
				.filter(e -> e.getAge() > 25)
				.collect(Collectors.toList());
		
		System.out.println("---- Age wise filtered List -----");
		filteredEmployeeList1.forEach(e->{
			System.out.println(e.getEname()+" -- "+e.getAge());
		});
		
		List<Employee> filteredEmployeeList2 = employeeList
				.stream()
				.filter(e->e.getEsal()>=30000)
				.collect(Collectors.toList());
		
		System.out.println("---- Salary wise filtered List-----");
		filteredEmployeeList2.forEach(e->{
			System.out.println(e.getEname()+" -- "+e.getEsal());
		});
	}
}
