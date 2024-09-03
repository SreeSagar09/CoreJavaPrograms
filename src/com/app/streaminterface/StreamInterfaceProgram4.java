package com.app.streaminterface;

import java.util.List;
import java.util.stream.Collectors;

import com.app.models.Product;

public class StreamInterfaceProgram4 {
	public static void main(String[] args) {
		List<Product> productsList = Product.getProductList();
		
		System.out.println("Original Product List");
		productsList.forEach(p->{System.out.println(p);});
		
		List<Product> naturalOrderProductList = productsList.stream().sorted().collect(Collectors.toList());
		
		System.out.println("Natural Order Product List");
		naturalOrderProductList.forEach(p->{System.out.println(p);});
		
		List<Product> priceAscProductList = productsList.stream().sorted((p1, p2)->p1.getPrice().compareTo(p2.getPrice())).collect(Collectors.toList());
		
		System.out.println("Price Ascending Order Product List");
		priceAscProductList.forEach(p->{System.out.println(p);});
		
		List<Product> priceDescProductList = productsList.stream().sorted((p1, p2)->p2.getPrice().compareTo(p1.getPrice())).collect(Collectors.toList());
		
		System.out.println("Price Descending Order Product List");
		priceDescProductList.forEach(p->{System.out.println(p);});
		
		List<Product> productCodeAscProductList = productsList.stream().sorted((p1, p2)->p1.getProductCode().compareTo(p2.getProductCode())).collect(Collectors.toList());
		
		System.out.println("ProductCode Ascending Order Product List");
		productCodeAscProductList.forEach(p->{System.out.println(p);});
		
		List<Product> ProductCodeDescProductList = productsList.stream().sorted((p1, p2)->p2.getProductCode().compareTo(p1.getProductCode())).collect(Collectors.toList());
		
		System.out.println("ProductCode Descending Order Product List");
		ProductCodeDescProductList.forEach(p->{System.out.println(p);});
	}

}
