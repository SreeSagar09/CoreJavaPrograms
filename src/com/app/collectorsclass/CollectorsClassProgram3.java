package com.app.collectorsclass;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram3 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		Function<Product, String> productCodeFunction = (p)->p.getProductCode();
		Function<Product, String> productNameFunction = (p)->p.getProductName();
		Function<Product, Double> priceFunction = (p)->p.getPrice();
		
		Map<String, String> codeAndNameMap = productList.stream()
				.collect(Collectors.toMap(productCodeFunction, productNameFunction));
	
		System.out.println("----- ProductCode and ProductName map -----");
		codeAndNameMap.forEach((k, v)->{
			System.out.println(k+" --> "+v);
		});
		
		Map<String, Double> nameAndPriceMap = productList.stream()
				.collect(Collectors.toMap(productNameFunction, priceFunction));
		
		System.out.println("----- ProductName and Price map -----");
		nameAndPriceMap.forEach((k, v)->{
			System.out.println(k+" --> "+v);
		});
	}
}
