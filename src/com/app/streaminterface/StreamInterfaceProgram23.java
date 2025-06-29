package com.app.streaminterface;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

import com.app.models.Employee;

public class StreamInterfaceProgram23 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Comparator<Employee> salAscEmployeeComparator = (e1, e2)->{
			return e1.getEsal().compareTo(e2.getEsal());
		};
		
		Comparator<Integer> integerAscComparator = (i1, i2)->{
			return i1.compareTo(i2);
		};
		
		Optional<Employee> minimumSalEmployeeOptional = employeeList.stream()
				.min(salAscEmployeeComparator);
		
		System.out.println("---- Minimum salary employee -----");
		System.out.println(minimumSalEmployeeOptional.orElse(null));
		
		Optional<Employee> maximumsalEmployeeOptional = employeeList.stream()
				.max(salAscEmployeeComparator);
		
		System.out.println("---- Maximum salary employee -----");
		System.out.println(maximumsalEmployeeOptional.orElse(null));
		
		Optional<Integer> minimumAgeOptional =  employeeList.stream()
				.map(e->e.getAge()).min(integerAscComparator);
		
		System.out.println("----- Minimum age -----");
		System.out.println(minimumAgeOptional.orElse(null));
		
		Optional<Integer> maximumAgeOptional = employeeList.stream()
				.map(e->e.getAge()).max(integerAscComparator);
		
		System.out.println("------ Maximum age ------");
		System.out.println(maximumAgeOptional.orElse(null));
	}
}
