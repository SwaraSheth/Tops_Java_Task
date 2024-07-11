package com.basics;
/*
 * Write a program to Check whether the number is even or odd using switch statement
 */

import java.util.Scanner;

public class OddEvenS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int i;
		System.out.println("Enter integer num");
		i=sc.nextInt();
		
		
		
		switch (i%2) {
		case 0: {
			System.out.println("Even Number");
		}
		break;
		default:
			System.out.println("Odd Number");
		}
	}
}
