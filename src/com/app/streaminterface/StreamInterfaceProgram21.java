package com.app.streaminterface;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

import com.app.models.Product;

public class StreamInterfaceProgram21 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		BiFunction<Double, Double, Double> sumPriceBiFunction = new BiFunction<Double, Double, Double>() {
			@Override
			public Double apply(Double d1, Double d2) {
				return d1+d2;
			}
		};
		
		BinaryOperator<Double> sumPriceBinaryOperator = new BinaryOperator<Double>() {
			@Override
			public Double apply(Double d1, Double d2) {
				return d1+d2;
			}
		};
		
		Double totalPrice = productList.parallelStream()
				.map(p->p.getQuantity()*p.getPrice())
				.reduce(0d, sumPriceBiFunction, sumPriceBinaryOperator);
		
		System.out.println("-------- Total products price --------");
		System.out.println(totalPrice);
	}
}
