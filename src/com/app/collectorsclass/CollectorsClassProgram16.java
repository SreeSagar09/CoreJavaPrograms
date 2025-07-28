package com.app.collectorsclass;

import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram16 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		ToIntFunction<Product> quantityTIF = new ToIntFunction<Product>() {
			@Override
			public int applyAsInt(Product p) {
				return p.getQuantity();
			}
		};
		
		ToLongFunction<Product> quantityTLF = (p)->{
			return p.getQuantity();
		};
		
		ToDoubleFunction<Product> priceTDF = Product::getPrice;
		
		Integer totalProductsQuantity1 = productList.stream()
				.collect(Collectors.summingInt(quantityTIF));
		
		System.out.println("------- Sum of product quantity by summingInt method -------");
		System.out.println(totalProductsQuantity1);
		
		Long totalProductsQuantity2 = productList.stream()
				.collect(Collectors.summingLong(quantityTLF));
		
		System.out.println("------ Sum of product quantity by summingLong method -------");
		System.out.println(totalProductsQuantity2);
		
		Double totalProductsPrice1 = productList.stream()
				.collect(Collectors.summingDouble(priceTDF));
		
		System.out.println("------ Sum of product price by summingDouble method --------");
		System.out.println(totalProductsPrice1);
	}
}
