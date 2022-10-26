/*
 Program : Create  a HashMap to store the fees submitted by student .
 		   The key of the Map will be Student Id.
		   Create a method to find a student using the ID."
 @Author : Royston
 @Date : 26 Oct
*/

package com.StudentDetails;

import java.util.HashMap;
import java.util.Scanner;

public class StudentDaoImpl implements StudentDao {

	// Creating HashMap
	HashMap<Integer, Student> stdList = new HashMap<Integer, Student>();
	// create scanner object
	Scanner sc = new Scanner(System.in);

	@Override
	public void createStudent() {
		// student object
		Student std = new Student();
		// input id
		System.out.println("Enter student Id");
		int stdId = sc.nextInt();

		// input stdName
		System.out.println("Enter student name");
		std.setStudentName(sc.next());
		// input stdCourse
		System.out.println("Enter student course");
		std.setStudentCourse(sc.next());
		// input stdFees
		System.out.println("Enter student Fees");
		std.setStuudentFees(sc.nextInt());

		// add to stdList
		stdList.put(stdId, std);
		System.out.println("--------- STUDENT ADDED --------");

	}

	@Override
	public void findStudent() {
		// input stdId
		System.out.println("Enter student Id");
		int stdId = sc.nextInt();

		// print student details
		System.out.println("\n--------- STUDENT DETAILS --------");
		System.out.println(stdList.get(stdId));

	}

}
