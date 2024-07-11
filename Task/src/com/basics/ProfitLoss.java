package com.basics;

import java.util.Scanner;

/*
 * 2.Condition- If cost price and selling price of an item is input through the 
keyboard, write a program to determine whether the seller has 
made profit or incurred loss. Also determine how much profit 
he made or loss he incurred. 
 */

public class ProfitLoss {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double cp,sp,p,l;
		
		System.out.println("Enter cost price");
		cp=sc.nextDouble();
		
		System.out.println("Enter selling price");
		sp=sc.nextDouble();
		
		if (sp>cp) {
			System.out.println("It is Profit & Profit is Rs. "+(sp-cp));
		} else {
			System.out.println("It is loss & losst is Rs. "+(cp-sp));
		}
		
	}
}
