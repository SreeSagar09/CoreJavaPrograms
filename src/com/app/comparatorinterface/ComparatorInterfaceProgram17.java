package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram17 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(new Employee("E06", "Avinash", 30, 54000.0));
		employeeList.add(new Employee("E07", "Ramesh", 22, 20000.0));
		
		Comparator<Employee> enameAscComparator = (e1, e2)->e1.getEname().compareToIgnoreCase(e2.getEname());
		
		Comparator<Employee> ageAscComparator = (e1, e2)->e1.getAge().compareTo(e2.getAge());
		
		Comparator<Employee> ageDescComparator = (e1, e2)->e2.getAge().compareTo(e1.getAge());
		
		Comparator<Employee> enameAscAndThenAgeAscComparator = enameAscComparator
				.thenComparing(ageAscComparator);
		
		Comparator<Employee> enameAscAndThenAgeDescComparator = enameAscComparator
				.thenComparing(ageDescComparator);
		
		employeeList.sort(enameAscAndThenAgeAscComparator);
		System.out.println("--- Sorting ename by ascending order and then sorting age by ascending order ---");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(enameAscAndThenAgeDescComparator);
		System.out.println("--- Sorting ename by ascending order and then sorting age by descending order ---");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
