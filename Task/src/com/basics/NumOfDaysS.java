package com.basics;
/*
 * Write a program to Find the number of days in a month using a switch statement
 */

import java.util.Scanner;

public class NumOfDaysS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int m;
		System.out.println("Enter Month(1-12)");
		m=sc.nextInt();
		
		switch (m) {
		case 1:
			System.out.println("31 Days");
		break;

		case 2:
			System.out.println("28/29 Days");
		break;
		
		case 3:
			System.out.println("31 Days");
		break;
		
		case 4:
			System.out.println("30 Days");
		break;

		case 5:
			System.out.println("31 Days");
		break;
		
		case 6:
			System.out.println("30 Days");
		break;
		
		case 7:
			System.out.println("31 Days");
		break;

		case 8:
			System.out.println("31 Days");
		break;
		
		case 9:
			System.out.println("30 Days");
		break;
		
		case 10:
			System.out.println("31 Days");
		break;

		case 11:
			System.out.println("30 Days");
		break;
		
		case 12:
			System.out.println("31 Days");
		break;
		default:
		break;
		}
	}
	
}
