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

// create class product
public class Product {
	// product properties
	private int productId;
	private String productName;
	private int productQuantity;
	private int productPrice;

	// no arguments constructor
	public Product() {
		super();
	}

	// parameterized constructor
	public Product(int productId, String productName, int productQuantity, int productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productQuantity = productQuantity;
		this.productPrice = productPrice;
	}

	// getter setter for product id
	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	// getter setter for product name
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	// getter setter for product quantity
	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	// getter setter for product price
	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productQuantity="
				+ productQuantity + ", productPrice=" + productPrice + "]";
	}

}
