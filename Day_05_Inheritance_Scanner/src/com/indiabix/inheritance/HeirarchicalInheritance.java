package com.indiabix.inheritance;

class A
{
	void print()
	{
		System.out.println("i am class A");
	}
}
class B extends A
{
	void show()
	{
		System.out.println("i am class B");
	}
}


public class HeirarchicalInheritance extends A{
	  
	void display()
	{
		System.out.println("i am class HeirarchicalInheritance");
	}

	public static void main(String[] args) {
		 
		HeirarchicalInheritance obj1 = new HeirarchicalInheritance();
		B obj2 = new B();
		obj1.print();
		obj2.show();
		obj1.display();
		

	}

}
