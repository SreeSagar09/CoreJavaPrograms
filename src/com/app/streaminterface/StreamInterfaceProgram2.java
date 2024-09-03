package com.app.streaminterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInterfaceProgram2 {
	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(0,1,2,3,4,5,6,7,8,9,10,11,12);
		
		System.out.println("Original Numbers List");
		for(int i=0; i<numbersList.size(); i++) {
			if(numbersList.size()-1 == i) {
				System.out.println(numbersList.get(i));
			}else {
				System.out.print(numbersList.get(i)+",");
			}
		}
		
		List<Integer> modifiedNumbersList = numbersList.stream().map(n->{
			if((n&1) == 0) {
				return n+10;
			}else {
				return n;
			}
		}).collect(Collectors.toList());
		
		System.out.println("Modified Numbers List");
		for(int i=0; i<modifiedNumbersList.size(); i++) {
			if(modifiedNumbersList.size()-1 == i) {
				System.out.println(modifiedNumbersList.get(i));
			}else {
				System.out.print(modifiedNumbersList.get(i)+",");
			}
		}
	}
}
