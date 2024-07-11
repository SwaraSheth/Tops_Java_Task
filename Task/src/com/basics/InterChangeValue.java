package com.basics;


/*
 * Two numbers are input through the keyboard into two 
locations C and D. Write a program to interchange the 
contents of C and D
 */


import java.util.Scanner;

public class InterChangeValue {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int C,D,Temp;
		
		System.out.println("Enter the value of C : ");
		C=sc.nextInt();
		System.out.println("Enter the value of D : ");
		D=sc.nextInt();
		
		Temp=C;
		C=D;
		D=Temp;
		
		System.out.println("Value of C :"+C);
		System.out.println("Value of D :"+D);
		
}
}
