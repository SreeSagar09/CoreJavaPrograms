package com.app.streaminterface;

import java.util.List;
import java.util.function.Predicate;

import com.app.models.Product;

public class StreamInterfaceProgram4 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		Predicate<Product> priceLowPredicate = new Predicate<Product>() {
			@Override
			public boolean test(Product t) {
				return t.getPrice()<=150;
			}
		};
		
		Predicate<Product> quantityHighPredicate = (p)->p.getQuantity()>=50;
		
		System.out.println("--- Filter price lessthan or equals to 150.00 ---");
		productList.stream().filter(priceLowPredicate).forEach(p->{
			System.out.println(p);
		});
		
		System.out.println("--- Filter quantity greaterThan or equals to 50 ---");
		productList.stream().filter(quantityHighPredicate).forEach(p->{
			System.out.println(p);
		});
	}
}
