package com.app.models;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Student implements Comparable<Student> {
	private String studentId;
	private String firstName;
	private String lastName;
	private String fullName;
	private Integer age;
	private Double courseFee;
	private List<Long> phoneNumbers;
	
	public Student() {
		super();
	}

	public Student(String studentId, String firstName, String lastName, Integer age, Double courseFee,
			List<Long> phoneNumbers) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.courseFee = courseFee;
		this.phoneNumbers = phoneNumbers;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		if(this.firstName != null && this.lastName != null) {
			this.fullName = this.firstName+" "+this.lastName;
		}else if(this.firstName != null) {
			this.fullName = this.firstName;
		}else if(this.lastName != null) {
			this.fullName = this.lastName;
		}
		return fullName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}

	public List<Long> getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(List<Long> phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(studentId, other.studentId);
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName + ", fullName="
				+ getFullName() + ", age=" + age + ", courseFee=" + courseFee + ", phoneNumbers=" + phoneNumbers + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.getFullName().compareToIgnoreCase(o.getFullName());
	}
	
	public static List<Student> getStudentList(){
		List<Student> list = new LinkedList<>();
		
		Student s1 = new Student("S001", "Ravi", "Rajam", 25, 25000d, List.of(9876543210l,9876543201l, 9876543021l));
		Student s2 = new Student("S002", "Akash", "Komma", 21, 28000d, List.of(9876540321l,9876504321l, 9876054321l, 9870543201l, 9806543021l));
		Student s3 = new Student("S003", "Avinath", "Karre", 26, 30000d, List.of(9870654321l));
		Student s4 = new Student("S004", "Zaffer", "MD", 29, 35000d, List.of(9876543200l,9876543001l));
		Student s5 = new Student("S005", "Ganesh", "Poly", 31, 29000d, List.of(9876543010l,9876540201l, 9876503021l));
		Student s6 = new Student("S006", "Vijay", "Peddi", 22, 28500d, List.of(9876043210l,9870543201l, 9806543021l, 9876540021l));
		Student s7 = new Student("S007", "Mahi", "", 26, 28500d, List.of());
		
		list.add(s1);list.add(s2);list.add(s3);
		list.add(s4);list.add(s5);list.add(s6);list.add(s7);
		
		return list;
	}
	
}
