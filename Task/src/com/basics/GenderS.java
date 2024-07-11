package com.basics;
/*
 * Write a program to read gender(M/F) and print the corresponding gender using a switch statement
 */

import java.util.Scanner;

public class GenderS {
public static void main(String[] args) {
		
		String gender;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter gender (M/F)");
		gender=scanner.next();
		
		switch(gender)
	    {
	        case "M": 
	        	System.out.println("Male");
	            break;
	        case "F": 
	        	System.out.println("Female");
	            break;
	        default:
	        	System.out.println("Invalid Gender");
	    }
	    
}
}
