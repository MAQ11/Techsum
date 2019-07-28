package com.techsum.basicprograms;

public class TestConstructor1 {

	
	  public TestConstructor1() { // TODO Auto-generated constructor stub
	  System.out.println("We are in a Default Constructor"); }
	 
	TestConstructor1(int a, int b) {

		System.out.println("We are in Parametrised Constructor");
		System.out.println("The Value of A---->" + a);
		System.out.println("The Value of B----->" + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor1 t = new TestConstructor1();
		TestConstructor1 t1 = new TestConstructor1(11, 12);

	}

}
