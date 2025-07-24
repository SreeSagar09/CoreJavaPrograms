package com.app.collectorsclass;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram13 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		Comparator<Product> priceComparator = new Comparator<Product>() {
			@Override
			public int compare(Product p1, Product p2) {
				return p1.getPrice().compareTo(p2.getPrice());
			}
		};
		
		Comparator<Product> quantityComparator = (p1, p2)->{
			return p1.getQuantity().compareTo(p2.getQuantity());
		};
		
		Optional<Product> minPriceProduct = productList.stream()
				.collect(Collectors.minBy(priceComparator));
		
		System.out.println("------- Minimum price product --------");
		System.out.println(minPriceProduct.orElse(null));
		
		Optional<Product> maxPriceProduct = productList.stream()
				.collect(Collectors.maxBy(priceComparator));
		
		System.out.println("------- Maximum price product -------");
		System.out.println(maxPriceProduct.orElse(null));
		
		Optional<Product> minQuantityProduct = productList.stream()
				.collect(Collectors.minBy(quantityComparator));
		
		System.out.println("------- Minimum quantity product ------");
		System.out.println(minQuantityProduct.orElse(null));
		
		Optional<Product> maxQuantityProduct = productList.stream().collect(Collectors.maxBy(quantityComparator));
	
		System.out.println("------ Maximum quantity product -------");
		System.out.println(maxQuantityProduct.orElse(null));
	}
}
