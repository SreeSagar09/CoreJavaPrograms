package com.app.streaminterface;

import java.util.List;
import java.util.stream.Stream;

public class StreamInterfaceProgram8 {

	public static void main(String[] args) {
		List<Integer> numberList = List.of(2, 4, 5, 3, 5, 6, 2);
		
		System.out.println("---- Without distinct method ----");
		numberList.stream().forEach(n->{
			System.out.println(n);
		});
		
		System.out.println("---- With distinct method ----");
		
		Stream<Integer> distinctNumberStream = numberList.stream().distinct();
		distinctNumberStream.forEach(n->{
			System.out.println(n);
		});
	}
}
