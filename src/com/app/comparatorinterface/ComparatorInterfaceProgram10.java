package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram10 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Comparator<Employee> naturalOrderComparator = Comparator.naturalOrder();
		
		employeeList.sort(naturalOrderComparator);
		System.out.println("---- Employee object natural order ----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
