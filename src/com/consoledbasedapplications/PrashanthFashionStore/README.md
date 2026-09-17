# 👕 Prashanth Fashion Hub

**Prashanth Fashion Hub** is a Java-based console shopping application that allows users to select clothing products from **Men's Wear, Women's Wear, and Kids' Wear** categories.

The application uses **nested switch statements, do-while loops, Scanner input, conditional statements, and arithmetic operations** to simulate a basic clothing shopping and billing system.

---

## 📌 Project Overview

The application provides a simple shopping experience through the console.

Users can:

* Select a clothing category
* Select products
* Select available sizes
* Add multiple products from the same category
* Continue shopping across different categories
* Generate a final bill
* Calculate **18% GST**
* Display the final payable amount

---

## ✨ Features

* 🛍️ Three clothing categories

  * Men's Wear
  * Women's Wear
  * Kids' Wear
* 👕 Multiple products under each category
* 📏 Different sizes for different products
* 💰 Product-specific pricing
* 🔄 Multiple product selection using `do-while`
* 🔀 Nested `switch` statements
* 🧾 Automatic bill generation
* 🧮 Subtotal calculation
* 💸 18% GST calculation
* 💵 Final amount calculation
* ✅ Input validation using `default` cases

---

## 🛠️ Technologies Used

| Technology           | Usage                                |
| -------------------- | ------------------------------------ |
| Java                 | Application development              |
| Scanner              | Reading user input                   |
| Switch Expression    | Category, product and size selection |
| do-while Loop        | Repeated shopping                    |
| if Statement         | Displaying selected products         |
| Arithmetic Operators | Billing and GST calculation          |

---

## 📂 Project Structure

```text
myfirstproject/
│
└── src/
    └── com/
        └── consoledbasedapplications/
            └── PrashanthFashionStore.java
```

### Package

```java
package com.consoledbasedapplications;
```

### Main Class

```java
PrashanthFashionStore
```

---

# 🛍️ Categories and Products

## 👨 Men's Wear

| Product | Size | Price |
| ------- | ---- | ----: |
| Shirt   | S    |  ₹599 |
| Shirt   | M    |  ₹899 |
| Shirt   | L    |  ₹999 |
| Shirt   | XL   | ₹1599 |
| T-Shirt | S    |  ₹399 |
| T-Shirt | M    |  ₹499 |
| T-Shirt | L    |  ₹599 |
| T-Shirt | XL   |  ₹699 |
| Pant    | 28   |  ₹799 |
| Pant    | 30   |  ₹799 |
| Pant    | 32   |  ₹799 |
| Pant    | 34   |  ₹799 |

---

## 👩 Women's Wear

| Product | Size | Price |
| ------- | ---- | ----: |
| Dress   | S    |  ₹799 |
| Dress   | M    |  ₹899 |
| Dress   | L    |  ₹999 |
| Dress   | XL   | ₹1099 |
| Top     | S    |  ₹499 |
| Top     | M    |  ₹599 |
| Top     | L    |  ₹699 |
| Top     | XL   |  ₹799 |
| Jeans   | 28   |  ₹899 |
| Jeans   | 30   |  ₹999 |
| Jeans   | 32   | ₹1099 |
| Jeans   | 34   | ₹1199 |

---

## 👶 Kids' Wear

| Product | Size | Price |
| ------- | ---- | ----: |
| Shirt   | S    |  ₹399 |
| Shirt   | M    |  ₹449 |
| Shirt   | L    |  ₹499 |
| Shirt   | XL   |  ₹549 |
| T-Shirt | S    |  ₹299 |
| T-Shirt | M    |  ₹349 |
| T-Shirt | L    |  ₹399 |
| T-Shirt | XL   |  ₹449 |
| Pant    | 28   |  ₹499 |
| Pant    | 30   |  ₹549 |
| Pant    | 32   |  ₹599 |
| Pant    | 34   |  ₹649 |

---

# 🔄 Application Flow

```text
              ┌──────────────────────┐
              │  Start Application   │
              └──────────┬───────────┘
                         │
                         ▼
              ┌──────────────────────┐
              │   Select Category    │
              └──────────┬───────────┘
                         │
          ┌──────────────┼──────────────┐
          ▼              ▼              ▼
       Men's          Women's          Kids'
        Wear            Wear            Wear
          │              │              │
          ▼              ▼              ▼
      Select          Select          Select
      Product         Product         Product
          │              │              │
          ▼              ▼              ▼
      Select          Select          Select
       Size            Size            Size
          │              │              │
          ▼              ▼              ▼
      Add Price       Add Price       Add Price
          │              │              │
          └──────────────┼──────────────┘
                         ▼
                Continue Shopping?
                    /        \
                  Yes         No
                   │           │
                   ▼           ▼
              Select Again   Generate Bill
                               │
                               ▼
                         Calculate GST
                               │
                               ▼
                       Display Final Amount
                               │
                               ▼
                            Thank You
```

---

# 🔁 Loop Structure

The application uses multiple `do-while` loops.

### 1. Main Shopping Loop

The outer `do-while` loop allows the user to continue selecting different categories.

```java
do {
    // Select category
    // Shopping logic

    System.out.println(
        "Do you want to continue with category if Yes click Y or no click N"
    );

    yn = sc.next();

} while (yn.equalsIgnoreCase("y"));
```

### 2. Men's Wear Loop

Allows the user to select multiple men's products.

```java
do {
    // Select men's product
} while (myn.equalsIgnoreCase("y"));
```

### 3. Women's Wear Loop

Allows multiple women's products to be selected.

```java
do {
    // Select women's product
} while (womenContinue.equalsIgnoreCase("y"));
```

### 4. Kids' Wear Loop

Allows multiple kids' products to be selected.

```java
do {
    // Select kids' product
} while (kidsContinue.equalsIgnoreCase("y"));
```

---

# 🔀 Switch Case Structure

The project uses **nested switch statements**.

For example:

```text
Category Switch
      │
      ├── men
      │    └── Product Switch
      │          ├── shirt
      │          │     └── Size Switch
      │          ├── tshirt
      │          │     └── Size Switch
      │          └── pant
      │                └── Size Switch
      │
      ├── women
      │    └── Product Switch
      │          ├── dress
      │          ├── top
      │          └── jeans
      │
      └── kid
           └── Product Switch
                 ├── shirt
                 ├── tshirt
                 └── pant
```

This demonstrates how nested `switch` statements can be used to handle multiple levels of user choices.

---

# 💰 Billing System

After the user finishes shopping, the application generates a bill.

The selected product prices are stored in separate variables.

For example:

```java
double sprice = 0;
double tsprice = 0;
double pprice = 0;
```

Women's products:

```java
double womenDressPrice = 0;
double womenTopPrice = 0;
double womenJeansPrice = 0;
```

Kids' products:

```java
double kidsShirtPrice = 0;
double kidsTshirtPrice = 0;
double kidsPantPrice = 0;
```

---

## 🧮 Subtotal Calculation

The subtotal is calculated by adding all product totals.

```java
double totalPrice =
        sprice
        + tsprice
        + pprice
        + womenDressPrice
        + womenTopPrice
        + womenJeansPrice
        + kidsShirtPrice
        + kidsTshirtPrice
        + kidsPantPrice;
```

---

## 💸 GST Calculation

The application uses **18% GST**.

```java
double gst = totalPrice * 18 / 100;
```

### Formula

```text
GST = Subtotal × 18 / 100
```

---

## 💵 Final Amount

```java
double finalAmount = totalPrice + gst;
```

### Formula

```text
Final Amount = Subtotal + GST
```

---

# 🧾 Sample Shopping Scenario

Suppose the customer purchases:

### Men's Wear

* Medium Shirt = ₹899
* Large T-Shirt = ₹599

### Women's Wear

* Small Dress = ₹799
* Jeans Size 32 = ₹1099

### Kids' Wear

* XL T-Shirt = ₹449
* Pant Size 30 = ₹549

### Calculation

```text
Men's Shirt       ₹899
Men's T-Shirt     ₹599
Women's Dress     ₹799
Women's Jeans    ₹1099
Kids T-Shirt      ₹449
Kids Pant         ₹549
----------------------
Subtotal         ₹4394

GST 18%           ₹790.92
----------------------
Final Amount     ₹5184.92
```

---

# 🖥️ Sample Output

```text
===============================
     PrashanthFashionHub
===============================
   Your Style, Your Choice
================================

choose category
men
women
kid

men

====== Mens Wear =======
Select your product
shirt
tshirt
pant

shirt

Select your shirt size:
s - Small
m - Medium
l - Large
xl - Extra Large

m

Shirt size is medium & Price-899 rs

Do you want to continue with mens wear if Yes click Y or no click N
n

Do you want to continue with category if Yes click Y or no click N
y

choose category
men
women
kid

women

========== WOMENS WEAR ==========

Select Product:
1. Dress
2. Top
3. Jeans

dress

Select Dress Size:
s - Small
m - Medium
l - Large
xl - Extra Large

s

Dress Size Small & Price - 799 rs

Do you want to continue with womens wear if Yes click Y or no click N
n

Do you want to continue with category if Yes click Y or no click N
y

choose category
men
women
kid

kid

========== KIDS WEAR ==========

Select Product:
Shirt
T-Shirt
Pant

tshirt

Select Kids T-Shirt Size:
s - Small
m - Medium
l - Large
xl - Extra Large

xl

Kids T-Shirt Extra Large & Price - 449 rs

Do you want to continue with kids wear if Yes click Y or no click N
n

Do you want to continue with category if Yes click Y or no click N
n

==============================
     Prashanth Fashion Hub
==============================

Men's Shirt     : 899.0 rs
------------------------------
Women's Dress   : 799.0 rs
------------------------------
Kids T-Shirt    : 449.0 rs
------------------------------
Subtotal        : 2147.0 rs
GST (18%)       : 386.46 rs
Final Amount    : 2533.46 rs
==============================
     Thank You For Shopping
==============================
```

---

# 🧠 Java Concepts Demonstrated

This project is useful for practicing the following Java concepts:

### 1. Scanner

Used to accept input from the user.

```java
Scanner sc = new Scanner(System.in);
```

---

### 2. Variables

The program uses variables to store product prices.

```java
double sprice = 0;
double womenDressPrice = 0;
```

---

### 3. do-while Loop

Used when the shopping operation needs to execute at least once.

```java
do {
    // Shopping operation
} while (condition);
```

---

### 4. switch Expression

Used to process categories, products and sizes.

```java
switch (catg) {
    case "men" -> {
        // Men's Wear
    }
    case "women" -> {
        // Women's Wear
    }
    case "kid" -> {
        // Kids' Wear
    }
}
```

---

### 5. Nested switch

A switch is placed inside another switch to handle product and size selection.

---

### 6. if Statement

Used to display only the products that were selected.

```java
if (sprice > 0) {
    System.out.println("Men's Shirt : " + sprice + " rs");
}
```

---

### 7. Arithmetic Operators

Used for:

* Addition
* Multiplication
* Division

Example:

```java
double gst = totalPrice * 18 / 100;
```

---

### 8. String Comparison

The application uses:

```java
yn.equalsIgnoreCase("y")
```

This allows the user to enter either:

```text
Y
```

or

```text
y
```

---

# ⚠️ Current Input Behavior

The current implementation uses **case-sensitive** category and product choices.

For example:

```text
men
women
kid
```

should be entered in lowercase.

Similarly:

```text
shirt
tshirt
pant
```

should be entered in lowercase.

However, the continuation questions use:

```java
equalsIgnoreCase("y")
```

so both `Y` and `y` are accepted.

### Women's Menu Note

The women's menu displays:

```text
1. Dress
2. Top
3. Jeans
```

but the current code expects the text:

```text
dress
top
jeans
```

Therefore, entering `1`, `2`, or `3` will currently go to the default case.

---

# ⚠️ Input Validation

The program has `default` cases for invalid category, product and size selections.

Example:

```java
default -> System.out.println(
    "Entered Size is not available"
);
```

However, numeric sizes are read using:

```java
sc.nextInt();
```

Therefore, entering text instead of a number for pant or jeans size can cause an `InputMismatchException`.

---

# 📊 Billing Logic

The application does not maintain individual cart items.

Instead, it maintains a separate total for each product type.

For example:

```text
Men's Shirt     → sprice
Men's T-Shirt   → tsprice
Men's Pant      → pprice

Women's Dress   → womenDressPrice
Women's Top     → womenTopPrice
Women's Jeans   → womenJeansPrice

Kids Shirt      → kidsShirtPrice
Kids T-Shirt    → kidsTshirtPrice
Kids Pant       → kidsPantPrice
```

If the same product is selected multiple times, its price is added to the corresponding variable.

Example:

```java
sprice += 899;
```

---

# 🎯 Learning Objectives

Through this project, I practiced:

* Java syntax and program structure
* `Scanner` class
* Variables and data types
* `if` statements
* `switch` expressions
* Nested switch statements
* `do-while` loops
* String comparison
* Arithmetic operations
* User input handling
* Basic billing logic
* GST calculation
* Console-based application development

---

# 🚀 Future Enhancements

The project can be improved by adding:

* [ ] Product quantity
* [ ] Individual cart items
* [ ] Remove item from cart
* [ ] Product IDs
* [ ] Customer details
* [ ] Discount coupons
* [ ] Different GST rates
* [ ] Payment options
* [ ] Exception handling
* [ ] Better input validation
* [ ] Product inventory
* [ ] File/database storage
* [ ] Login and registration
* [ ] Object-Oriented Programming
* [ ] Separate classes for products and customers
* [ ] Receipt generation

---

# 💡 Possible OOP Version

The current project is primarily a **procedural console application**.

A future version can use Java OOP concepts such as:

```text
Product
   │
   ├── Men's Product
   ├── Women's Product
   └── Kids' Product

Customer
Cart
Bill
Payment
```

This would make the project more scalable and closer to a real-world shopping application.

---

# ▶️ How to Run

### Step 1: Clone the Repository

```bash
git clone <your-repository-url>
```

### Step 2: Open the Project

Open the project in:

* Eclipse
* IntelliJ IDEA
* VS Code
* Any Java-supported IDE

### Step 3: Locate the Java File

```text
src/com/consoledbasedapplications/PrashanthFashionStore.java
```

### Step 4: Run the Program

Run:

```java
PrashanthFashionStore.java
```

The application will start in the console.

---

# 📌 Project Type

**Console-Based Java Application**

### Application Name

**Prashanth Fashion Hub**

### Language

**Java**

### Category

**Shopping / Billing Application**

---

# 👨‍💻 Author

**Prashanth Potta**

B.Tech Computer Science and Engineering

---

## ⭐ Project Highlights

This project demonstrates practical usage of Java control-flow concepts by combining:

```text
Scanner
   ↓
do-while Loop
   ↓
switch
   ↓
Nested switch
   ↓
Product Selection
   ↓
Price Calculation
   ↓
GST Calculation
   ↓
Final Bill
```

> **Prashanth Fashion Hub - Your Style, Your Choice 👕🛍️**
