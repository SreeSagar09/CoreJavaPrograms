package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram8 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(3, null);
		
		Comparator<Employee> enameAscComparator = Comparator
				.nullsFirst((o1, o2)->o1.getEname().compareToIgnoreCase(o2.getEname()));
		
		Comparator<Employee> enameDescComparator = Comparator
				.nullsFirst((o1, o2)->o2.getEname().compareToIgnoreCase(o1.getEname()));
		
		employeeList.sort(enameAscComparator);
		System.out.println("----- Sorting ename by ascending order ------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(enameDescComparator);
		System.out.println("----- Sorting ename by descending order ------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}