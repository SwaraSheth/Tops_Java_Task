package com.basics;


/*
 * Task: Ramesh’s basic salary is input through the keyboard. His 
dearness allowance is 40% of basic salary, and house rent 
allowance is 20% of basic salary. Write a program to calculate 
his gross salary. 
 */


public class RameshGrossSalary {
public static void main(String[] args) {
	float basic_salary=(float) 500000.50;
	System.out.println("Ramesh's salary structure:");
	System.out.println("Basic Salary is : "+basic_salary);
	
	float DA=(float) (0.4*basic_salary);
	System.out.println("Dearness Allowance is : "+DA);
	
	float HRA=(float) (0.2*basic_salary);
	System.out.println("HRA is : "+HRA);
	
	System.out.println("Total Gross Salary is : "+(float)(basic_salary+DA+HRA));
}
}
;