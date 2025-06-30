package com.app.streaminterface;

import java.util.List;
import java.util.function.Predicate;

import com.app.models.Employee;

public class StreamInterfaceProgram25 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Predicate<Employee> agePredicate = new Predicate<Employee>() {
			@Override
			public boolean test(Employee e) {
				return e.getAge()>=21;
			}
		};
		
		Predicate<Employee> salaryPredicate = (e)->{
			return e.getEsal()>=25000d;
		}; 
		
		boolean anyAgeMatched = employeeList.stream().anyMatch(agePredicate);
		System.out.println("--- Any employee age greaterthan or equals to 25 ---");
		System.out.println(anyAgeMatched);
		
		boolean allAgeMatched = employeeList.stream().allMatch(agePredicate);
		System.out.println("--- All employees age greaterthan or equals to 25 ---");
		System.out.println(allAgeMatched);
		
		boolean noneAgeMatched = employeeList.stream().noneMatch(agePredicate);
		System.out.println("--- No employees age greaterthan or equals to 25 ---");
		System.out.println(noneAgeMatched);
		
		boolean anySalaryMatched = employeeList.stream().anyMatch(salaryPredicate);
		System.out.println("--- Any employee age greaterthan or equals to 25000.00 ---");
		System.out.println(anySalaryMatched);
		
		boolean allSalaryMatched = employeeList.stream().allMatch(salaryPredicate);
		System.out.println("--- All employees age greaterthan or equals to 25000.00 ---");
		System.out.println(allSalaryMatched);
		
		boolean noneSalaryMatched = employeeList.stream().noneMatch(salaryPredicate);
		System.out.println("--- No employees age greaterthan or equals to 25000.00 ---");
		System.out.println(noneSalaryMatched);
	}
}
