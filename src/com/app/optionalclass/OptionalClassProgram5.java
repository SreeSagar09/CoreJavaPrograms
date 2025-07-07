package com.app.optionalclass;

import java.util.Optional;

public class OptionalClassProgram5 {
	public static void main(String[] args) {
		Optional<Integer> integerOptional1 = Optional.ofNullable(null);
		
		Optional<Integer> integeOptional2 = Optional.of(10);
		
		boolean isPresent1 = integerOptional1.isPresent();
		
		System.out.println("----- isPresent method with null value Optional -----");
		System.out.println(isPresent1);
		
		boolean isEmpty1 = integerOptional1.isEmpty();
		
		System.out.println("----- isEmpty method with null value Optional -----");
		System.out.println(isEmpty1);
		
		boolean isPresent2 = integeOptional2.isPresent();
		
		System.out.println("----- isPresent method with non-null value Optional -----");
		System.out.println(isPresent2);
		
		boolean isEmpty2 = integeOptional2.isEmpty();
		
		System.out.println("----- isEmpty method with non-null value Optional -----");
		System.out.println(isEmpty2);
	}
}
