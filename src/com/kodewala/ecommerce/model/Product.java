package com.kodewala.ecommerce.model;

public class Product {
private int productId;
private String productName;
private String category;
private double price;
private int quantity;
private String brand;

public Product(int productId, String productName, String category, double price, int quantity, String brand) {
	super();
	this.productId = productId;
	this.productName = productName;
	this.category = category;
	this.price = price;
	this.quantity = quantity;
	this.brand = brand;
}
}
