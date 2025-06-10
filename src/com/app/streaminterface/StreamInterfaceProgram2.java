package com.app.streaminterface;

import java.util.stream.Stream;

public class StreamInterfaceProgram2 {
	public static void main(String[] args) {
		Stream<Integer> numberStream1 = Stream.ofNullable(null);
		
		Stream<Integer> numberStream2 = Stream.ofNullable(10);
		
		System.out.println("--- Stream of null element ---");
		numberStream1.forEach(e->{
			System.out.println(e);
		});
		
		System.out.println("--- Stream of not null element ---");
		numberStream2.forEach(e->{
			System.out.println(e);
		});
	}
}
