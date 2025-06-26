package com.app.streaminterface;

import java.util.List;
import java.util.function.IntFunction;

import com.app.models.Employee;

public class StreamInterfaceProgram18 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		IntFunction<Employee[]> employeeIntFunction = new IntFunction<Employee[]>() {
			@Override
			public Employee[] apply(int size) {
				return new Employee[size];
			}
		};
		
		IntFunction<String[]> enameIntFunction = (size) ->{
			return new String[size];
		};
		
		Employee[] employeeArray = employeeList.stream().toArray(employeeIntFunction);
		
		System.out.println("------ Traversing employee array ------");
		for(Employee e : employeeArray) {
			System.out.println(e);
		}
		
		String[] enameArray = employeeList.stream().map(e->e.getEname()).toArray(enameIntFunction);
		
		System.out.println("------- Traversing ename array -------");
		for(String en : enameArray) {
			System.out.println(en);
		}
		
	}
}
