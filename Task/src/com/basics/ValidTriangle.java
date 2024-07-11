package com.basics;
/*
 * 2.condiiton---Write a program to check whether a triangle is valid or not, 
when the three angles of the triangle are entered through the 
keyboard. A triangle is valid if the sum of all the three angles 
is equal to 180 degrees. 
 */

import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

public class ValidTriangle {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	
	float angle1,angle2,angle3;
	
	System.out.println("Enter 1st angle ");
	angle1=sc.nextFloat();
	
	System.out.println("Enter 2ed angle ");
	angle2=sc.nextFloat();
	
	System.out.println("Enter 3rd angle ");
	angle3=sc.nextFloat();
	
	if ((angle1+angle2+angle3)==180) {
		System.out.println("Valid Triangle");
	} else {
		System.out.println("Invalid Triangle");
	}
}
}
