package com.app.collectorsclass;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.app.models.Student;

public class CollectorsClassProgram11 {
	public static void main(String[] args) {
		List<Student> studentList = Student.getStudentList();
		
		Function<Student, Stream<Long>> phoneNumberStreamFunction = (p)->{
			return p.getPhoneNumbers().stream();
		};
		
		Set<Long> phoneNumbersSet = studentList.stream()
				.collect(Collectors.flatMapping(phoneNumberStreamFunction, Collectors.toSet()));
		
		System.out.println("------- Set of phone numbers -------");
		phoneNumbersSet.forEach(ph->{
			System.out.println(ph);
		});
	}
}
