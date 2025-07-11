package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.app.models.Employee;

public class ComparatorInterfaceProgram19 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(2, new Employee("E06", "Akhil", null, 50000.0));
		employeeList.add(5, new Employee("E07", "Raghu", null, 40000.0));
		
		Comparator<Employee> nullValueElementFirstComparator = (e1, e2)->{
			if(e1.getAge() == null) {
				return e2.getAge() == null? 0 : -1;
			}else if(e2.getAge() == null) {
				return 1;
			}else {
				return e1.getAge().compareTo(e2.getAge());
			}
		};
		
		Function<Employee, Integer> ageFunction = (employee)->employee.getAge();
		
		Comparator<Integer> integerAscComparator = (i1, i2)->i1.compareTo(i2);
		
		Comparator<Employee> nullValueElementFirstComparator1 = Comparator
				.comparing(ageFunction, Comparator.nullsFirst(integerAscComparator));
		
		employeeList.sort(nullValueElementFirstComparator);
		System.out.println("----- Sorting age by ascending order and value elements will come first -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(nullValueElementFirstComparator1);
		System.out.println("----- Sorting age by ascending order and value elements will come first -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
