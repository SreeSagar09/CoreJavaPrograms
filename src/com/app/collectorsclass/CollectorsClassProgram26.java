package com.app.collectorsclass;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram26 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		productList.add(new Product(8, "P008", "Bags", 25, 300.00));
		productList.add(new Product(9, "P009", "Bats", 5, 500.00));
		
		Function<Product, String> productNameFunction = (p)->p.getProductName();
		Function<Product, Integer> quantityFunction = (p)->p.getQuantity();
		
		BinaryOperator<Integer> maxQuantityBO = BinaryOperator.maxBy(Comparator.naturalOrder());
		
		BinaryOperator<Integer> minQuantityBO = BinaryOperator.minBy(Comparator.naturalOrder());
		
		BinaryOperator<Integer> firstOccuredQuantityBO = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer i1, Integer i2) {
				return i1;
			}
		};
		
		BinaryOperator<Integer> lastOccuredQuantityBO = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer i1, Integer i2) {
				return i2;
			}
		};
		
		BinaryOperator<Integer> sumQuantityBO = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer i1, Integer i2) {
				return i1+i2;
			}
		};
		
		Supplier<ConcurrentHashMap<String, Integer>> concurrentHashMapSupplier = ()->new ConcurrentHashMap();
		Supplier<ConcurrentSkipListMap<String, Integer>> concurrentSkipListMapSupplier = ()->new ConcurrentSkipListMap();
		
		System.out.println("-------- All Products --------");
		productList.forEach(p->{
			System.out.println(p.getProductCode()+" - "+p.getProductName()+" - "+p.getQuantity()+" - "+p.getPrice());
		});
		
		Map<String, Integer> concurrentMap1 = productList.stream()
				.collect(Collectors.toConcurrentMap(productNameFunction, quantityFunction, minQuantityBO, concurrentHashMapSupplier));
		
		System.out.println("--- ProductName and Quantity ConcurrentHashMap[if productName is duplicate then minimum quantity as value.] ---");
		concurrentMap1.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Integer> concurrentMap2 = productList.stream()
				.collect(Collectors.toConcurrentMap(productNameFunction, quantityFunction, maxQuantityBO, concurrentSkipListMapSupplier));
		
		System.out.println("--- ProductName and Quantity ConcurrentSkipListMap[if productName is duplicate then maximum quantity as value.] ---");
		concurrentMap2.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Integer> concurrentMap3 = productList.stream()
				.collect(Collectors.toConcurrentMap(productNameFunction, quantityFunction, firstOccuredQuantityBO, concurrentSkipListMapSupplier));
		
		System.out.println("--- ProductName and Quantity ConcurrentSkipListMap[if productName is duplicate then first come quantity as value.] ---");
		concurrentMap3.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Integer> concurrentMap4 = productList.stream()
				.collect(Collectors.toConcurrentMap(productNameFunction, quantityFunction, lastOccuredQuantityBO, concurrentSkipListMapSupplier));
		
		System.out.println("--- ProductName and Quantity ConcurrentSkipListMap[if productName is duplicate then last come quantity as value.] ---");
		concurrentMap4.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Integer> concurrentMap5 = productList.stream()
				.collect(Collectors.toConcurrentMap(productNameFunction, quantityFunction, sumQuantityBO, concurrentSkipListMapSupplier));
		
		System.out.println("--- ProductName and Quantity ConcurrentSkipListMap[if productName is duplicate then sum of quantity as value.] ---");
		concurrentMap5.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
	}
}
