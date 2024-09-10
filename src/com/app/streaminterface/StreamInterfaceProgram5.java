package com.app.streaminterface;

import java.util.Arrays;
import java.util.List;

public class StreamInterfaceProgram5 {
	public static void main(String[] args) {
		List<Integer> numbersList = Arrays.asList(3,7,5,9,2,3,5,11,7,-1);
		
		System.out.println("List of Numbers");
		for(int i=0; i<numbersList.size(); i++) {
			if(i == numbersList.size()-1) {
				System.out.println(numbersList.get(i));
			}else {
				System.out.print(numbersList.get(i)+",");
			}
		}
		
		System.out.println("Is List contain 5 factor numbers");
		boolean isContainFiveFactors = numbersList.stream().anyMatch(p->(p%5) == 0);
		System.out.println(isContainFiveFactors);
		
		System.out.println("Is List contain all Odd numbers");
		boolean isContainAllOddNumbers = numbersList.stream().allMatch(p->(p&1) == 1);
		System.out.println(isContainAllOddNumbers);
		
		System.out.println("Is List contain negative numbers");
		boolean isContainNegativeNumber = !numbersList.stream().noneMatch(p->p<=0);
		System.out.println(isContainNegativeNumber);
	}
}
