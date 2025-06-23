package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

import com.app.models.Employee;

public class ComparatorInterfaceProgram13 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(new Employee("E06", "Mukesh", 28, 35000.0));
		employeeList.add(new Employee("E07", "Ramesh", 22, 19000.0));
		
		Comparator<Employee> enameAscComparator = (e1, e2) ->e1.getEname().compareToIgnoreCase(e2.getEname());
		
		ToIntFunction<Employee> ageToIntFunction = (employee)->employee.getAge();
		
		Comparator<Employee> thenAgeAscComparator = enameAscComparator.thenComparingInt(ageToIntFunction);
		
		employeeList.sort(thenAgeAscComparator);
		System.out.println("--- Sorting ename by ascending order and then sorting age by ascending order ---");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
