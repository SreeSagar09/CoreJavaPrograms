package com.app.streaminterface;

import java.util.List;
import java.util.stream.Stream;

import com.app.models.Student;

public class StreamInterfaceProgram13 {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		
		Stream<Student> zeroSkippedStudentStream = studentList.stream().skip(0);
		
		System.out.println("----- Students are skipped upto zero ------");
		zeroSkippedStudentStream.forEach(System.out::println);
		
		Stream<Student> threeSkippedStudentStream = studentList.stream().skip(3);
		
		System.out.println("----- Students are skipped upto three ------");
		threeSkippedStudentStream.forEach(System.out::println);
		
		Stream<Student> longMaxSkippedStudentStream = studentList.stream().skip(Long.MAX_VALUE);
		
		System.out.println("----- Students are skipped upto Long max value ------");
		longMaxSkippedStudentStream.forEach(System.out::println);
	}
}
