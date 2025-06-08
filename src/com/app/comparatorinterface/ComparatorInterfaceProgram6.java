package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram6 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Comparator<Employee> enameComparator = Comparator.comparing(e->e.getEname());
		
		Comparator<Employee> ageComparator = Comparator.comparing(e->e.getAge());
		
		Comparator<Employee> esalComparator = Comparator.comparing(e->e.getEsal());
		
		employeeList.sort(enameComparator);
		System.out.println("----- Sorting ename by ascending order -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(ageComparator);
		System.out.println("----- Sorting age by ascending order -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(esalComparator);
		System.out.println("----- Sorting esal by ascending order -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}