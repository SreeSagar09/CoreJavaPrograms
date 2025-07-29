package com.app.collectorsclass;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.app.models.Computer;

public class CollectorsClassProgram20 {
	public static void main(String[] args) {
		List<Computer> computerList = Computer.getComputerList();
		
		Function<Computer, String> computerNameFunction = new Function<Computer, String>() {
			@Override
			public String apply(Computer c) {
				return c.getComputerName();
			}
		};
		
		Function<Computer, String> computerNameAndModeNameFn = (c)->{
			return c.getComputerName()+" ["+c.getModelName()+"]";
		};
		
		Supplier<ConcurrentSkipListMap<String, List<Computer>>> concurrentSkipListMapSupplier = new Supplier<ConcurrentSkipListMap<String,List<Computer>>>() {
			@Override
			public ConcurrentSkipListMap<String, List<Computer>> get() {
				return new ConcurrentSkipListMap<>();
			}
		};
		
		Map<String, List<Computer>> computerNameWiseMap1 = computerList.stream()
				.collect(Collectors.groupingBy(computerNameFunction));
		
		System.out.println("--- Computers grouping by computerName by groupingBy[1-argument] method ---");
		computerNameWiseMap1.forEach((k, v)->{
			System.out.println("ComputerName: "+k);
			v.forEach(c->{
				System.out.println(c);
			});
		});
		
		Map<String, List<String>> computerNameWiseMap2 = computerList.stream()
				.collect(Collectors.groupingByConcurrent(computerNameFunction, Collectors.mapping(computerNameAndModeNameFn, Collectors.toList())));
		
		System.out.println("--- Computers grouping by computerName by groupingBy[2-argument] method ---");
		computerNameWiseMap2.forEach((k, v)->{
			System.out.println("ComputerName: "+k);
			v.forEach(c->{
				System.out.println(c);
			});
		});
		
		Map<String, Long> computerNameWiseMap3 = computerList.stream()
				.collect(Collectors.groupingByConcurrent(computerNameFunction, Collectors.counting()));
	
		System.out.println("--- Computers grouping by computerName by groupingBy[2-argument] method ---");
		computerNameWiseMap3.forEach((k, v)->{
			System.out.println(k+" --> "+v);
		});
		
		ConcurrentSkipListMap<String, List<Computer>> computerNameWiseMap4 = computerList.stream()
				.collect(Collectors.groupingByConcurrent(computerNameFunction, concurrentSkipListMapSupplier, Collectors.toList()));
	
		System.out.println("--- Computers grouping by computerName by groupingBy[3-argument] method ---");
		computerNameWiseMap4.forEach((k, v)->{
			System.out.println("ComputerName: "+k);
			v.forEach(c->{
				System.out.println(c);
			});
		});
		
	}
}
