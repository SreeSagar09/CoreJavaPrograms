package com.demo;

public class Employee {
	private String empId;
	private String ename;
	private Integer age;
	private Double sal;
	private String dept;
	
	
	public Employee() {
		super();
	}

	public Employee(String empId, String ename, Integer age, Double sal, String dept) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.age = age;
		this.sal = sal;
		this.dept = dept;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
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

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", ename=" + ename + ", age=" + age + ", sal=" + sal + ", dept=" + dept
				+ "]";
	}

	public static void main(String[] args) {
		

	}

}
