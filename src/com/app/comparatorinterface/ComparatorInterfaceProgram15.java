package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.app.models.Employee;

public class ComparatorInterfaceProgram15 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(new Employee("E06", "Avinash", 30, 54000.0));
		employeeList.add(new Employee("E07", "Ramesh", 22, 20000.0));
		
		Comparator<Employee> enameAscComparator = (e1, e2)->e1.getEname().compareToIgnoreCase(e2.getEname());
		
		
		Function<Employee, Integer> ageFunction = (employee)->employee.getAge();
		
		Function<Employee, Double> esalFunction = (employee)->employee.getEsal();
		
		
		Comparator<Employee> thenAgeAscComparator = enameAscComparator
				.thenComparing(ageFunction);
		
		Comparator<Employee> thenEsalAscComparator = enameAscComparator
				.thenComparing(esalFunction);
		
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
