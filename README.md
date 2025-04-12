🛒 Shopping Cart Console Application
A simple menu-driven Java application simulating a real-world shopping cart system. This project is designed for beginner to intermediate Java learners to understand object-oriented programming, arrays, scanner input, and method-driven logic in a clean and structured way.

📁 Project Structure
com.shoppingcart
│
├── Product.java           // Represents a single product
├── ShoppingCart.java      // Manages product list, totals, and billing
└── ShoppingCartApp.java   // Main class with menu and user interaction

🎯 Features
✅ Add a product (name, price, quantity)
✅ View all added products
✅ Remove a product by its number
✅ Calculate grand total of products
✅ Apply promo code (SAVE10) for a 10% discount if total ≥ ₹500
✅ Add 8% tax during bill generation
✅ Generate a full itemized bill
✅ Menu-driven interaction via console
✅ Max 5 products supported (fixed-size array based)

🚀 Technologies Used
▪ Java (Core Java)
▪ JConsole-based UI
▪ JOOP Concepts – Class, Object, Method, Encapsulation
▪ JArray for product storage
▪ J-case & loops for menu

🧩 How It Works
1️⃣ Product.java
Represents a single product in the cart with:
Fields: name, price, quantity
Methods: getTotal(), display()

2️⃣ ShoppingCart.java
Handles:
product storage (Product[] products)
Add/remove/view products
Apply promo code and tax
Generate bill with calculations

3️⃣ ShoppingCartApp.java
Provides an interactive menu
Takes user input using Scanner
Calls ShoppingCart methods for actions

💡 Sample Menu
🛒 Shopping Cart Menu
1. Add Product
2. View Cart
3. Calculate Grand Total
4. Apply Promo Code
5. Remove Product
6. Generate Bill
7. Exit

🔐 Promo Code Logic
Use SAVE10 to get 10% discount
Discount applies only if total ≥ ₹500
Tax of 8% is applied after discount

📦 Sample Output
Enter product name: Headphones
Enter price: 1000
Enter quantity: 1
✅ Product added successfully.

Enter promo code: SAVE10
🎉 10% promo discount applied: -₹100.0

🧾 Final Bill
🧮 Grand Total  : ₹1000.0
💸 Discount     : ₹100.0
📈 Tax (8%)     : ₹72.0
💰 Final Amount : ₹972.0

📌 Author
Developed by Vaishnavi Jaju
As part of hands-on Core Java learning project 📚

