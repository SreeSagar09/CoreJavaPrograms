package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.app.models.Employee;

public class ComparatorInterfaceProgram9 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(3, null);
		
		Comparator<Employee> enameAscComparator = (e1, e2)->e1.getEname().compareToIgnoreCase(e2.getEname());
		
		Comparator<Employee> enameDescComparator = (e1, e2)->e2.getEname().compareToIgnoreCase(e1.getEname());
		
		
		Comparator<Employee> nullAscComparator = Comparator.nullsLast(enameAscComparator);
		
		Comparator<Employee> nullDescComparator = Comparator.nullsLast(enameDescComparator);
	
		employeeList.sort(nullAscComparator);
		System.out.println("----- Sorting ename by ascending order -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(nullDescComparator);
		System.out.println("----- Sorting ename by descending order -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
