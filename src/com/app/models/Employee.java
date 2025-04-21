package com.app.models;

import java.util.LinkedList;
import java.util.List;

public class Employee {
	private String eid;
	private String ename;
	private Integer age;
	private Double esal;
	
	public String getEid() {
		return eid;
	}

	public void setEid(String eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getEsal() {
		return esal;
	}

	public void setEsal(Double esal) {
		this.esal = esal;
	}

	public Employee() {
	}
	
	public Employee(String eid, String ename, Integer age, Double esal) {
		this.eid = eid;
		this.ename = ename;
		this.age = age;
		this.esal = esal;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", age=" + age + ", esal=" + esal + "]";
	}

	public static List<Employee> getEmployeesList(){
		List<Employee> employeesList = new LinkedList<>();
		Employee e1 = new Employee("E01", "Akash", 25, 25000.0);
		Employee e2 = new Employee("E02", "Mukesh", 29, 35000.0);
		Employee e3 = new Employee("E05", "Vignesh", 28, 30000.0);
		Employee e4 = new Employee("E03", "Ramesh", 21, 19000.0);
		Employee e5 = new Employee("E04", "Avinash", 31, 55000.0);
		
		employeesList.add(e1);
		employeesList.add(e2);
		employeesList.add(e3);
		employeesList.add(e4);
		employeesList.add(e5);
		
		return employeesList;
	}
}
