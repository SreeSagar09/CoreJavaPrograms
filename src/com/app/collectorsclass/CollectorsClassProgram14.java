package com.app.collectorsclass;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram14 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		Comparator<Product> priceComparator = (p1, p2)->{
			return p1.getPrice().compareTo(p2.getPrice());
		};
		
		Collector<Product, ?, Optional<Product>> minPriceProductCollector = Collectors.minBy(priceComparator);
		
		Collector<Product, ?, Optional<Product>> maxPriceProductCollector = Collectors.maxBy(priceComparator);
		
		Function<Optional<Product>, String> productNameAndPriceFunction = (op)->{
			return op.isPresent()?(op.get().getProductName()+" - "+op.get().getPrice()):"";
		};
		
		String minPriceProductName = productList.stream()
				.collect(Collectors.collectingAndThen(minPriceProductCollector, productNameAndPriceFunction));
		
		System.out.println("---- Minimum price product name ------");
		System.out.println(minPriceProductName);
		
		String maxPriceProductName = productList.stream()
				.collect(Collectors.collectingAndThen(maxPriceProductCollector, productNameAndPriceFunction));
		
		System.out.println("------ Maximum price product name ------");
		System.out.println(maxPriceProductName);
	}
}
