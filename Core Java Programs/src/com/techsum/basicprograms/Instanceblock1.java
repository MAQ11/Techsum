package com.techsum.basicprograms;

public class Instanceblock1 {
	// Instance Blocks
	{
		System.out.println("------This is Instance Blocks-------");
	}
	
	public Instanceblock1() {
		// TODO Auto-generated constructor stub
		System.out.println("-----We are in Constracutor--------");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Instanceblock1();
		new Instanceblock1();
		new Instanceblock1();
		
		

	}

}
