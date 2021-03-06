package com.app.streams;

import java.util.ArrayList;
import java.util.stream.Stream;

import com.demo.Employee;

// Filter Example Programs
public class FiltersExamples {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("T103", "Ramesh", 25, 23400.0, "Developer"));
		empList.add(new Employee("T102", "Aravindh", 27, 27400.0, "Tester"));
		empList.add(new Employee("T104", "Mahesh", 23, 20000.0, "Developer"));
		empList.add(new Employee("T101", "Raghu", 31, 23400.0, "Developer"));
		empList.add(new Employee("T106", "Vikram", 29, 28990.0, "Tester"));
		empList.add(new Employee("T105", "Pragathi", 21, 26000.0, "Hr"));
		
		
		//Filter with dept
		Stream<Employee> deptStream = empList.stream().filter(e->e.getDept().equalsIgnoreCase("Developer"));
		
		deptStream.forEach(e->{
			System.out.println(e.getEname()+" "+e.getDept());
		});
		
		//Filter with age
		Stream<Employee> salStream = empList.stream().filter(e->e.getAge()>25);
		
		salStream.forEach(e->{System.out.println(e.getEname()+" "+e.getSal());});

	}

}
