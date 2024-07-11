package com.basics;

import java.util.Scanner;

/*
 * Write a program to find the greatest of the three numbers 
entered through the keyboard using conditional operators. 
 */

public class GreaterNumC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	int num1,num2,num3;
	
	System.out.println("Enter the 1st number ");
	num1=sc.nextInt();
	
	System.out.println("Enter the 2ed number ");
	num2=sc.nextInt();
	
	System.out.println("Enter the 3rd number ");
	num3=sc.nextInt();
	
	if (num1>=num2 && num1>=num3) {
		System.out.println("1st number is greater");
	} else if (num2>=num1 && num2>=num3) {
		System.out.println("2ed number is greater");
	} else {
		System.out.println("3rd number is greater");
	}
	}
}
