/*
 Program : Create  a HashMap to store the fees submitted by student .
 		   The key of the Map will be Student Id.
		   Create a method to find a student using the ID."
 @Author : Royston
 @Date : 26 Oct
*/
package com.StudentDetails;

// create student class
public class Student {
	// Student properties
	private String studentName;
	private String studentCourse;
	private int stuudentFees;

	// no argument constructor
	public Student() {
		super();
	}

	// parameterized constructor
	public Student(String studentName, String studentCourse, int stuudentFees) {
		super();
		this.studentName = studentName;
		this.studentCourse = studentCourse;
		this.stuudentFees = stuudentFees;
	}

	// getter setter for stdName
	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	// getter setter for stdCourse
	public String getStudentCourse() {
		return studentCourse;
	}

	public void setStudentCourse(String studentCourse) {
		this.studentCourse = studentCourse;
	}

	// getter setter for stdFees
	public int getStuudentFees() {
		return stuudentFees;
	}

	public void setStuudentFees(int stuudentFees) {
		this.stuudentFees = stuudentFees;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentCourse=" + studentCourse + ", stuudentFees="
				+ stuudentFees + "]";
	}

}
