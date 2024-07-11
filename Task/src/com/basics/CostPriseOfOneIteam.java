package com.basics;

import java.util.Scanner;

/*
 * If the total selling price of 15 items and the total profit earned 
on them is input through the keyboard, write a program to 
find the cost price of one item.
 */


public class CostPriseOfOneIteam {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Float tsp,tp,coi;
		
		System.out.println("Enter total selling price of 15 item ");
		tsp=sc.nextFloat();
		System.out.println("Enter total profit earned on 15 item ");
		tp=sc.nextFloat();
		
		coi=(tsp-tp)/15;
		System.out.println("The cost prise of one item is "+ coi);
		
	}

}
