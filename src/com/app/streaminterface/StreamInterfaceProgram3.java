package com.app.streaminterface;

import java.util.stream.Stream;

public class StreamInterfaceProgram3 {
	public static void main(String[] args) {
		Stream<Integer> numberStream = Stream.of(0, 1, 2, 3, 4, 5);
		
		Stream<String> stringStream = Stream.of(String.valueOf("sagar").split(""));
		
		System.out.println("--- Number stream elements ---");
		numberStream.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("--- String stream elements ---");
		stringStream.forEach(e->{
			System.out.println(e);
		});
	}
}
