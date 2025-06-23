package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.app.models.Employee;

public class ComparatorInterfaceProgram6 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Function<Employee, String> enameFunction = new Function<Employee, String>() {
			@Override
			public String apply(Employee employee) {
				return employee.getEname();
			}
		};
		
		Function<Employee, Integer> ageFunction = (employee)->employee.getAge();
		
		Function<Employee, Double> esalFunction = Employee::getEsal;
		
		
		Comparator<Employee> enameComparator = Comparator.comparing(enameFunction);
		
		Comparator<Employee> ageComparator = Comparator.comparing(ageFunction);
		
		Comparator<Employee> esalComparator = Comparator.comparing(esalFunction);
		
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