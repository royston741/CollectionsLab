/*
 Program : Create an product class.
		   Create an ArrayList and perform following operations
			1. Add an product
			2. Delete a product.
			3.Display all the products 
			> Sort on the basis of price
			>Sort on the basis of quantity
 @Author : Royston
 @Date : 26 Oct
*/

package com.productManagement;

// imports
import java.util.ArrayList;
import java.util.Scanner;

// create  productDaoImpl
public class ProductDaoImpl implements ProductDao {
	// Create array list
	ArrayList<Product> products = new ArrayList();
	// create scanner object
	Scanner sc = new Scanner(System.in);

	// add products method
	public void addProduct() {
		// product object
		Product p = new Product();

		// set product id
		System.out.println("Enter product Id :");
		p.setProductId(sc.nextInt());
		// set product name
		System.out.println("Enter product name :");
		p.setProductName(sc.next());
		// set product quantity
		System.out.println("Enter product quantity :");
		p.setProductQuantity(sc.nextInt());
		// set product price
		System.out.println("Enter product price :");
		p.setProductPrice(sc.nextInt() * p.getProductQuantity());

		// add product
		products.add(p);
		System.out.println("-------- PRODUCT ADDED --------\n");
	}

	// delete product
	public void deleteProduct() {
		// product object
		Product p = new Product();

		// get product id to be deleted
		System.out.println("Enter product Id :");
		int pId = sc.nextInt();
		// delete product
		Product delProduct = null;
		boolean isFound = false;

		// traverse products
		for (Product i : products) {
			// if equal
			if (pId == i.getProductId()) {
				// store product object
				delProduct = i;
				// set isFound true
				isFound = true;
			} // if end
		} // for end

		// if found
		if (isFound) {
			// delete
			products.remove(delProduct);
			System.out.println("-------- PRODUCT DELETED --------\n");
		}
		// if not found
		else {
			System.out.println("No product found\n");
		}

	}

	// display all products
	public void displayAllProduct() {
		// print all product details
		System.out.println("---------- ALL PRODUCTS --------- ");
		products.forEach(product -> System.out.println(product));
	}

	// sort of price
	public void sortOnPrice() {
		// input price
		System.out.println("Enter the price to sort :");
		int price = sc.nextInt();

		// choices
		System.out.println("1. Price greater than");
		System.out.println("2. Price lower than");
		// enter choices
		System.out.println("Enter choice");
		int ch = sc.nextInt();

		// if choice greater
		if (ch == 1) {
			System.out.println("\n---------- PRODUCTS ABOVE PRICE " + price + " --------- ");
			// traverse products
			for (Product i : products) {
				// if greater than price
				if (i.getProductPrice() > price) {
					// print product
					System.out.println(i);
				} // if end
			} // for end
		}
		// if price lower
		else {
			System.out.println("\n---------- PRODUCTS BELOW PRICE " + price + " --------- ");
			// traverse products
			for (Product i : products) {
				// if greater than price
				if (i.getProductPrice() < price) {
					// print product
					System.out.println(i);
				} // if end
			} // for end
		} // if-else end
	}

	// sort quantity
	public void sortOnQuantity() {
		// input quantity
		System.out.println("Enter the quantity to sort :");
		int quantity = sc.nextInt();

		// choices
		System.out.println("1. Quantity greater than");
		System.out.println("2. Quantity lower than");
		// enter choices
		System.out.println("Enter choice");
		int ch = sc.nextInt();

		// if choice greater
		if (ch == 1) {
			System.out.println("\n---------- PRODUCTS ABOVE QUANTITY " + quantity + " --------- ");
			// traverse products
			for (Product i : products) {
				// if greater than price
				if (i.getProductQuantity() > quantity) {
					// print product
					System.out.println(i);
				} // if end
			} // for end
		}
		// if price lower
		else {
			System.out.println("\n---------- PRODUCTS BELOW QUANTITY " + quantity + " --------- ");
			// traverse products
			for (Product i : products) {
				// if greater than price
				if (i.getProductQuantity() < quantity) {
					// print product
					System.out.println(i);
				} // if end
			} // for end
		} // if-else end
	}

}
