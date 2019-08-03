package com.techsum.basicprograms;

public class Staticblock1 {
	static {
		
		System.out.println("We are in Static Block");
	}
	
	public Staticblock1() {
		// TODO Auto-generated constructor stub
		System.out.println("We are in Constructor");
	}
	
	Staticblock1(int a){
		System.out.println("We are in Parametrized Constructor");
	}

	public static void main(String[] args) {
		
		Staticblock1 s1 = new Staticblock1();
		Staticblock1 s2 = new Staticblock1();
		Staticblock1 s3 = new Staticblock1();
		// TODO Auto-generated method stub
		new Staticblock1(10);

	}

}
