package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram7 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Comparator<Employee> enameAscendingComparator = Comparator
				.comparing(e->e.getEname(), (o1, o2) ->o1.compareToIgnoreCase(o2));
		
		Comparator<Employee> enameDescendingComparator = Comparator
				.comparing(e->e.getEname(), (o1, o2) ->o2.compareToIgnoreCase(o1));
		
		Comparator<Employee> esalAscendingComparator = Comparator
				.comparing(e->e.getEsal(), (o1, o2) ->o1.compareTo(o2));
		
		Comparator<Employee> esalDescendingComparator = Comparator
				.comparing(e->e.getEsal(), (o1, o2) ->o2.compareTo(o1));
		
		employeeList.sort(enameAscendingComparator);
		System.out.println("----- Sorting ename by ascending order -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(enameDescendingComparator);
		System.out.println("----- Sorting ename by descending order -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(esalAscendingComparator);
		System.out.println("----- Sorting esal by ascending order ------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(esalDescendingComparator);
		System.out.println("------ Sorting esal by descending order ------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}