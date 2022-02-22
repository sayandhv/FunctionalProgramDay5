package com.bridgelabz;

import java.io.PrintWriter;
import java.util.Scanner;

public class TwoDimensionalArrayPgm {
	public static void print(int[][] matrix , int row , int column) {
		PrintWriter writer = new PrintWriter(System.out);    
	            
		writer.print("Matrix of size "+row+"X"+column);
		for(int i=0; i<row; i++) {
			writer.write("\n");
			for(int j=0; j<column; j++) {				
				writer.print(matrix[i][j]);
				writer.print("  ");
			}
		}
		writer.flush();  
	    writer.close(); 
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Rows : ");
		int row = sc.nextInt();
		System.out.print("\nEnter the number of Columns : ");
		int column = sc.nextInt();
		int[][] matrix = new int[row][column];
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print("Enter the number  : ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		print(matrix , row , column);
		sc.close();
	}


}


