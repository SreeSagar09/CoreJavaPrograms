package com.app.optionalclass;

import java.util.Optional;

public class OptionalClassProgram3 {
	public static void main(String[] args) {
		Optional<Integer> integerOptional = Optional.empty();
		
		System.out.println("----- Printing optional object -----");
		System.out.println(integerOptional);
	}
}
