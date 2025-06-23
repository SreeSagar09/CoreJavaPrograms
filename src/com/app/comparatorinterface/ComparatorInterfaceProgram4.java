package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToIntFunction;

import com.app.models.Employee;

public class ComparatorInterfaceProgram4 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		ToIntFunction<Employee> ageToIntFunction = (employee)->employee.getAge();
		
		Comparator<Employee> ageComparator = Comparator.comparingInt(ageToIntFunction);
		
		employeeList.sort(ageComparator);
		System.out.println("------- Sorting age by ascending order -------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
