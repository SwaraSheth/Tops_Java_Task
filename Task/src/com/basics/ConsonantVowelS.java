package com.basics;
/*
 * Write a program to Check whether a character is a vowel or consonant using switch statement
 */

import java.util.Scanner;

public class ConsonantVowelS {
public static void main(String[] args) {
		
		char ch;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Character");
		ch=scanner.next().charAt(0);
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(""+ch+" is vowel");	
		break;
			
		default:
			System.out.println(""+ch+" is consonant");
			break;
			55yy6
		}
	    
}
}
