package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram7 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Comparator<Employee> enameAscComparator = Comparator
				.comparing(e->e.getEname(), (o1, o2) ->o1.compareToIgnoreCase(o2));
		
		Comparator<Employee> enameDescComparator = Comparator
				.comparing(e->e.getEname(), (o1, o2) ->o2.compareToIgnoreCase(o1));
		
		Comparator<Employee> esalAscComparator = Comparator
				.comparing(e->e.getEsal(), (o1, o2) ->o1.compareTo(o2));
		
		Comparator<Employee> esalDescComparator = Comparator
				.comparing(e->e.getEsal(), (o1, o2) ->o2.compareTo(o1));
		
		employeeList.sort(enameAscComparator);
		System.out.println("----- Sorting ename by ascending order -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(enameDescComparator);
		System.out.println("----- Sorting ename by descending order -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(esalAscComparator);
		System.out.println("----- Sorting esal by ascending order ------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(esalDescComparator);
		System.out.println("------ Sorting esal by descending order ------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}