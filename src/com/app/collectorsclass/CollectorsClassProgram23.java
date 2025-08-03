package com.app.collectorsclass;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram23 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		productList.add(new Product(8, "P008", "Bags", 25, 300.00));
		productList.add(new Product(9, "P009", "Bats", 5, 500.00));
		
		Function<Product, String> productNameFunction = (p)->p.getProductName();
		Function<Product, Integer> quantityFunction = (p)->p.getQuantity();
		Function<Product, Double> priceFunction = (p)->p.getPrice();
		
		BinaryOperator<Integer> firstProductQuantityBO = (p1, p2)->p1;
		BinaryOperator<Integer> lastProductQuantityBO = (p1, p2)->p2;
		
		BinaryOperator<Double> minPriceBO = BinaryOperator.minBy(Comparator.naturalOrder());
		BinaryOperator<Double> maxPriceBO = BinaryOperator.maxBy(Comparator.naturalOrder());
		
		System.out.println("-------- All Products --------");
		productList.forEach(p->{
			System.out.println(p.getProductCode()+" - "+p.getProductName()+" - "+p.getQuantity()+" - "+p.getPrice());
		});
		
		Map<String, Integer> map1 = productList.stream()
				.collect(Collectors.toUnmodifiableMap(productNameFunction, quantityFunction, firstProductQuantityBO));
		
		System.out.println("--- ProductName and Quantity unmodifiable map[if productName is duplicate then first comes quantity as value.] ---");
		map1.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Integer> map2 = productList.stream()
				.collect(Collectors.toUnmodifiableMap(productNameFunction, quantityFunction, lastProductQuantityBO));
		
		System.out.println("--- ProductName and Quantity unmodifiable map[if productName is duplicate then last comes quantity as value.] ---");
		map2.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Double> map3 = productList.stream()
				.collect(Collectors.toUnmodifiableMap(productNameFunction, priceFunction, minPriceBO));
		
		System.out.println("--- ProductName and Quantity unmodifiable map[if productName is duplicate then minimum price as value.] ---");
		map3.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
		
		Map<String, Double> map4 = productList.stream()
				.collect(Collectors.toUnmodifiableMap(productNameFunction, priceFunction, maxPriceBO));
		
		System.out.println("--- ProductName and Quantity unmodifiable map[if productName is duplicate then maximum price as value.] ---");
		map4.forEach((k, v)->{
			System.out.println(k+" - "+v);
		});
	}
}
