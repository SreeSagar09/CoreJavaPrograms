package com.app.streaminterface;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import com.app.models.Student;

public class StreamInterfaceProgram7 {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		
		Function<Student, Stream<Long>> phoneNoStreamFun = (s)->s.getPhoneNumbers().stream();
		
		Stream<Long> phoneNumberStream = studentList.stream().flatMap(phoneNoStreamFun);
		
		System.out.println("----- All Students PhoneNumber List -----");
		phoneNumberStream.forEach(pn->{
			System.out.println(pn);
		});
	}
}
