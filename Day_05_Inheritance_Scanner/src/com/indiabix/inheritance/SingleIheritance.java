package com.indiabix.inheritance;

class Animal
{
	void dog()
	{
	 System.out.println("Barks...");	
	}
}
/*class Animal_2 extends Animal
{
	void cat()
	{
		System.out.println("meow...");
	}
}*/
public class SingleIheritance extends Animal{
	void cat()
	{
		System.out.println("meow...");
	}
	public static void main(String[] args) {
		
		SingleIheritance obj1 = new SingleIheritance();
		obj1.dog();
		obj1.cat();
	}

}
