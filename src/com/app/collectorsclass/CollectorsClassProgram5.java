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
		
		Supplier<HashMap<String, Integer>> hashMapSupplier = ()->new HashMap();
		Supplier<LinkedHashMap<String, Integer>> linkedHashMapSupplier = ()->new LinkedHashMap();
		
		System.out.println("-------- All Products --------");
		productList.forEach(p->{
			System.out.println(p.getProductCode()+" - "+p.getProductName()+" - "+p.getQuantity()+" - "+p.getPrice());
		});
		
		Map<String, Integer> map1 = productList.stream()
				.collect(Collectors.toMap(productNameFunction, quantityFunction, maxQuantityBO, hashMapSupplier));
		
		System.out.println("--- ProductName and Quantity HashMap[if productName is duplicate then maxmum quantity as value.] ---");
		map1.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Integer> map2 = productList.stream()
				.collect(Collectors.toMap(productNameFunction, quantityFunction, maxQuantityBO, linkedHashMapSupplier));
		
		System.out.println("--- ProductName and Quantity LinkedHashMap[if productName is duplicate then maxmum quantity as value.] ---");
		map2.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
	}
}
