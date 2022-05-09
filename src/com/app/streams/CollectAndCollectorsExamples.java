package com.app.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.Employee;

public class CollectAndCollectorsExamples {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("T103", "Ramesh", 25, 23400.0, "Developer"));
		empList.add(new Employee("T102", "Aravindh", 27, 27400.0, "Tester"));
		empList.add(new Employee("T104", "Mahesh", 23, 20000.0, "Developer"));
		empList.add(new Employee("T101", "Raghu", 31, 23400.0, "Developer"));
		empList.add(new Employee("T106", "Vikram", 29, 28990.0, "Tester"));
		empList.add(new Employee("T105", "Pragathi", 21, 26000.0, "Hr"));
		empList.add(new Employee("T107", "Vinay", 24, 24000.0, "Tester"));
		
		//To Count Particular Dept Employees
		Long empCount= empList.stream().filter(e->e.getDept().equalsIgnoreCase("Developer")).collect(Collectors.counting());
		System.out.println("Developer Count is: "+empCount);
		
		//To Tester Empoyees to List
		List<Employee> deptList = empList.stream().filter(e->e.getDept().equalsIgnoreCase("Tester")).collect(Collectors.toList());
		deptList.forEach(e->{System.out.println(e.getEname()+"->"+e.getDept());});
		
		//To Age wise List
		List<Employee> ageList = empList.stream().filter(e->e.getAge()>=25).collect(Collectors.toList());
		ageList.forEach(e->{System.out.println(e.getEname()+"=>"+e.getAge());});
		
	}
}
