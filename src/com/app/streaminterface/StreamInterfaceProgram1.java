package com.app.streaminterface;

import java.util.stream.Stream;

public class StreamInterfaceProgram1 {
	public static void main(String[] args) {
		Stream<Integer> numberStream = Stream.of(15);
		
		System.out.println("------ Stream elements ------");
		numberStream.forEach(e->{
			System.out.println(e);
		});
	}
}
