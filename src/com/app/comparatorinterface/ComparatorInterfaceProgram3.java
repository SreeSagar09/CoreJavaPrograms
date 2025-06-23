package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;
import java.util.function.ToDoubleFunction;

import com.app.models.Employee;

public class ComparatorInterfaceProgram3 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		ToDoubleFunction<Employee> esalToDoubleFunction = new ToDoubleFunction<Employee>() {
			@Override
			public double applyAsDouble(Employee employee) {
				return employee.getEsal();
			}
		};
		
		Comparator<Employee> esalComparator = Comparator.comparingDouble(esalToDoubleFunction);
		
		employeeList.sort(esalComparator);
		System.out.println("------ Sorting esal by ascending order -------");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
