package com.app.optionalclass;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalClassProgram14 {
	public static void main(String[] args) {
		Optional<String> stringOptional1 = Optional.of("Mamidala Sree Sagar");

		Optional<String> stringOptional2 = Optional.ofNullable(null);
		
		Supplier<String> stringSupplier = new Supplier<String>() {
			@Override
			public String get() {
				return "No value";
			}
		};

		String resultedString1 = stringOptional1.orElseGet(stringSupplier);

		System.out.println("----- orElseGet method with non-null optional value -----");
		System.out.println(resultedString1);

		String resultedString2 = stringOptional2.orElseGet(stringSupplier);

		System.out.println("----- orElseGet method with null optional value -----");
		System.out.println(resultedString2);
	}
}
