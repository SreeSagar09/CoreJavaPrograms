package com.app.collectorsclass;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram8 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		productList.add(new Product(8, "P008", "Bags", 25, 300.00));
		productList.add(new Product(9, "P009", "Bats", 5, 500.00));
		
		Function<Product, String> productNameFunction = (p)->{
			return p.getProductName();
		};
		
		Function<Product, String> productNameAndCodeFunction = (p)->{
			return p.getProductName()+"["+p.getProductCode()+"]";
		};
		
		Set<String> productNameSet = productList.stream()
				.map(productNameFunction)
				.collect(Collectors.toUnmodifiableSet());
		
		System.out.println("------ Product name unmodifiable/immutable set -------");
		productNameSet.forEach(pn->{
			System.out.println(pn);
		});
		
		Set<String> productNameAndCodeSet = productList.stream()
				.map(productNameAndCodeFunction)
				.collect(Collectors.toUnmodifiableSet());
		
		System.out.println("------ Product name and code unmodifiable/immutable set ------");
		productNameAndCodeSet.forEach(pnc->{
			System.out.println(pnc);
		});
	}
}
