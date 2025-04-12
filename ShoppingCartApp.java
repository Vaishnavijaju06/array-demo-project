package com.shoppingcart;

import java.util.Scanner;

public class ShoppingCartApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cart cart = new Cart();

		while (true) {
			System.out.println("\n🛒 Shopping Cart Menu");
			System.out.println("1. Add Product");
			System.out.println("2. View Cart");
			System.out.println("3. Calculate Grand Total");
			System.out.println("4. Apply Promo Code");
			System.out.println("5. Remove Product");
			System.out.println("6. Generate Bill");
			System.out.println("7. Exit");
			System.out.print("Choose an option: ");
			int choice = sc.nextInt();
			sc.nextLine(); // consume newline

			
			switch (choice) {
			case 1: {
				System.out.print("Enter product name: ");
				String name = sc.nextLine();
				System.out.print("Enter price: ");
				double price = sc.nextDouble();
				System.out.print("Enter quantity: ");
				int qty = sc.nextInt();
				cart.addProduct(name, price, qty);
				break;
			}
			case 2:
				cart.viewCart();
				break;
			case 3:
				System.out.println("Grand Total: ₹" + cart.calculateGrandTotal());
				break;
			case 4:

				System.out.print("Enter promo code (SAVE10 or none): ");
				String code = sc.nextLine();
				cart.applyPromoCode(code);
				break;
			case 5:
				System.out.print("Enter product number to remove: ");
				int num = sc.nextInt();
				cart.removeProduct(num);
				break;

			case 6:
				cart.generateBill();
				break;

			case 7:
				System.out.println("👋 Thank you for shopping with us!");
				sc.close();
				break;

			default:
				System.out.println("❌ Invalid option. Please try again.");
				break;

			}
		}
	}
}
