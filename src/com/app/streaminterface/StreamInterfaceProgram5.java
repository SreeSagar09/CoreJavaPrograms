package com.app.streaminterface;

import java.util.List;
import java.util.function.Function;

import com.app.models.Product;

public class StreamInterfaceProgram5 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		Function<Product, String> productCodeAndNameFuncton = new Function<Product, String>() {
			@Override
			public String apply(Product t) {
				return t.getProductName()+"["+t.getProductCode()+"]";
			}
		};
		
		Function<Product, Double> multiplyQuantityAndPriceFunction = (p)->p.getQuantity()*p.getPrice();
		
		System.out.println("--- Get product code and name ---");
		productList.stream().map(productCodeAndNameFuncton).forEach(p->{
			System.out.println(p);
		});
		
		System.out.println("---- To multiply quantity and price of each product ----");
		productList.stream().map(multiplyQuantityAndPriceFunction).forEach(p->{
			System.out.println(p);
		});
	}
}
