package com.basics;


/*
 * In a town, the percentage of men is 52. The percentage of 
total literacy is 48. If total percentage of literate men is 35 of 
the total population, write a program to find the total number 
of illiterate men and women if the population of the town is 
80,000.
 */


public class IlliterateCount {
	public static void main(String[] args) {
		
		float po=80000,m,w,l,lm,lw,ilm,ilw;
		
		System.out.println("The population of the town is "+po);
		
		m=(po*52)/100;
		w=po-m;
		l=(po*48)/100;
		lm=(po*35)/100;
		lw=l-lm;
		ilm=m-lm;
		ilw=w-lw;
		
		System.out.println("The total number of illiterate men is "+(int)ilm);
		System.out.println("The total number of illiterate women is "+(int)ilw);
	
	}
}
