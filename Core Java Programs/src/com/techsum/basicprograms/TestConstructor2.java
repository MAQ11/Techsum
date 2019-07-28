package com.techsum.basicprograms;

public class TestConstructor2 {
	public TestConstructor2() {
		// TODO Auto-generated constructor stub
		this(10);
		System.out.println("We are in Default Constructor");

	}
	
	TestConstructor2 (int a){
		this(10,20);
		System.out.println("We are in One Paramitrised Constructor");
		System.out.println("Value of A is---->"+a);


		
	}
	
	TestConstructor2 (int b, int c){
		System.out.println("We are in Two Paramitrised Constructor");
		System.out.println("Value of B & C is---->"+b+"\t"+c);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConstructor2 t;
		//t = new TestMethod8(); or
		new TestConstructor2();

	}

}
