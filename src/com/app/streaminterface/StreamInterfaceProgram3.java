package com.app.streaminterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInterfaceProgram3 {
	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(1,10,12,3,4,3,9,5,6,7,5,6,9,7,10);
		
		System.out.println("Original Numbers List");
		for(int i=0; i<numbersList.size(); i++) {
			if(numbersList.size()-1 == i) {
				System.out.println(numbersList.get(i));
			}else {
				System.out.print(numbersList.get(i)+",");
			}
		}
		
		List<Integer> distinctNumbersList = numbersList.stream().distinct().collect(Collectors.toList());
		System.out.println("Distinct Numbers List");
		for(int i=0; i<distinctNumbersList.size(); i++) {
			if(distinctNumbersList.size()-1 == i) {
				System.out.println(distinctNumbersList.get(i));
			}else {
				System.out.print(distinctNumbersList.get(i)+",");
			}
		}
	}
}
