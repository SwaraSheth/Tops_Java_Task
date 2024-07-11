package com.basics;


/*
 * The distance between two cities (in km.) is input through the 
keyboard. Write a program to convert and print this distance 
in meters, feet, inches and centimeters.
 */


public class DistanceBtwCity {
	public static void main(String[] args) {
		Float km,m,ft,i;
		double cm;
		km=(float) 130.0;
		
		System.out.println("Distance between surat to baroda in Kilo Meter : "+km);
		
		m=km*1000;
		cm=m*100;
		i = (float) (cm/2.54f);
		ft = i/12;
		
		System.out.println("Distance between surat to baroda in Meters : "+m);
		System.out.println("Distance between surat to baroda in Centimeters : "+cm);
		System.out.println("Distance between surat to baroda in Inches : "+i);
		System.out.println("Distance between surat to baroda in Feet : "+ft);
		
		
		
	}
	
	

}
