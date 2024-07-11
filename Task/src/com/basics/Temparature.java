package com.basics;


/*
 * Temperature of a city in Fahrenheit degrees is input through 
the keyboard. Write a program to convert this temperature 
into Centigrade degrees.
 */


import java.util.Scanner;

public class Temparature {


public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 Float f,c;
		 
		System.out.println("Enter the Temperature of a city in Fahrenheit degrees : ");
		f=sc.nextFloat();
		
		c=(f - 32) * 5/9;
		System.out.println("The Temperature of a city in Centigrade degrees : "+c);
		 
		
}
}
