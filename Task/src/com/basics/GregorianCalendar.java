package com.basics;
/*
 * 2.Condition ---According to the Gregorian calendar, it was Monday on the 
date 01/01/1900. If any year is input through the keyboard 
write a program to find out what is the day on 1st January of 
this year.
 */

import java.util.Scanner;

public class GregorianCalendar {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int year;
		System.out.println("Enter Year");
		year=sc.nextInt();
		
		int givenyear=1900;
		
		int diff=year-givenyear;
		
		int leapyear= diff/4;
		
		int nonleapyear=diff-leapyear;
		
		int days=(leapyear*366)+(nonleapyear*365)+1;
		
		if(days%7==0) {
			System.out.println("Sunday");
		}
		
		if(days%7==1) {
			System.out.println("Monday");
		}
		
		if(days%7==2) {
			System.out.println("Tuesday");
		}
		
		if(days%7==3) {
			System.out.println("Wednasday");
		}
		
		if(days%7==4) {
			System.out.println("Thursday");
		}
		
		if(days%7==5) {
			System.out.println("Friday");
		}
		
		if(days%7==6) {
			System.out.println("Saterday");
		}
	}
}
