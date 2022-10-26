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

import java.util.Scanner;

// create AppTest class
public class AppTest {
	// create print menu method
	public static void printMenu() {
		System.out.println("\n--------- MENU ---------");
		System.out.println("1. ADD PRODUCT");
		System.out.println("2. DELETE PRODUCT");
		System.out.println("3. DISPLAY ALL PRODUCTs");
		System.out.println("4. SHORT BY PRICE");
		System.out.println("5. SHORT BY QUANTITY");
	}

	// call main method
	public static void main(String... args) {
		// create scanner object
		Scanner sc = new Scanner(System.in);
		// create productDaoImpl object
		ProductDaoImpl pd = new ProductDaoImpl();
		// set performOperatiions true
		boolean performOperations = true;
		// while true
		while (performOperations) {
			// print all menu
			printMenu();
			// store choice
			System.out.println("\nEnter choice : ");
			int ch = sc.nextInt();
			// compare choice
			switch (ch) {
			// add product
			case 1 -> pd.addProduct();
			// delete product
			case 2 -> pd.deleteProduct();
			// display all product
			case 3 -> pd.displayAllProduct();
			// sort by price
			case 4 -> pd.sortOnPrice();
			// sort by quantity
			case 5 -> pd.sortOnQuantity();
			}// switch end
		} // while end

	}// main end
}// class end
