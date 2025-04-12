package com.shoppingcart;

public class Product {

	String name;
	double price;
	int quantity;
	
	

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public double getTotal() {
		return price * quantity;
	}

	public void display() {
		System.out.println("📦 Name: " + name);
		System.out.println("💵 Price: ₹" + price);
		System.out.println("🔢 Quantity: " + quantity);
		System.out.println("💰 Subtotal: ₹" + getTotal());
		System.out.println("--------------------------");
	}
}
