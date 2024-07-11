package com.basics;

import java.util.Scanner;

/*
 * 2.Condition-Any integer is input through the keyboard. Write a program to 
find out whether it is an odd number or even number
 */

public class OddEven {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	int i;
	System.out.println("Enter integer num");
	i=sc.nextInt();
	
	if (i%2==0) {
		System.out.println("It is Even num");
		
	} else {
		System.out.println("It is Odd num");
		
	}
}
}
