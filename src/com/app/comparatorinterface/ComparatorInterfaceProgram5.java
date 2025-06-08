package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram5 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Comparator<Employee> ageLengthComparator = Comparator.comparingLong(e->e.getAge());
	
		employeeList.sort(ageLengthComparator);
		System.out.println("----- Sorting age by ascending order -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
