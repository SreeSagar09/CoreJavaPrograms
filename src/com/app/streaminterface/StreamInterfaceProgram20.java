package com.app.streaminterface;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

import com.app.models.Product;

public class StreamInterfaceProgram20 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		BinaryOperator<Product> minPriceProductBinaryOperator = BinaryOperator
				.minBy(Comparator.comparingDouble(p->p.getPrice()));
		
		BinaryOperator<Product> maxPriceProductBinaryOperator = BinaryOperator
				.maxBy(Comparator.comparingDouble(p->p.getPrice()));
		
		BinaryOperator<Double> minPriceBinaryOperator = BinaryOperator
				.minBy((d1, d2)->d1.compareTo(d2));
		
		BinaryOperator<Double> maxPriceBinaryOperator = BinaryOperator
				.maxBy((d1, d2)->d1.compareTo(d2));
		
		BinaryOperator<String> concatProductName = (s1, s2) -> {
			return s1.concat(", ").concat(s2);
		};
		
		
		Optional<Product> minPriceProductOptional = productList.stream()
				.reduce(minPriceProductBinaryOperator);
		
		System.out.println("------- Minimum price product -------");
		System.out.println(minPriceProductOptional.isPresent()?minPriceProductOptional.get():"No Product");
		
		
		Optional<Product> maxPriceProductOptional = productList.stream()
				.reduce(maxPriceProductBinaryOperator);
		
		System.out.println("------- Maximum price product -------");
		System.out.println(maxPriceProductOptional.isPresent()?maxPriceProductOptional.get():"No Product");
		
		
		Optional<Double> minPriceOptional = productList.stream()
				.map(p->p.getPrice()).reduce(minPriceBinaryOperator);
		
		System.out.println("-------- Minimum price --------");
		System.out.println(minPriceOptional.isPresent()?minPriceOptional.get():"0.00");
		
		
		Optional<Double> maxPriceOptional = productList.stream()
				.map(p->p.getPrice()).reduce(maxPriceBinaryOperator);
		
		System.out.println("------- Maximum price --------");
		System.out.println(maxPriceOptional.isPresent()?maxPriceOptional.get():"0.00");
		
		
		Optional<String> concatenatedProductNameOptional = productList.stream()
				.map(p->p.getProductName()).reduce(concatProductName);
		
		System.out.println("------- Concatenated product names -------");
		System.out.println(concatenatedProductNameOptional.isPresent()?concatenatedProductNameOptional.get():"Empty product name");
	}
}
