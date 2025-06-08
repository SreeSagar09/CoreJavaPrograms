package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram2 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Comparator<Employee> enameAcsendingComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEname().compareToIgnoreCase(o2.getEname());
			}
		};
		
		Comparator<Employee> ageDescendingComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o2.getAge().compareTo(o1.getAge());
			}
		};
		
		employeeList.sort(enameAcsendingComparator);
		System.out.println("------- Sorting ascending order by ename ------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(ageDescendingComparator);
		System.out.println("------- Sorting descending order by age");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
	}
}
