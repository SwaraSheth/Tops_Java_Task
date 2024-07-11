package com.basics;

import java.util.Scanner;

/*
 * 2.condition---If the ages of Ram, Shyam and Ajay are input through the 
keyboard, write a program to determine the youngest of the 
three. 
 */
public class YougestPerson {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	int ram_age,ajay_age,shyam_age;
	
	System.out.println("Enter the age of Ram ");
	ram_age=sc.nextInt();
	
	System.out.println("Enter the age of Shyam ");
	shyam_age=sc.nextInt();
	
	System.out.println("Enter the age of Ajay ");
	ajay_age=sc.nextInt();
	
	if (ram_age<=shyam_age&&ram_age<=ajay_age) {
		System.out.println("Ram is Younger");
	} else if (shyam_age<=ram_age&&shyam_age<=ajay_age) {
		System.out.println("Shyam is Younger");
	} else {
		System.out.println("Ajay is Younger");
	}
	}
}
