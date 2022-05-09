package com.app.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.Employee;

public class SortingExamples {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(new Employee("T103", "Ramesh", 25, 23400.0, "Developer"));
		empList.add(new Employee("T102", "Aravindh", 27, 27400.0, "Tester"));
		empList.add(new Employee("T104", "Mahesh", 23, 20000.0, "Developer"));
		empList.add(new Employee("T101", "Raghu", 31, 23400.0, "Developer"));
		empList.add(new Employee("T106", "Vikram", 29, 28990.0, "Tester"));
		empList.add(new Employee("T105", "Pragathi", 21, 26000.0, "Hr"));
		empList.add(new Employee("T107", "Vinay", 24, 24000.0, "Tester"));
		empList.add(new Employee("T108", "John", 21, 22000.0, "Tester"));
		
		//To Sorted with the Ename
		System.out.println("-----------Sorted with ename------------");
		List<Employee> enameSortedList = empList.stream().sorted((c1,c2)->{return c1.getEname().compareToIgnoreCase(c2.getEname());}).collect(Collectors.toList());
		enameSortedList.forEach(e->System.out.println(e.getEname()));
		
		//To Sorted with the empId
		System.out.println("-----------Sorted with empId------------");
		List<Employee> empIdSortedList = empList.stream().sorted((i1,i2)->{return i1.getEmpId().compareToIgnoreCase(i2.getEmpId());}).collect(Collectors.toList());
		empIdSortedList.forEach(e->{System.out.println(e.getEmpId());});
		
		//To Sorted with the age
		System.out.println("-----------Sorted with age------------");
		List<Employee> ageSortedList = empList.stream().sorted((a1,a2)->{return a1.getAge().compareTo(a2.getAge());}).collect(Collectors.toList());
		ageSortedList.forEach(e->{System.out.println(e.getEname()+"->"+e.getAge());});
	}

}
