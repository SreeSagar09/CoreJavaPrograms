package com.app.optionalclass;

import java.util.Optional;
import java.util.function.Consumer;

public class OptionalClassProgram7 {
	public static void main(String[] args) {
		Optional<String> stringOptional1 = Optional.of("Mamidala Sree Sagar");
		
		Optional<String> stringOptional2 = Optional.ofNullable(null);
		
		Consumer<String> stringConsumer = new Consumer<String>() {
			@Override
			public void accept(String s) {
				System.out.println("Optional value: "+s);
			}
		};
		
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println("No value present.");
			}
		};
		
		System.out.println("---- ifPresent method with non-null value Optional ----");
		stringOptional1.ifPresentOrElse(stringConsumer, runnable);
		
		System.out.println("---- ifPresent method with null value Optional ----");
		stringOptional2.ifPresentOrElse(stringConsumer, runnable);
	}
}
