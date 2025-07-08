package com.app.optionalclass;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalClassProgram12 {
	public static void main(String[] args) {
		Optional<String> stringOptional1 = Optional.of("Mamidala Sree Sagar");
		
		Optional<String> stringOptional2 = Optional.ofNullable(null);
		
		Stream<String> stringStream1 = stringOptional1.stream();
		
		System.out.println("----- stream method with non-null optional value -----");
		stringStream1.forEach(s->{
			System.out.println(s);
		});
		
		Stream<String> stringStream2 = stringOptional2.stream();
		
		System.out.println("----- stream method with null optional value -----");
		stringStream2.forEach(s->{
			System.out.println(s);
		});
	}
}
