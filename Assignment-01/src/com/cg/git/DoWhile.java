package com.cg.git;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		int sum = 0;
	    int number = 0;

	   
	    Scanner input = new Scanner(System.in);
		   
	    do {
	      // add only positive numbers
	      sum += number;
	      System.out.println("Enter a number");
	      number = input.nextInt();
	    } while(number >= 0); 
		   
	    System.out.println("Sum = " + sum);
	    input.close();

	}

}
