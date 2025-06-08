package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram11 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Comparator<Employee> reverseOrderComparator = Comparator.reverseOrder();
		
		employeeList.sort(reverseOrderComparator);
		System.out.println("---- Employee object reverse order ----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
