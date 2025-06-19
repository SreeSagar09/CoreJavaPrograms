package com.app.collectorsclass;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.app.models.Employee;

public class CollectorsClassProgram1 {
	public static void main(String[] args) {
		List<Employee> employeeList = Employee.getEmployeesList();
		
		Supplier<ArrayList<Employee>> arrayListSupplier = new Supplier<ArrayList<Employee>>() {
			@Override
			public ArrayList<Employee> get() {
				return new ArrayList<>();
			}
		};
		
		Supplier<LinkedList<Employee>> linkedListSupplier = ()->new LinkedList();
		
		Supplier<HashSet<Employee>> hashSetSupplier = HashSet::new;
		
		System.out.println("----- Collection to ArrayList -----");
		ArrayList<Employee> arrayList = employeeList.stream().collect(Collectors.toCollection(arrayListSupplier));
		arrayList.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("----- Collecton to LinkedList -----");
		LinkedList<Employee> linkedList = employeeList.stream().collect(Collectors.toCollection(linkedListSupplier));
		linkedList.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("----- Collection to HashSet -----");
		HashSet<Employee> hashSet = employeeList.stream().collect(Collectors.toCollection(hashSetSupplier));
		hashSet.forEach(e->{
			System.out.println(e);
		});
	}
}
