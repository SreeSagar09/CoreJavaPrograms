package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram15 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(new Employee("E06", "Avinash", 30, 54000.0));
		employeeList.add(new Employee("E07", "Ramesh", 22, 20000.0));
		
		Comparator<Employee> enameAscendingComparator = (e1, e2)->e1.getEname().compareToIgnoreCase(e2.getEname());
		
		Comparator<Employee> thenAgeAscComparator = enameAscendingComparator
				.thenComparing(e->e.getAge());
		
		Comparator<Employee> thenEsalAscComparator = enameAscendingComparator
				.thenComparing(e->e.getEsal());
		
		employeeList.sort(thenAgeAscComparator);
		System.out.println("--- Sorting ename by ascending order and then sorting age by ascending order ---");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(thenEsalAscComparator);
		System.out.println("--- Sorting ename by ascending order and then sorting esal by ascending order ---");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
