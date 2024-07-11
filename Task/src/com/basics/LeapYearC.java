package com.basics;

import java.util.Scanner;

/*
 * Write a program using conditional operators to determine 
whether a year entered through the keyboard is a leap year or 
not.
 */

public class LeapYearC {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year;
		System.out.println("Enter Year");
		year=sc.nextInt();
		
		if (year%400==0 && year%100==0 || year%100!=0 && year%4==0) {
					System.out.println("It is Leap Year");
				} 
				else {
			    	 System.out.println("It is not Leap Year");
					}
			}
			}

