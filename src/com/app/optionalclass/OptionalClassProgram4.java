package com.app.optionalclass;

import java.util.Optional;

public class OptionalClassProgram4 {
	public static void main(String[] args) {
		Optional<Integer> integerOptional1 = Optional.ofNullable(null);
		
		Optional<Integer> integeOptional2 = Optional.of(10);
		
		Integer value1 = integerOptional1.isPresent()?integerOptional1.get():null;
		
		Integer value2 = integeOptional2.isPresent()?integeOptional2.get():null;
		
		System.out.println("Value-1: "+value1);
		System.out.println("Value-2: "+value2);
	}
}
