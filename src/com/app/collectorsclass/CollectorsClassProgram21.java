package com.app.collectorsclass;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.app.models.Computer;

public class CollectorsClassProgram21 {
	public static void main(String[] args) {
		List<Computer> computerList = Computer.getComputerList();
		
		Predicate<Computer> pricePredicate = new Predicate<Computer>() {
			@Override
			public boolean test(Computer c) {
				return c.getPrice()<55000.00;
			}
		};
		
		Function<Computer, String> computerNameAndPriceFn = new Function<Computer, String>() {
			@Override
			public String apply(Computer c) {
				return c.getComputerName()+" - "+c.getPrice();
			}
		};
		
		Map<Boolean, List<Computer>> priceWisePartitionMap1 = computerList.stream()
				.collect(Collectors.partitioningBy(pricePredicate));
		
		System.out.println("--- Computers partitioning by price by partitioningBy[1-argument] method ---");
		priceWisePartitionMap1.forEach((k, v)->{
			if(k.booleanValue()) {
				System.out.println("Price less than 55000.00");
			}else {
				System.out.println("Price greater than 55000.00");
			}
			
			v.forEach(c->{
				System.out.println(c);
			});
		});
		
		Map<Boolean, List<String>> priceWisePartitionMap2 = computerList.stream()
				.collect(Collectors.partitioningBy(pricePredicate, Collectors.mapping(computerNameAndPriceFn, Collectors.toList())));
		
		System.out.println("--- Computers partitioning by price by partitioningBy[2-argument] method ---");
		priceWisePartitionMap2.forEach((k, v)->{
			if(k.booleanValue()) {
				System.out.println("Price less than 55000.00");
			}else {
				System.out.println("Price greater than 55000.00");
			}
			
			v.forEach(c->{
				System.out.println(c);
			});
		});
	}
}
