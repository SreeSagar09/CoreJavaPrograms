package com.app.optionalclass;

import java.util.Optional;

public class OptionalClassProgram5 {
	public static void main(String[] args) {
		Optional<Integer> integerOptional1 = Optional.ofNullable(null);
		
		Optional<Integer> integeOptional2 = Optional.of(10);
		
		System.out.println("----- ");
	}
}
