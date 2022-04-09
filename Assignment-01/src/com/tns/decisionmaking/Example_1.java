package com.tns.decisionmaking;
import java.util.Scanner;

public class Example_1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			
			System.out.println("Enter Two No. to find out which one is greater");
			
			if(a>b)
			{
				System.out.println(a+" is greater.");
			}
			else
			{
				System.out.println(b+" is greater.");
			}
			sc.close();
		}

	}

}
