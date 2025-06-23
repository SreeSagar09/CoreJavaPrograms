package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.app.models.Employee;

public class ComparatorInterfaceProgram7 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Function<Employee, String> enameFunction = (employee)->employee.getEname();
		
		Function<Employee, Double> esalFunction = (employee)->employee.getEsal();
		
		
		Comparator<String> stringAscComparator = (s1, s2)->s1.compareToIgnoreCase(s2);
		
		Comparator<String> stringDescComparator = (s1, s2)->s2.compareToIgnoreCase(s1);
		
		Comparator<Double> doubleAscComparator = (d1, d2)->d1.compareTo(d2);
		
		Comparator<Double> doubleDescComparator = (d1, d2)->d2.compareTo(d1);
		
		
		Comparator<Employee> enameAscComparator = Comparator
				.comparing(enameFunction, stringAscComparator);
		
		Comparator<Employee> enameDescComparator = Comparator
				.comparing(enameFunction, stringDescComparator);
		
		Comparator<Employee> esalAscComparator = Comparator
				.comparing(esalFunction, doubleAscComparator);
		
		Comparator<Employee> esalDescComparator = Comparator
				.comparing(esalFunction, doubleDescComparator);
		
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