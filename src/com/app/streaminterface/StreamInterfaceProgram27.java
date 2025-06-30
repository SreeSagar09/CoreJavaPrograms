package com.app.streaminterface;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class StreamInterfaceProgram27 {
	public static void main(String[] args) {
		UnaryOperator<Integer> integerNumberUnaryOperator = new UnaryOperator<Integer>() {
			@Override
			public Integer apply(Integer i) {
				return i+1;
			}
		};
		
		UnaryOperator<Integer> wholeNumberUnaryOperator = (i)->{
			return i+1;
		};
		
		UnaryOperator<String> stringUnaryOperator = (s)->{
			return s+"*";
		};
		
		Stream<Integer> integerNumbersStream = Stream.iterate(-2, integerNumberUnaryOperator).limit(5);
	
		System.out.println("---- Integer numbers ----");
		integerNumbersStream.forEach(i->{
			System.out.println(i);
		});
		
		Stream<Integer> wholeNumbersStream = Stream.iterate(0, wholeNumberUnaryOperator).limit(5);
		
		System.out.println("---- Whole numbers ----");
		wholeNumbersStream.forEach(i->{
			System.out.println(i);
		});
		
		Stream<String> stringStream = Stream.iterate("*", stringUnaryOperator).limit(5);
		
		System.out.println("---- '*' String ----");
		stringStream.forEach(s->{
			System.out.println(s);
		});
	}
}
