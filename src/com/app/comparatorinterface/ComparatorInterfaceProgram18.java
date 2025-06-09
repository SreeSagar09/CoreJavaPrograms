package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram18 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Comparator<Employee> enameAscComparator = (e1, e2)->e1.getEname().compareToIgnoreCase(e2.getEname());
		
		Comparator<Employee> enameDescComparator = enameAscComparator.reversed();
		
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
	}
}
