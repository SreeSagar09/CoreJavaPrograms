package com.app.optionalclass;

import java.util.Optional;

public class OptionalClassProgram1 {
	public static void main(String[] args) {
		String name = "Sree Sagar";
		
		Optional<String> stringOptional = Optional.of(name);
		
		System.out.println("----- Printing optional object -----");
		System.out.println(stringOptional);
		
		System.out.println("----- Printing optional value -----");
		System.out.println(stringOptional.get());
	}
}
