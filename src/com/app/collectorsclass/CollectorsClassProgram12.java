package com.app.collectorsclass;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram12 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		Predicate<Product> pricePredicate = new Predicate<Product>() {
			@Override
			public boolean test(Product p) {
				return p.getPrice()>50d;
			}
		};
		
		Predicate<Product> quantityPredicate = (p)->{
			return p.getQuantity()<50;
		};
		
		List<Product> filteredProductList1 = productList.stream()
				.collect(Collectors.filtering(pricePredicate, Collectors.toList()));
		
		System.out.println("----- Price greater than 50.00 product list -----");
		filteredProductList1.forEach(p->{
			System.out.println(p);
		});
		
		List<Product> filteredProductList2 = productList.stream()
				.collect(Collectors.filtering(quantityPredicate, Collectors.toList()));
		
		System.out.println("------ Quantity less than 50 product list ------");
		filteredProductList2.forEach(p->{
			System.out.println(p);
		});
	}
}
