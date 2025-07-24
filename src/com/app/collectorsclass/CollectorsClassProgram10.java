package com.app.collectorsclass;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram10 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		Function<Product, String> productNameFunction = new Function<Product, String>() {
			@Override
			public String apply(Product p) {
				return p.getProductName();
			}
		};
		
		Function<Product, Double> priceFunction = (p)->{
			return p.getPrice();
		};
		
		Function<Product, Integer> quantityFunction = (p)->{
			return p.getQuantity();
		};
		
		BinaryOperator<Double> sumPriceBO = (d1, d2)->d1+d2;
		
		List<String> productNameList = productList.stream()
				.collect(Collectors.mapping(productNameFunction, Collectors.toList()));
		
		System.out.println("------- Product name list --------");
		productNameList.forEach(pn->{
			System.out.println(pn);
		});
		
		Optional<Double> totalPriceOptional = productList.stream()
				.collect(Collectors.mapping(priceFunction, Collectors.reducing(sumPriceBO)));
		
		System.out.println("------- Sum of all products price -------");
		System.out.println(totalPriceOptional.orElse(0d));
		
		Optional<Integer> maxQuantityOptional = productList.stream()
				.collect(Collectors.mapping(quantityFunction, Collectors.maxBy(Comparator.naturalOrder())));
		
		System.out.println("------- Maximum quantity value ------");
		System.out.println(maxQuantityOptional.orElse(0));
		
		Optional<Integer> minQuantityOptional = productList.stream()
				.collect(Collectors.mapping(quantityFunction, Collectors.minBy(Comparator.naturalOrder())));
		
		System.out.println("--------- Minimum quantity value --------");
		System.out.println(minQuantityOptional.orElse(0));
	}
}
