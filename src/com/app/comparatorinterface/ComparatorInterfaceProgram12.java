package com.app.comparatorinterface;

import java.util.Comparator;
import java.util.List;

import com.app.models.Employee;

public class ComparatorInterfaceProgram12 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		employeeList.add(new Employee("E06", "Akash", 20, 24000.0));
		employeeList.add(new Employee("E07", "Ramesh", 22, 18000.0));
		
		Comparator<Employee> enameAscendingComparator = (o1, o2)->o1.getEname().compareToIgnoreCase(o2.getEname()); 
		
		Comparator<Employee> thenEsalAscComparator = enameAscendingComparator
				.thenComparingDouble(e->e.getEsal());
		
		employeeList.sort(thenEsalAscComparator);
		System.out.println("--- Sorting ename by ascending order and then sorting esal by ascending order ---");
		employeeList.forEach(e->{
			System.out.println(e);
		});
	}
}
