package com.app.streaminterface;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.app.models.Employee;

public class StreamInterfaceProgram26 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Predicate<Employee> enamePredicate1 = (e)->{
			return e.getEname().equalsIgnoreCase("Ramesh");
		};
		
		Predicate<Employee> enamePredicate2 = (e)->{
			return e.getEname().equalsIgnoreCase("Raju");
		};
		
		Optional<Employee> employeeOptional1 = employeeList.stream()
				.filter(enamePredicate1).findFirst();
		
		System.out.println("--- Ramesh employee ---");
		System.out.println(employeeOptional1.orElse(null));
		
		Optional<Employee> employeeOptional2 = employeeList.stream()
				.filter(enamePredicate2).findAny();
		
		System.out.println("--- Raju employee ---");
		System.out.println(employeeOptional2.orElse(null));
	}
}
