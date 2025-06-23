package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import com.app.models.Employee;

public class ComparatorInterfaceProgram20 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(2, new Employee("E06", "Akhil", null, 50000.0));
		employeeList.add(5, new Employee("E07", "Raghu", null, 40000.0));
		
		Comparator<Employee> nullValueElementLastComparator = (e1, e2)->{
			if(e1.getAge() == null) {
				return e2.getAge() == null? 0 : 1;
			}else if(e2.getAge() == null) {
				return -1;
			}else {
				return e1.getAge().compareTo(e2.getAge());
			}
		};
		
		Function<Employee, Integer> ageFunction = (employee)->employee.getAge();
		
		Comparator<Integer> integerAscComparator = (i1, i2)->i1.compareTo(i2);
		
		Comparator<Employee> nullValueElementLastComparator1 = Comparator
				.comparing(ageFunction, Comparator.nullsLast(integerAscComparator));
		
		employeeList.sort(nullValueElementLastComparator);
		System.out.println("----- Sorting age by ascending order and value elements will come last -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
		
		employeeList.sort(nullValueElementLastComparator1);
		System.out.println("----- Sorting age by ascending order and value elements will come last -----");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
