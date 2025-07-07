package com.app.optionalclass;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalClassProgram6 {
	public static void main(String[] args) {
		Optional<String> stringOptional1 = Optional.of("Mamidala Sree Sagar");
		
		Optional<String> stringOptional2 = Optional.ofNullable(null);
		
		Consumer<String> stringConsumer = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println("Optional value: "+s);
			}
		};
		
		System.out.println("---- ifPresent method with non-null value Optional ----");
		stringOptional1.ifPresent(stringConsumer);
		
		System.out.println("---- ifPresent method with null value Optional ----");
		stringOptional2.ifPresent(stringConsumer);
	}
}
