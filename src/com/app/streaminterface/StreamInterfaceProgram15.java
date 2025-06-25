package com.app.streaminterface;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.app.models.Student;

public class StreamInterfaceProgram15 {
	public static void main(String[] args) {
List<Student> unSortedStudentList = Student.getStudentList();
		
		List<Student> ageAscSortedStudentList = Student.getStudentList();
		ageAscSortedStudentList.sort((s1, s2)->s1.getAge().compareTo(s2.getAge()));
		
		Predicate<Student> agePredicate = (s)->s.getAge()<=25;
		
		Stream<Student> studentStream1 = unSortedStudentList.stream().dropWhile(agePredicate);
		
		System.out.println("----- drop while age lessthan or equals to 25 from unSorted List -----");
		studentStream1.forEach(s->{
			System.out.println(s);
		});
		
		Stream<Student> studentStream2 = ageAscSortedStudentList.stream().dropWhile(agePredicate);
		
		System.out.println("----- drop while age lessthan or equals to 25 from sorted List -----");
		studentStream2.forEach(s->{
			System.out.println(s);
		});
	}
}
