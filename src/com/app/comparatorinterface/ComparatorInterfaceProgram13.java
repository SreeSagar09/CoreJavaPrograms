package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram13 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(new Employee("E06", "Mukesh", 28, 35000.0));
		employeeList.add(new Employee("E07", "Ramesh", 22, 19000.0));
		
		Comparator<Employee> enameAscComparator = (o1, o2) ->o1.getEname().compareToIgnoreCase(o2.getEname());
	
		Comparator<Employee> thenAgeAscComparator = enameAscComparator
				.thenComparingInt(e->e.getAge());
		
		employeeList.sort(thenAgeAscComparator);
		System.out.println("--- Sorting ename by ascending order and then sorting age by ascending order ---");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
