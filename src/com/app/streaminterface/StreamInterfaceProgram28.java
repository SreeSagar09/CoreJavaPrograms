package com.app.streaminterface;

import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamInterfaceProgram28 {
	public static void main(String[] args) {
		Predicate<Integer> lessThanEqualPredicate = (i)->{
			return i<=5;
		};
		
		UnaryOperator<Integer> integerNumberUnaryOperator = (i)->{
			return i+1;
		};
		
		Stream<Integer> integerNumberStream = Stream.iterate(1, lessThanEqualPredicate, integerNumberUnaryOperator);
		
		System.out.println("----- Integer numbers -----");
		integerNumberStream.forEach(i->{
			System.out.println(i);
		});
	}
}
