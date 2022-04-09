package com.cg.git;

import java.util.Scanner;

public class Pattern {
	
public static void main(String[] args) {
		
		int i , j ,n;
		
		System.out.print("Enter the number of rows you want to print: ");  
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++) 
			{
				
				System.out.print("*");	
			}
			System.out.print("\n");	
		}
		
	}

}
