package com.basics;
/*
 * 2.condition---Given the length and breadth of a rectangle, write a program to 
find whether the area of the rectangle is greater than its 
perimeter. For example, the area of the rectangle with length = 5 
and breadth = 4 is greater than its perimeter. 
 */


public class Rectangle {
	public static void main(String[] args) {
		
		int L_Rec=5,B_Rec=4;
		float A_Rec,P_Rec;

		A_Rec=(float) (L_Rec*B_Rec);
		System.out.println("Area of Rectangle : "+A_Rec);
		P_Rec=(float) (2*(L_Rec+B_Rec));
		System.out.println("Perimeter of Rectangle : "+P_Rec);
		
		if (A_Rec>P_Rec) {
			System.out.println("the area of the rectangle is greater than its perimeter");
		} else {
			System.out.println("the area of the rectangle is less than its perimeter");
		}
	}
}
