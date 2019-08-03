package com.techsum.basicprograms;

public class Instanceblock2 {
	int i;
	
	{
		i = 10;
		System.out.println("----This is Instance Blocks-----");
	}
	
	{
		
		System.out.println("This is Second Instance Block");
	}
	
	public Instanceblock2() {
		// TODO Auto-generated constructor stub
		this(10);
		System.out.println("We are In Default Constructor");
		
	}
	
	Instanceblock2 (int a) {
		
		System.out.println("We are in Parametrized Constructor and Value of a is----"+a);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Instanceblock2();
		new Instanceblock2(20);
		

	}

}
