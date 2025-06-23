package com.app.collectorsclass;

import java.util.List;
import java.util.stream.Collectors;

import com.app.models.Product;

public class CollectorsClassProgram2 {
	public static void main(String[] args) {
		List<Product> productList = Product.getProductList();

		List<String> productNameList = productList.stream().map(p->p.getProductName()).collect(Collectors.toList());
		
		System.out.println("----- ProductName List -----");
		productNameList.forEach(pn->{
			System.out.println(pn);
		});
	}
}
