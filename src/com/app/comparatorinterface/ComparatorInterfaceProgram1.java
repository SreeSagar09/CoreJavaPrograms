package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram1 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		// Implementing comparator by anonymous inner class
		Comparator<Employee> eNameComparator = new Comparator<Employee>() {
			@Override
			public int compare(Employee o1, Employee o2) {
				return o1.getEname().compareToIgnoreCase(o2.getEname());
			}
		};
		
		// Implementing comparator by lambda expression
		Comparator<Employee> ageComparator = (o1, o2) -> {
			return o1.getAge().compareTo(o2.getAge());
		};
		
		employeeList.sort(eNameComparator);
		System.out.println("--------- Sorting by ename ---------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(ageComparator);
		System.out.println("---------- Sorting by age ----------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
	}
}
