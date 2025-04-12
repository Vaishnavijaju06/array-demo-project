package com.shoppingcart;

public class ShoppingCart {
	Product[] products = new Product[5];
	int count = 0;
	String promoCode = "none";

	public void addProduct(String name, double price, int quantity) {
		if (count >= 5) {
			System.out.println("❌ Cart full. Max 5 products allowed.\n");
			return;
		}
		products[count] = new Product(name, price, quantity);
		count++;
		System.out.println("✅ Product added successfully.\n");
	}

	public void viewCart() {
		if (count == 0) {
			System.out.println("🛒 Your cart is empty.\n");
			return;
		}
		System.out.println("🛍️ Products in your cart:");
		int productNo = 1;
		for (Product p : products) {
			if (p != null) {
				System.out.println("product #." + productNo);
				p.display();
				productNo++;
			}
		}
		System.out.println();
	}

	public double calculateGrandTotal() {
		double total = 0;
		for (Product p : products) {
			if (p != null)
				total += p.getTotal();
		}
		return total;
	}

	public void applyPromoCode(String code) {
		if (code.equalsIgnoreCase("SAVE10") || code.equalsIgnoreCase("none")) {
			promoCode = code;
			System.out.println("✅ Promo code applied.\n");
		} else {
			System.out.println("❌ Invalid promo code.\n");
		}
	}

	public void removeProduct(int productNo) {
		if (productNo < 1 || productNo > count || products[productNo - 1] == null) {
			System.out.println("❌ Invalid product number.\n");
			return;
		}

		for (int i = productNo - 1; i < count - 1; i++) {
			products[i] = products[i + 1];
		}
		
		products[count - 1] = null;
		count--;

		System.out.println("🗑️ Product removed successfully.\n");
	}

	public void generateBill() {
		double total = calculateGrandTotal();
		double discount = 0;

		if (promoCode.equalsIgnoreCase("SAVE10")) {
			if (total >= 500) {
				discount = total * 0.10;
				total -= discount;
				System.out.println("🎉 10% promo discount applied: -₹" + discount);
			} else {
				System.out.println("❌ Promo not applied. Total must be ₹500 or more.");
			}
		}

		double tax = total * 0.08;
		double finalAmount = total + tax;

		System.out.println("\n🧾 Final Bill");
		System.out.println("---------------------------");
		viewCart();
		System.out.println("---------------------------");
		System.out.println("🧮 Grand Total  : ₹" + calculateGrandTotal());
		System.out.println("💸 Discount     : ₹" + discount);
		System.out.println("📈 Tax (8%)     : ₹" + tax);
		System.out.println("💰 Final Amount : ₹" + finalAmount);
		System.out.println("---------------------------");
	}
}
