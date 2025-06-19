package com.app.streaminterface;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import com.app.models.Student;

public class StreamInterfaceProgram7 {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		
		Function<Student, Stream<Long>> phoneNoStreamFun = (s)->s.getPhoneNumbers().stream();
		
		List<Long> phoneNumberList = studentList.stream().flatMap(phoneNoStreamFun).toList();
		
		System.out.println("----- All Students PhoneNumber List -----");
		phoneNumberList.forEach(pn->{
			System.out.println(pn);
		});
	}
}
