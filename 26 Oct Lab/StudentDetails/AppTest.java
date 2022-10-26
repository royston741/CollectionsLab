/*
 Program : Create  a HashMap to store the fees submitted by student .
 		   The key of the Map will be Student Id.
		   Create a method to find a student using the ID."
 @Author : Royston
 @Date : 26 Oct
*/
package com.StudentDetails;

import java.util.Scanner;

// Create AppTest class
public class AppTest {
	// create print menu method
	public static void printMenu() {
		System.out.println("\n--------- MENU ---------");
		System.out.println("1. ADD STUDENT");
		System.out.println("2. FIND STUDENT");
	}

	// call main method
	public static void main(String[] args) {
		// create scanner object
		Scanner sc = new Scanner(System.in);
		// create Obj
		StudentDaoImpl s = new StudentDaoImpl();
		// set performOperations to true
		boolean performOperations = true;
		// while perform
		while (performOperations) {
			// call menu function
			printMenu();
			// enter choice
			System.out.println("\nEnter choice :");
			int ch = sc.nextInt();
			// compare choice
			switch (ch) {
			// create student
			case 1 -> s.createStudent();
			// find student
			case 2 -> s.findStudent();
			}// switch end
		} // while end
	}// main end

}// class end
