package com.app.streaminterface;

import java.util.List;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import com.app.models.Product;

public class StreamInterfaceProgram6 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();
		
		ToIntFunction<Product> quantityToIntFunction = (p)->p.getQuantity();
		
		ToLongFunction<Product> quantityToLongFunction = (p)->p.getQuantity();
		
		ToDoubleFunction<Product> priceToDoubleFunction = (p)->p.getPrice();
		
		ToDoubleFunction<Product> multiplyQtyAndPriceStream = (p)->p.getQuantity()*p.getPrice();
		
		
		IntStream qtyIntStream = productList.stream().mapToInt(quantityToIntFunction);
		
		System.out.println("--- Get quantity from product ---");
		qtyIntStream.forEach(i->{
			System.out.println(i);
		});
		
		LongStream qtyLongStream = productList.stream().mapToLong(quantityToLongFunction);
		
		System.out.println("--- Get quantity from product ---");
		qtyLongStream.forEach(l->{
			System.out.println(l);
		});
		
		DoubleStream priceDoubleStream = productList.stream().mapToDouble(priceToDoubleFunction);
		
		System.out.println("--- Get price from product ---");
		priceDoubleStream.forEach(d->{
			System.out.println(d);
		});
		
		DoubleStream multiplyQtyAndPriceDoubleStream = productList.stream().mapToDouble(multiplyQtyAndPriceStream);
		
		System.out.println("--- Get multiply quantity and price of product ---");
		multiplyQtyAndPriceDoubleStream.forEach(d->{
			System.out.println(d);
		});
	}
}
