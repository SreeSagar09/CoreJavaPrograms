package com.app.optionalclass;

import java.util.Optional;

public class OptionalClassProgram13 {
	public static void main(String[] args) {
		Optional<String> stringOptional1 = Optional.of("Mamidala Sree Sagar");

		Optional<String> stringOptional2 = Optional.ofNullable(null);

		String resultedString1 = stringOptional1.orElse("No value");

		System.out.println("----- orElse method with non-null optional value -----");
		System.out.println(resultedString1);

		String resultedString2 = stringOptional2.orElse("No value");

		System.out.println("----- orElse method with null optional value -----");
		System.out.println(resultedString2);
	}
}
