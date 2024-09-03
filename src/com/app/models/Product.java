package com.app.models;

public class Product {
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
	
	
}
