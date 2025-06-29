package com.app.streaminterface;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

import com.app.models.Product;

public class StreamInterfaceProgram19 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		BinaryOperator<Double> sumPriceBinaryOperator = new BinaryOperator<Double>() {
			@Override
			public Double apply(Double d1, Double d2) {
				return d1+d2;
			}
			
		};
		
		BinaryOperator<String> concatProductName = (s1, s2) -> {
			return s1.isEmpty()?s1.concat(s2):s1.concat(", ").concat(s2);
		};
		
		Double totalProductsPrice = productList.stream()
				.map(p->p.getQuantity()*p.getPrice())
				.reduce(0d, sumPriceBinaryOperator);
		
		System.out.println("------ Total products price ------");
		System.out.println(totalProductsPrice);
		
		String concatenatedProductName = productList.stream()
				.map(p->p.getProductName())
				.reduce("", concatProductName);
		
		System.out.println("------- Concatenated product names -------");
		System.out.println(concatenatedProductName);
	}
}
