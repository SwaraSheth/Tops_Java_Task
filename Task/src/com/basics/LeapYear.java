package com.basics;

import java.util.Scanner;

/*
 * 2-Condition Any year is input through the keyboard. Write a program to 
determine whether the year is a leap year or not. 
(Hint: Use the % (modulus) operator
*logic : if nub is dived by 4 but not by 100 than leap year
*If divided by 400 & 100 than check for 400 than it is leap year

 */

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year;
		System.out.println("Enter Year");
		year=sc.nextInt();
		
		if (year%4==0) {
			if (year%100==0) {
				if (year%400==0) {
					System.out.println("It is Leap Year");
				} else {
					System.out.println("It is not Leap Year");
				}
			}
			else {
					System.out.println("It is Leap Year");
				}
			}
			
	     else {
	    	 System.out.println("It is not Leap Year");
			}
	}
}
