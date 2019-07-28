package com.techsum.basicprograms;

public class TestMethod6 {
	int a=10;
	int m1(int a) {
		return a;		
	}
	
	int m2() {
		return a;
	}
	
	int m3() {
		System.out.println("Value of A Using This----->"+this.a);
		return this.a;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod6 t = new TestMethod6();
		int a = t.m1(100);
		System.out.println("Value of A in M1---->"+a);
		System.out.println("Value of A in M2----->"+t.m2());
		System.out.println("Value of A in M2----->"+t.m3());

	}

}
