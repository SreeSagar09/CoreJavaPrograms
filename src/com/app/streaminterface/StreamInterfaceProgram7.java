package com.app.streaminterface;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamInterfaceProgram7 {
	public static void main(String[] args) {
		List<Integer> numberList1 = Arrays.asList(1,3,6,7,5,9,11);
		System.out.println("calling findAny method directly");
		Optional<Integer> optional1 = numberList1.stream().findAny();
		System.out.println(optional1.isPresent()?optional1.get():"No value");
		
		System.out.println("calling findAny method after filtering condition");
		Optional<Integer> optional2 = numberList1.stream().filter(p->(p&1) == 0).findAny();
		System.out.println(optional2.isPresent()?optional2.get():"No value");
		
		System.out.println("calling findAny method after filtering condition");
		Optional<Integer> optional3 = numberList1.stream().filter(p->(p&1) == 0 && p%8 == 0).findAny();
		System.out.println(optional3.isPresent()?optional3.get():"No value");
		
		System.out.println("calling findAny method on empty stream");
		List<Integer> numbersList2 = Arrays.asList();
		Optional<Integer> optional4 = numbersList2.stream().findAny();
		System.out.println(optional4.isPresent()?optional4.get():"No value");
	}
}
