package com.app.streaminterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInterfaceProgram1 {
	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12);
		
		System.out.println("Original Numbers List");
		for(int i=0; i<numbersList.size(); i++) {
			if((numbersList.size()-1) == i) {
				System.out.println(numbersList.get(i));
			}else {
				System.out.print(numbersList.get(i)+",");
			}
		}
		
		System.out.println("Even Numbers List");
		List<Integer> evenNumberList = numbersList.stream().filter(n->(n&1) == 0).collect(Collectors.toList());
		for(int i=0; i<evenNumberList.size(); i++) {
			if((evenNumberList.size()-1) == i) {
				System.out.println(evenNumberList.get(i));
			}else {
				System.out.print(evenNumberList.get(i)+",");
			}
		}
		
		System.out.println("Odd Numbers List");
		List<Integer> oddNumberList = numbersList.stream().filter(n->(n&1) != 0).collect(Collectors.toList());
		for(int i=0; i<oddNumberList.size(); i++) {
			if((oddNumberList.size()-1) == i) {
				System.out.println(oddNumberList.get(i));
			}else {
				System.out.print(oddNumberList.get(i)+",");
			}
		}
	}
}
