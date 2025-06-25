package com.app.streaminterface;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import com.app.models.Student;

public class StreamInterfaceProgram10 {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		
		Comparator<Student> fullNameAscComparator = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getFullName().compareToIgnoreCase(s2.getFullName());
			} 
		};
		
		Comparator<Student> fullNameDescComparator = (s1, s2)->s2.getFullName().compareToIgnoreCase(s1.getFullName());
		
		Comparator<Student> ageAscComparator = (s1, s2)->s1.getAge().compareTo(s2.getAge());
		
		Comparator<Student> ageDescComparator = (s1, s2)->s2.getAge().compareTo(s1.getAge());
		
		
		Stream<Student> studentStream1 = studentList.stream().sorted(fullNameAscComparator);
		
		System.out.println("----- Student fullName sorted by ascending order -----");
		studentStream1.forEach(e->{
			System.out.println(e);
		});
		
		Stream<Student> studentStream2 = studentList.stream().sorted(fullNameDescComparator);
		
		System.out.println("----- Student fullName sorted by descending order -----");
		studentStream2.forEach(e->{
			System.out.println(e);
		});
		
		Stream<Student> studentStream3 = studentList.stream().sorted(ageAscComparator);
		
		System.out.println("----- Student age sorted by ascending order -----");
		studentStream3.forEach(e->{
			System.out.println(e);
		});
		
		Stream<Student> studentStream4 = studentList.stream().sorted(ageDescComparator);
		
		System.out.println("----- Student age sorted by descending order -----");
		studentStream4.forEach(e->{
			System.out.println(e);
		});
	}
}
