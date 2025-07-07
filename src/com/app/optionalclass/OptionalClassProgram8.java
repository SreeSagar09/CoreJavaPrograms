package com.app.optionalclass;

import java.util.Optional;
import java.util.function.Predicate;

import com.app.models.Product;

public class OptionalClassProgram8 {
	public static void main(String[] args) {
		Optional<Product> productOptional1 = Optional.of(new Product(3, "P003", "Bags", 24, 250.00));
		
		Optional<Product> productOptional2 = Optional.of(new Product(4, "P004", "Balls", 34, 30.00));
		
		Optional<Product> productOptional3 = Optional.ofNullable(null);
		
		Predicate<Product> pricePredicate = new Predicate<Product>() {
			@Override
			public boolean test(Product product) {
				return product.getPrice()>=100;
			}
		};
		
		Optional<Product> resultedProductOptional1 = productOptional1.filter(pricePredicate);
		
		System.out.println("----- Predicate matches with non-null optional value -----");
		System.out.println(resultedProductOptional1);
		
		Optional<Product> resultedProductOptional2 = productOptional2.filter(pricePredicate);
		
		System.out.println("----- Predicate not matches with non-null optional value ------");
		System.out.println(resultedProductOptional2);
		
		Optional<Product> resultedProductOptional3 = productOptional3.filter(pricePredicate);
		
		System.out.println("----- Predicate matches or not matches with non-null optional value ------");
		System.out.println(resultedProductOptional3);
	}
}
