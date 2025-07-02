package com.app.optionalclass;

import java.util.Optional;

public class OptionalClassProgram2 {
	public static void main(String[] args) {
		Optional<Integer> integerOptional1 = Optional.ofNullable(null);
		
		Optional<Integer> integerOptional2 = Optional.ofNullable(10);
		
		System.out.println("----- Printing optional object -----");
		System.out.println(integerOptional1);
		
		System.out.println("----- Printing optional object -----");
		System.out.println(integerOptional2);
		
		System.out.println("----- Printing optional value -----");
		System.out.println(integerOptional2.get());
	}
}
