package com.app.collectorsclass;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.app.models.Computer;

public class CollectorsClassProgram19 {
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
		
		Supplier<LinkedHashMap<String, List<Computer>>> linkedHashMapSupplier = new Supplier<LinkedHashMap<String,List<Computer>>>() {
			@Override
			public LinkedHashMap<String, List<Computer>> get() {
				return new LinkedHashMap<>();
			}
		};
		
		Supplier<TreeMap<String, List<Computer>>> treeMapSupplier = ()->{
			return new TreeMap<>();
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
				.collect(Collectors.groupingBy(computerNameFunction, Collectors.mapping(computerNameAndModeNameFn, Collectors.toList())));
		
		System.out.println("--- Computers grouping by computerName by groupingBy[2-argument] method ---");
		computerNameWiseMap2.forEach((k, v)->{
			System.out.println("ComputerName: "+k);
			v.forEach(c->{
				System.out.println(c);
			});
		});
		
		Map<String, Long> computerNameWiseMap3 = computerList.stream()
				.collect(Collectors.groupingBy(computerNameFunction, Collectors.counting()));
	
		System.out.println("--- Computers grouping by computerName by groupingBy[2-argument] method ---");
		computerNameWiseMap3.forEach((k, v)->{
			System.out.println(k+" --> "+v);
		});
		
		LinkedHashMap<String, List<Computer>> computerNameWiseMap4 = computerList.stream()
				.collect(Collectors.groupingBy(computerNameFunction, linkedHashMapSupplier, Collectors.toList()));
	
		System.out.println("--- Computers grouping by computerName by groupingBy[3-argument] method ---");
		computerNameWiseMap4.forEach((k, v)->{
			System.out.println("ComputerName: "+k);
			v.forEach(c->{
				System.out.println(c);
			});
		});
		
		TreeMap<String, List<Computer>> computerNameWiseMap5 = computerList.stream()
				.collect(Collectors.groupingBy(computerNameFunction, treeMapSupplier, Collectors.toList()));
	
		System.out.println("--- Computers grouping by computerName by groupingBy[3-argument] method ---");
		computerNameWiseMap5.forEach((k, v)->{
			System.out.println("ComputerName: "+k);
			v.forEach(c->{
				System.out.println(c);
			});
		});
	}
}
