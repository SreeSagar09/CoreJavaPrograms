package com.app.streaminterface;

import java.util.stream.Stream;

public class StreamInterfaceProgram30 {
	public static void main(String[] args) {
		Stream<Integer> integerStream1 = Stream.of(1, 2, 3, 4, 5);
		
		Stream<Integer> integerStream2 = Stream.of(10, 9, 8, 7, 6);
		
		Stream<Integer> concatenatedIntegerStream = Stream.concat(integerStream1, integerStream2);
		
		System.out.println("----- Concatenated integer stream -----");
		concatenatedIntegerStream.forEach(i->{
			System.out.println(i);
		});
	}
}
