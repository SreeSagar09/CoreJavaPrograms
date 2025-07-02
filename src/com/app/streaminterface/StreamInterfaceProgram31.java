package com.app.streaminterface;

import java.util.stream.Stream;
import java.util.stream.Stream.Builder;

public class StreamInterfaceProgram31 {
	public static void main(String[] args) {
		Builder<Integer> integerBuilder = Stream.builder();
		
		integerBuilder.add(1)
		.add(2).add(3)
		.add(4).accept(5);
		
		Builder<String> stringBuilder = Stream.builder();
		
		stringBuilder.add("Sagar")
		.add("Balaji")
		.add("Gopal")
		.accept("Mukesh");
		
		Stream<Integer> integerStream = integerBuilder.build();
		
		System.out.println("----- Integer stream -----");
		integerStream.forEach(i->{
			System.out.println(i);
		});
		
		Stream<String> stringStream = stringBuilder.build();
		
		System.out.println("----- String stream -----");
		stringStream.forEach(s->{
			System.out.println(s);
		});
	}
}
