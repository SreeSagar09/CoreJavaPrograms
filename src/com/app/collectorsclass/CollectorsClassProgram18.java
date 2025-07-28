package com.app.collectorsclass;

import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram18 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		BinaryOperator<Integer> sumIntegerBO = new BinaryOperator<Integer>() {
			@Override
			public Integer apply(Integer i1, Integer i2) {
				return i1+i2;
			}
		};
		
		BinaryOperator<Double> sumDoubleBO = (d1, d2)->{
			return d1+d2;
		};
		
		Function<Product, Integer> quantityFunction = new Function<Product, Integer>() {
			@Override
			public Integer apply(Product p) {
				return p.getQuantity();
			}
		};
		
		Function<Product, Double> priceFunction = (p)->{
			return p.getPrice();
		};
		
		Optional<Integer> sumQuantityOp1 = productList.stream()
				.collect(Collectors.mapping(quantityFunction, Collectors.reducing(sumIntegerBO)));
		
		System.out.println("--- Sum of product quantity by reducing[1-argument] method ---");
		System.out.println(sumQuantityOp1.orElse(0));
		
		Integer sumQuantity1 = productList.stream()
				.collect(Collectors.mapping(quantityFunction, Collectors.reducing(0, sumIntegerBO)));
		
		System.out.println("--- Sum of product quantity by reducing[2-argument] method ---");
		System.out.println(sumQuantity1);
		
		Integer sumQuantity2 = productList.stream()
				.collect(Collectors.reducing(0, quantityFunction, sumIntegerBO));
		
		System.out.println("--- Sum of product quantity by reducing[3-argument] method ---");
		System.out.println(sumQuantity2);
		
		Double sumPrice1 = productList.stream()
				.collect(Collectors.reducing(0d, priceFunction, sumDoubleBO));
		
		System.out.println("--- Sum of product price by reducing[3-argument] method ---");
		System.out.println(sumPrice1);
	}
}
