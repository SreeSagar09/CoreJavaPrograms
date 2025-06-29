package com.app.streaminterface;

import java.util.List;

import com.app.models.Employee;

public class StreamInterfaceProgram22 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		List<Employee> unmodifiableEmployeeList = employeeList.stream()
				.toList();
		
		List<String> unmodifiableEnameList = employeeList.stream()
				.map(e->e.getEname()).toList();
		
		List<String> unmodifiableEnameAndEidList = employeeList.stream()
				.map(e->e.getEname()+"["+e.getEid()+"]").toList();
		
		System.out.println("------- Unmodifiable employee list -------");
		unmodifiableEmployeeList.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("------- Unmodifiable ename list --------");
		unmodifiableEnameList.forEach(ename->{
			System.out.println(ename);
		});
		
		System.out.println("-------- Unmodifiable ename and eid list --------");
		unmodifiableEnameAndEidList.forEach(enameAndEid->{
			System.out.println(enameAndEid);
		});
	}
}
