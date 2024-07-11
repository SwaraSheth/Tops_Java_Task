package com.basics;


/*
 * If a five-digit number is input through the keyboard, write a 
program to calculate the sum of its digits.
 */


import java.util.Scanner;

public class Sum {
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int A,B,C,D,E,F;
		
		System.out.println("Enter value of A : ");
		A=sc.nextInt();
		System.out.println("Enter value of B : ");
		B=sc.nextInt();
		System.out.println("Enter value of C : ");
		C=sc.nextInt();
		System.out.println("Enter value of D : ");
		D=sc.nextInt();
		System.out.println("Enter value of E : ");
		E=sc.nextInt();
		
		F=A+B+C+D+E;
		System.out.println("Sum is : "+F);
}
}
