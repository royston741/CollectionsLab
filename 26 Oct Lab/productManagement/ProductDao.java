/*
 Program : Create an product class.
		   Create an ArrayList and perform following opeartions
			1. Add an product
			2. Delete a product.
			3.Display all the products 
			> Sort on the basis of price
			>Sort on the basis of quantity
 @Author : Royston
 @Date : 26 Oct
*/

package com.productManagement;

// create interface
public interface ProductDao {

	// add product
	void addProduct();

	// delete product
	void deleteProduct();

	// display all product
	void displayAllProduct();

	// sort on price
	void sortOnPrice();

	// sort on quantity
	void sortOnQuantity();

}
