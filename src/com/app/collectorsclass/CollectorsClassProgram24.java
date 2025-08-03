package com.app.collectorsclass;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram24 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();

		Function<Product, String> productCodeFunction = (p)->p.getProductCode();
		Function<Product, String> productNameFunction = (p)->p.getProductName();
		Function<Product, Double> priceFunction = (p)->p.getPrice();

		ConcurrentMap<String, String> codeAndNameConcurrentMap = productList.stream()
				.collect(Collectors.toConcurrentMap(productCodeFunction, productNameFunction));

		System.out.println("----- ProductCode and ProductName concurrent map -----");
		codeAndNameConcurrentMap.forEach((k, v)->{
			System.out.println(k+" --> "+v);
		});

		ConcurrentMap<String, Double> nameAndPriceConcurrentMap = productList.stream()
				.collect(Collectors.toConcurrentMap(productNameFunction, priceFunction));

		System.out.println("----- ProductName and Price concurrent map -----");
		nameAndPriceConcurrentMap.forEach((k, v)->{
			System.out.println(k+" --> "+v);
		});
	}
}
