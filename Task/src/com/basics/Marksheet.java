package com.basics;


/*
 * If the marks obtained by a student in five different subjects 
are input through the keyboard, find out the aggregate marks 
and percentage marks obtained by the student. Assume that 
the maximum marks that can be obtained by a student in each 
subject is 100.
 */


import java.util.Scanner;

public class Marksheet {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int M,Sc,E,H,ss;
		Float am,pr;
		
		System.out.println("Enter the marks obtain in English : ");
		E=sc.nextInt();
		System.out.println("Enter the marks obtain in Maths : ");
		M=sc.nextInt();
		System.out.println("Enter the marks obtain in Science : ");
		Sc=sc.nextInt();
		System.out.println("Enter the marks obtain in Hindi : ");
		H=sc.nextInt();
		System.out.println("Enter the marks obtain in Scoial Science : ");
		ss=sc.nextInt();
		
		am=(float) (M+Sc+E+H+ss);
		System.out.println("Aggrigated Marks is : "+am);
		
		pr=(float) (am/5);
		System.out.println("Percentage is : "+pr);
		
		
		
	}
}
