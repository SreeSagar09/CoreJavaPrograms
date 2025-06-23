package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.app.models.Employee;

public class ComparatorInterfaceProgram16 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(new Employee("E06", "Avinash", 30, 54000.0));
		employeeList.add(new Employee("E07", "Ramesh", 22, 20000.0));
		
		Comparator<Employee> enameAscComparator = (e1, e2)->e1.getEname().compareToIgnoreCase(e2.getEname());
		
		
		Function<Employee, Integer> ageFunction = (employee)->employee.getAge();
		
		Function<Employee, Double> esalFunction = (employee)->employee.getEsal();
		
		
		Comparator<Integer> integerAscComparator = (i1, i2)->i1.compareTo(i2);
		
		Comparator<Integer> integerDescComparator = (i1, i2)->i2.compareTo(i1);
		
		Comparator<Double> doubleAscComparator = (d1, d2)->d1.compareTo(d2);
		
		Comparator<Double> doubleDescComparator = (d1, d2)->d2.compareTo(d1);
		
		
		Comparator<Employee> thenAgeAscComparator = enameAscComparator
				.thenComparing(ageFunction, integerAscComparator);
		
		Comparator<Employee> thenAgeDescComparator = enameAscComparator
				.thenComparing(ageFunction, integerDescComparator);
		
		Comparator<Employee> thenEsalAscComaparator = enameAscComparator
				.thenComparing(esalFunction, doubleAscComparator);
		
		Comparator<Employee> thenEsalDescComparator = enameAscComparator
				.thenComparing(esalFunction, doubleDescComparator);
		
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
