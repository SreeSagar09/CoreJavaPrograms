package com.app.collectorsclass;

import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram17 {
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
		
		Double averageProductQuantity1 = productList.stream()
				.collect(Collectors.averagingInt(quantityTIF));
		
		System.out.println("------ Average of product quantity by averagingInt method ------");
		System.out.println(averageProductQuantity1);
		
		Double averageProductQuantity2 = productList.stream()
				.collect(Collectors.averagingLong(quantityTLF));
		
		System.out.println("------ Average of product quantity by averageingLong method -----");
		System.out.println(averageProductQuantity2);
		
		Double averageProductPrice1 = productList.stream()
				.collect(Collectors.averagingDouble(priceTDF));
		
		System.out.println("----- Average of product price by averagingDouble method ------");
		System.out.println(averageProductPrice1);
	}
}
