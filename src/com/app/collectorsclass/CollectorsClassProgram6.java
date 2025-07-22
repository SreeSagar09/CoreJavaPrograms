package com.app.collectorsclass;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram6 {

	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		Function<Product, String> productNameFunction = (p)->{
			return p.getProductName();
		};
		
		Function<Product, String> productNameAndCodeFunction = (p)->{
			return p.getProductName()+"["+p.getProductCode()+"]";
		};
		
		List<String> productNameList = productList.stream()
				.map(productNameFunction)
				.collect(Collectors.toUnmodifiableList());
		
		System.out.println("------ Product name unmodifiable/immutable list -------");
		productNameList.forEach(pn->{
			System.out.println(pn);
		});
		
		List<String> productNameAndCodeList = productList.stream()
				.map(productNameAndCodeFunction)
				.collect(Collectors.toUnmodifiableList());
		
		System.out.println("------ Product name and code unmodifiable/immutable list ------");
		productNameAndCodeList.forEach(pnc->{
			System.out.println(pnc);
		});
	}
}
