package com.app.collectorsclass;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram5 {
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
		
		Supplier<HashMap<String, Integer>> hashMapSupplier = ()->new HashMap();
		Supplier<LinkedHashMap<String, Integer>> linkedHashMapSupplier = ()->new LinkedHashMap();
		
		System.out.println("-------- All Products --------");
		productList.forEach(p->{
			System.out.println(p.getProductCode()+" - "+p.getProductName()+" - "+p.getQuantity()+" - "+p.getPrice());
		});
		
		Map<String, Integer> map1 = productList.stream()
				.collect(Collectors.toMap(productNameFunction, quantityFunction, minQuantityBO, hashMapSupplier));
		
		System.out.println("--- ProductName and Quantity HashMap[if productName is duplicate then minimum quantity as value.] ---");
		map1.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Integer> map2 = productList.stream()
				.collect(Collectors.toMap(productNameFunction, quantityFunction, maxQuantityBO, linkedHashMapSupplier));
		
		System.out.println("--- ProductName and Quantity LinkedHashMap[if productName is duplicate then maximum quantity as value.] ---");
		map2.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Integer> map3 = productList.stream()
				.collect(Collectors.toMap(productNameFunction, quantityFunction, firstOccuredQuantityBO, linkedHashMapSupplier));
		
		System.out.println("--- ProductName and Quantity LinkedHashMap[if productName is duplicate then first come quantity as value.] ---");
		map3.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Integer> map4 = productList.stream()
				.collect(Collectors.toMap(productNameFunction, quantityFunction, lastOccuredQuantityBO, linkedHashMapSupplier));
		
		System.out.println("--- ProductName and Quantity LinkedHashMap[if productName is duplicate then last come quantity as value.] ---");
		map4.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Integer> map5 = productList.stream()
				.collect(Collectors.toMap(productNameFunction, quantityFunction, sumQuantityBO, linkedHashMapSupplier));
		
		System.out.println("--- ProductName and Quantity LinkedHashMap[if productName is duplicate then sum of quantity as value.] ---");
		map5.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
	}
}
