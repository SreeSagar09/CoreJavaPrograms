package com.app.streaminterface;

import java.util.List;
import java.util.stream.Stream;

import com.app.models.Student;

public class StreamInterfaceProgram12 {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		
		Stream<Student> zeroLimitedStudentStream = studentList.stream().limit(0);
		
		System.out.println("----- Students are limited upto zero ------");
		zeroLimitedStudentStream.forEach(System.out::println);
		
		Stream<Student> twoLimitedStudentStream = studentList.stream().limit(2);
		
		System.out.println("----- Students are limited upto two ------");
		twoLimitedStudentStream.forEach(System.out::println);
		
		Stream<Student> fourLimitedStudentStream = studentList.stream().limit(4);
		
		System.out.println("----- Students are limited upto four ------");
		fourLimitedStudentStream.forEach(System.out::println);
		
		Stream<Student> longMaxLimitedStudentStream = studentList.stream().limit(Long.MAX_VALUE);
		
		System.out.println("----- Students are limited upto Long max value ------");
		longMaxLimitedStudentStream.forEach(System.out::println);
	}
}
