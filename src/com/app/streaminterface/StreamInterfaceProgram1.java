package com.app.streaminterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInterfaceProgram1 {
	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12);
		
		System.out.println("Original Numbers List");
		numbersList.forEach(n->{System.out.println(n);});
		
		List<Integer> evenNumberList = numbersList.stream().filter(n->(n&1) == 0).collect(Collectors.toList());
		
		System.out.println("Even Numbers List");
		evenNumberList.forEach(n->{System.out.println(n);});
		
		System.out.println("Odd Numbers List");
		List<Integer> oddNumberList = numbersList.stream().filter(n->(n&1) != 0).collect(Collectors.toList());
		oddNumberList.forEach(n->{System.out.println(n);});
	}
}
