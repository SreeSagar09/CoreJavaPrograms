package com.app.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.demo.Employee;

public class MapMethodExamples {

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
		
		//To get ename List
		List<String> enameList = empList.stream().map(Employee::getEname).collect(Collectors.toList());
		System.out.println("-------------Ename List-------------");
		enameList.forEach(System.out::println);
		
		//To get Tester dept Employee List
		List<Employee> deptList = empList.stream().filter(e->{return e.getDept().equalsIgnoreCase("Tester");}).map(e->{return e;}).collect(Collectors.toList());
		System.out.println("----------Tester Dept Employee List------------");
		deptList.forEach(System.out::println);
		
		//To Get particular age and above age Employees Map
		Map<String, Employee> empMap = empList.stream().filter(e->{return e.getAge()>24;}).map(e->{return e;}).collect(Collectors.toMap(Employee::getEmpId, e->{return e;}));
		System.out.println("---------Particular Age Employee Map-------------");
		empMap.forEach((s,e)->{System.out.println(s+"==>"+e);});
		
		//To get ename and join with delimiter
		String enameString = empList.stream().map(Employee::getEname).collect(Collectors.joining("-")).toString();
		System.out.println("----------Employee Names join with delimiter----------");
		System.out.println(enameString);

	}

}
