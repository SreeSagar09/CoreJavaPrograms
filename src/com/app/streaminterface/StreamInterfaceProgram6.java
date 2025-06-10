package com.app.streaminterface;

import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

import com.app.models.Product;

public class StreamInterfaceProgram6 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		ToIntFunction<Product> quantityToIntFunction = (p)->p.getQuantity();
		
		ToLongFunction<Product> quantityToLongFunction = (p)->p.getQuantity();
		
		ToDoubleFunction<Product> priceToDoubleFunction = (p)->p.getPrice();
		
		System.out.println("--- Get quantity from product ---");
		productList.stream().mapToInt(quantityToIntFunction).forEach(i->{
			System.out.println(i);
		});
		
		System.out.println("--- Get quantity from product ---");
		productList.stream().mapToLong(quantityToLongFunction).forEach(l->{
			System.out.println(l);
		});
		
		System.out.println("--- Get price from product ---");
		productList.stream().mapToDouble(priceToDoubleFunction).forEach(d->{
			System.out.println(d);
		});
	}
}
