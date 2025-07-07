package com.app.optionalclass;

import java.util.Optional;
import java.util.function.Function;

import com.app.models.Employee;

public class OptionalClassProgram9 {
	public static void main(String[] args) {
		Optional<Employee> employeeOptional1 = Optional.of(new Employee("E03", "Ramesh", 21, 19000.0));
		
		Optional<Employee> employeeOptional2 = Optional.ofNullable(null);
		
		Function<Employee, String> enameAndEidFunction = new Function<Employee, String>() {
			@Override
			public String apply(Employee employee) {
				return employee.getEname()+"["+employee.getEid()+"]";
			}
		};
		
		Optional<String> enameAndEidOptional1 = employeeOptional1.map(enameAndEidFunction);
		
		System.out.println("----- map method with non-null optional value -----");
		System.out.println(enameAndEidOptional1);
	
		Optional<String> enameAndEidOptional2 = employeeOptional2.map(enameAndEidFunction);
		
		System.out.println("----- map method with non-null optional value -----");
		System.out.println(enameAndEidOptional2);
	}
}
