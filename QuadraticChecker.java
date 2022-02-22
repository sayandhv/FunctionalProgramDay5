package com.bridgelabz;

import java.util.Scanner;

public class QuadraticChecker {
	
	public static void findquadratic(double a,double b,double c)
	{
		double root1 = 0 , root2 = 0;
		double delta =((b * b) - (4 * a * c));
		if(delta > 0) {
			root1 = (-(double)b + Math.sqrt(delta)) / (2 * a) ;
			root2 = (-(double)b - Math.sqrt(delta)) / (2 * a) ;
			System.out.printf("Roots of Equation x1 : %.2f x2 : %.2f", root1, root2);
		}
		else if(delta == 0){
			root1 = (-(double)b - Math.sqrt(delta)) / (2 * a) ;
			System.out.printf("Roots of Equation x1 : %.2f", root1);
		}
		else {
			System.out.print("Roots of Equation is imaginary");
		}
	}
	
	public static void main(String[] args) 
	{
	    System.out.println("Enter the value for a");
	    Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		System.out.println("Enter the value for b");
	    double b=sc.nextDouble();
		System.out.println("Enter the value for c");
		double c=sc.nextDouble();
		findquadratic(a,b,c);	
	
	}

}

