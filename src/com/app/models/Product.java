package com.app.models;

import java.util.ArrayList;
import java.util.List;

public class Product implements Comparable<Product> {
	private Integer productId;
	private String productCode;
	private String producName;
	private Integer quantity;
	private Double price;
	
	public Product() {
		super();
	}

	public Product(Integer productId, String productCode, String producName, Integer quantity, Double price) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.producName = producName;
		this.quantity = quantity;
		this.price = price;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProducName() {
		return producName;
	}

	public void setProducName(String producName) {
		this.producName = producName;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product) {
			if(this ==  obj) {
				return true;
			}else {
				return this.productId.equals(((Product) obj).getProductId());
			}
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCode=" + productCode + ", producName=" + producName
				+ ", quantity=" + quantity + ", price=" + price + "]";
	}

	@Override
	public int compareTo(Product o) {
		return this.producName.compareTo(o.producName);
	}
	
	public static List<Product> getProductList(){
		List<Product> productList = new ArrayList<>();
		Product product1 = new Product(1, "P001", "Books", 12, 25.00);
		productList.add(product1);
		
		Product product3 = new Product(3, "P003", "Bags", 24, 250.00);
		productList.add(product3);
		
		Product product5 = new Product(5, "P005", "Pens", 120, 15.00);
		productList.add(product5);
		
		Product product2 = new Product(2, "P002", "Pencils", 54, 5.00);
		productList.add(product2);
		
		Product product4 = new Product(4, "P004", "Balls", 34, 30.00);
		productList.add(product4);
		
		Product product6 = new Product(6, "P006", "Bats", 10, 560.00);
		productList.add(product6);
		
		return productList;
	}

}
