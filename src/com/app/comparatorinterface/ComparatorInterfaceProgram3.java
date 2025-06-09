package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram3 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Comparator<Employee> esalComparator = Comparator.comparingDouble(e->e.getEsal());
		
		employeeList.sort(esalComparator);
		System.out.println("------ Sorting esal by ascending order -------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
