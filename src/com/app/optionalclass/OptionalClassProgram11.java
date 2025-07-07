package com.app.optionalclass;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalClassProgram11 {
	public static void main(String[] args) {
		Optional<String> stringOptional1 = Optional.of("Mamidala Sree Sagar");
		
		Optional<String> stringOptional2 = Optional.ofNullable(null);
		
		Supplier<Optional<String>> stringOptionalSupplier = new Supplier<Optional<String>>() {
			@Override
			public Optional<String> get() {
				return Optional.of("No value present.");
			}
		};
		
		Optional<String> resultedStringOptional1 = stringOptional1.or(stringOptionalSupplier);
		
		System.out.println("----- or method with non-null optional value -----");
		System.out.println(resultedStringOptional1);
		
		Optional<String> resultedStringOptional2 = stringOptional2.or(stringOptionalSupplier);
		
		System.out.println("----- or method with null optional value ------");
		System.out.println(resultedStringOptional2);
	}
}
