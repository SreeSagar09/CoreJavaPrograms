package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram16 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(new Employee("E06", "Avinash", 30, 54000.0));
		employeeList.add(new Employee("E07", "Ramesh", 22, 20000.0));
		
		Comparator<Employee> enameAscComparator = (e1, e2)->e1.getEname().compareToIgnoreCase(e2.getEname());
		
		Comparator<Employee> thenAgeAscComparator = enameAscComparator
				.thenComparing(e->e.getAge(), (a1, a2)->a1.compareTo(a2));
		
		Comparator<Employee> thenAgeDescComparator = enameAscComparator
				.thenComparing(e->e.getAge(), (a1, a2)->a2.compareTo(a1));
		
		Comparator<Employee> thenEsalAscComaparator = enameAscComparator
				.thenComparing(e->e.getEsal(), (s1, s2)->s1.compareTo(s2));
		
		Comparator<Employee> thenEsalDescComparator = enameAscComparator
				.thenComparing(e->e.getEsal(), (s1, s2)->s2.compareTo(s1));
		
		employeeList.sort(thenAgeAscComparator);
		System.out.println("--- Sorting ename by ascending order and then sorting age by ascending order ---");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(thenAgeDescComparator);
		System.out.println("--- Sorting ename by ascending order and then sorting age by descending order ---");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(thenEsalAscComaparator);
		System.out.println("--- Sorting ename by ascending order and then sorting esal by ascending order ---");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(thenEsalDescComparator);
		System.out.println("--- Sorting ename by ascending order and then sorting esal by descending order ---");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
