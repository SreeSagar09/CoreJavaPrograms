package com.app.collectorsclass;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram9 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		Function<Product, String> productNameFunction = (p)->{
			return p.getProductName();
		};
		
		String allProductNames1 = productList.stream()
				.map(productNameFunction)
				.collect(Collectors.joining());
		
		System.out.println("----- Joining product names -----");
		System.out.println(allProductNames1);
		
		String allProductNames2 = productList.stream()
				.map(productNameFunction)
				.collect(Collectors.joining(", "));
		
		System.out.println("----- Joining product names delimiter-----");
		System.out.println(allProductNames2);
		
		String allProductNames3 = productList.stream()
				.map(productNameFunction)
				.collect(Collectors.joining("-", "@", "#"));
		
		System.out.println("----- Joining product names delimiter and prefix and suffix -----");
		System.out.println(allProductNames3);
	}
}
