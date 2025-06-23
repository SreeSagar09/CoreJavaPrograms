package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToLongFunction;

import com.app.models.Employee;

public class ComparatorInterfaceProgram5 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		ToLongFunction<Employee> ageToLongFunction = Employee::getAge;
		
		Comparator<Employee> ageComparator = Comparator.comparingLong(ageToLongFunction);
	
		employeeList.sort(ageComparator);
		System.out.println("----- Sorting age by ascending order -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
