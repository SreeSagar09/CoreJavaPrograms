package com.app.collectorsclass;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.app.models.Computer;
import com.app.models.Product;

public class CollectorsClassProgram28 {
	public static void main(String[] args) {
		List<Computer> computerList = Computer.getComputerList();
		
		Predicate<Computer> dellPredicate = new Predicate<Computer>() {
			@Override
			public boolean test(Computer c) {
				return c.getComputerName()!=null&&c.getComputerName().equalsIgnoreCase("Dell");
			}
		};
		
		Predicate<Computer> lenovoPredicate = new Predicate<Computer>() {
			@Override
			public boolean test(Computer c) {
				return c.getComputerName()!=null&&c.getComputerName().equalsIgnoreCase("Lenovo");
			}
		};
		
		Function<Computer, String> computerNameAndModelFunction = (c)->{
			return c.getComputerName()+"["+c.getModelName()+"]";
		};
		
		Collector<Computer, ?, List<String>> dellComputerCollector = Collectors.filtering(dellPredicate, Collectors.mapping(computerNameAndModelFunction, Collectors.toList()));
		
		Collector<Computer, ?, List<String>> lenovoComputerCollector = Collectors.filtering(lenovoPredicate, Collectors.mapping(computerNameAndModelFunction, Collectors.toList()));
	
		BinaryOperator<List<String>> combinedListBO = (list1, list2)->{
			ArrayList<String> arrayList = new ArrayList<>();
			arrayList.addAll(list1);
			arrayList.addAll(list2);
			
			return arrayList;
		};
		
		List<String> resultedList = computerList.stream()
				.collect(Collectors.teeing(dellComputerCollector, lenovoComputerCollector, combinedListBO));
		
		System.out.println("--- Combining Dell and Lenovo computer list by teeing method ---");
		resultedList.forEach(c->{
			System.out.println(c);
		});
	}
}
