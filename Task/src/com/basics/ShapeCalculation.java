package com.basics;


/*
 * The length & breadth of a rectangle and radius of a circle are 
input through the keyboard. Write a program to calculate the 
area & perimeter of the rectangle, and the area & 
circumference of the circle
 */


import java.util.Scanner;

public class ShapeCalculation {
public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
int L_Rec,B_Rec,R_Cir;
Float A_Rec,P_Rec,A_Cir,c_Cir;

System.out.println("Enter Leanth of Rectangle : ");
L_Rec=sc.nextInt();
System.out.println("Enter Breadth of Rectangle : ");
B_Rec=sc.nextInt();

A_Rec=(float) (L_Rec*B_Rec);
System.out.println("Area of Rectangle : "+A_Rec);
P_Rec=(float) (2*(L_Rec+B_Rec));
System.out.println("Perimeter of Rectangle : "+P_Rec);

System.out.println("Enter Redius of Circle : ");
R_Cir=sc.nextInt();

A_Cir=(float) (3.14*R_Cir*R_Cir);
System.out.println("Area of Circle : "+A_Cir);
c_Cir=(float) (2*3.14*R_Cir);
System.out.println("circumference of the circle : "+c_Cir);

}
}
