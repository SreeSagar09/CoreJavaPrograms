package com.app.collectorsclass;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram15 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		Predicate<Product> pricePredicate = new Predicate<Product>() {
			@Override
			public boolean test(Product p) {
				return p.getPrice()>50d;
			}
		};
		
		Long totalCount = productList.stream()
				.collect(Collectors.counting());
		
		System.out.println("----- Total products count ------");
		System.out.println(totalCount);
		
		Long count = productList.stream()
				.collect(Collectors.filtering(pricePredicate, Collectors.counting()));
		
		System.out.println("----- Price greater than 50.00 products count -----");
		System.out.println(count);
	}
}
