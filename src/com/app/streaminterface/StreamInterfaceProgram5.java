package com.app.streaminterface;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

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
		
		Stream<String> productCodeAndNameStream = productList.stream().map(productCodeAndNameFuncton);
		
		System.out.println("--- Get product code and name ---");
		productCodeAndNameStream.forEach(p->{
			System.out.println(p);
		});
		
		Stream<Double> multiplyQtyPriceStream = productList.stream().map(multiplyQuantityAndPriceFunction);
		
		System.out.println("---- To multiply quantity and price of each product ----");
		multiplyQtyPriceStream.forEach(p->{
			System.out.println(p);
		});
	}
}
