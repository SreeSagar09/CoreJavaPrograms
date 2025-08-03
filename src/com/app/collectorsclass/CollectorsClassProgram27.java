package com.app.collectorsclass;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram27 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		ToIntFunction<Product> quantityTIF = new ToIntFunction<Product>() {
			@Override
			public int applyAsInt(Product p) {
				return p.getQuantity()!=null?p.getQuantity():0;
			}
		};
		
		ToLongFunction<Product> quantityTLF = (p)->{
			return p.getQuantity()!=null?p.getQuantity():0l;
		};
		
		ToDoubleFunction<Product> priceTDF = (p)->{
			return p.getPrice()!=null?p.getPrice():0d;
		};
		
		IntSummaryStatistics intSummaryStatistics = productList.stream()
				.collect(Collectors.summarizingInt(quantityTIF));
		
		System.out.println("--- Product quantity summary statistics by summarizingInt method ---");
		System.out.println("Count : "+intSummaryStatistics.getCount());
		System.out.println("Sum : "+intSummaryStatistics.getSum());
		System.out.println("Average : "+intSummaryStatistics.getAverage());
		System.out.println("Minimum : "+intSummaryStatistics.getMin());
		System.out.println("Maximum : "+intSummaryStatistics.getMax());
		
		LongSummaryStatistics longSummaryStatistics = productList.stream()
				.collect(Collectors.summarizingLong(quantityTLF));
		
		System.out.println("--- Product quantity summary statistics by summarizingLong method ---");
		System.out.println("Count : "+longSummaryStatistics.getCount());
		System.out.println("Sum : "+longSummaryStatistics.getSum());
		System.out.println("Average : "+longSummaryStatistics.getAverage());
		System.out.println("Minimum : "+longSummaryStatistics.getMin());
		System.out.println("Maximum : "+longSummaryStatistics.getMax());
		
		DoubleSummaryStatistics doubleSummaryStatistics = productList.stream()
				.collect(Collectors.summarizingDouble(priceTDF));
		
		System.out.println("--- Product price summary statistics by summarizingDouble method ---");
		System.out.println("Count : "+doubleSummaryStatistics.getCount());
		System.out.println("Sum : "+doubleSummaryStatistics.getSum());
		System.out.println("Average : "+doubleSummaryStatistics.getAverage());
		System.out.println("Minimum : "+doubleSummaryStatistics.getMin());
		System.out.println("Maximum : "+doubleSummaryStatistics.getMax());
	}
}
