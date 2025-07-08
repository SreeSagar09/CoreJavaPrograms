package com.app.optionalclass;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalClassProgram16 {
	public static void main(String[] args) {
		Optional<String> stringOptional1 = Optional.of("Mamidala Sree Sagar");

		Optional<String> stringOptional2 = Optional.ofNullable(null);
		
		Supplier<NullPointerException> nullPointerExceptionSupplier = new Supplier<NullPointerException>() {
			@Override
			public NullPointerException get() {
				return new NullPointerException("optional value is null.");
			}
		};
		
		String resultedString1 = stringOptional1.orElseThrow(nullPointerExceptionSupplier);

		System.out.println("----- orElseThrow method with non-null optional value -----");
		System.out.println(resultedString1);

		String resultedString2 = stringOptional2.orElseThrow(nullPointerExceptionSupplier);

		System.out.println("----- orElseThrow method with null optional value -----");
		System.out.println(resultedString2);
	}
}
