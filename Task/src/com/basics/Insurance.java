package com.basics;

import java.util.Scanner;

/*
 * 2.condition---An Insurance company follows following rules to calculate 
premium. 
(1) If a person’s health is excellent and the person is between 
25 and 35 years of age and lives in a city and is a male 
then the premium is Rs. 4 per thousand and his policy 
amount cannot exceed Rs. 2 lakhs. 
(2) If a person satisfies all the above conditions except that 
the sex is female then the premium is Rs. 3 per thousand 
and her policy amount cannot exceed Rs. 1 lakh. 
(3) If a person’s health is poor and the person is between 25 
and 35 years of age and lives in a village and is a male
then the premium is Rs. 6 per thousand and his policy 
cannot exceed Rs. 10,000. 
(4) In all other cases the person is not insured. 
Write a program to output whether the person should be 
insured or not, his/her premium rate and maximum amount 
for which he/she can be insured. 
 */

public class Insurance {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	int age;
	String health,location,gender;

	System.out.println("Enter Age");
	age=sc.nextInt();
	
	System.out.println("Enter loacation c for city & v for village ");
	location=sc.next();
	
	System.out.println("Enter Health condition e for excellent & p for poor ");
	health=sc.next();
	
	System.out.println("Enter gender m for male & f for female ");
	gender=sc.next();
	
	if ((health=="e" ) && (age>= 25 && age <= 35) && (location=="c") && (gender=="m")  ){
		System.out.println("The premium is Rs. 4 per thousand and his policy amount cannot exceed Rs. 2 lakhs.");
	}
	
	else if ((health=="e" ) && (age>= 25 && age <= 35) && (location=="c") && (gender=="f")){
		System.out.println("The premium is Rs. 3 per thousand and her policy amount cannot exceed Rs. 1 lakh");
	}
	
	else if ((health=="p" ) && (age>= 25 && age <= 35) && (location=="v") && (gender=="m")){
		System.out.println("The premium is Rs. 6 per thousand and his policy amount cannot exceed Rs. 10000.");
	}
	
	else {
		System.out.println("The person is not insured.");
	}
}
}
