package com.app.collectorsclass;

import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram7 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		productList.add(new Product(8, "P008", "Bags", 25, 300.00));
		productList.add(new Product(9, "P009", null, 5, 500.00));
		
		Function<Product, String> productNameFunction = (p)->{
			return p.getProductName();
		};
		
		Function<Product, String> productNameAndCodeFunction = (p)->{
			return p.getProductName()+"["+p.getProductCode()+"]";
		};
		
		Set<String> productNameSet = productList.stream()
				.map(productNameFunction)
				.collect(Collectors.toSet());
		
		System.out.println("------ Product name set -------");
		productNameSet.forEach(pn->{
			System.out.println(pn);
		});
		
		Set<String> productNameAndCodeSet = productList.stream()
				.map(productNameAndCodeFunction)
				.collect(Collectors.toSet());
		
		System.out.println("------ Product name and code set ------");
		productNameAndCodeSet.forEach(pnc->{
			System.out.println(pnc);
		});			
	}
}
