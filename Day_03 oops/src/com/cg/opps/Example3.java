package com.cg.opps;

public class Example3 {
	
	String colour;
	Example3(String colour_u_like)
	{
		colour= colour_u_like;
	}
	void print()
	{
		System.out.println("You Like " + colour + " colour" );
	}
	public static void main(String[] args) 
	{
		Example3 a1=new Example3("Red");
		Example3 a2=new Example3("Pink");
		Example3 a3=new Example3("Blue");
		a1.print();
		a2.print();
		a3.print();
	}

}
