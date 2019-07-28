package com.techsum.basicprograms;

public class TestMethod5 {
	int a=10,b=20;
	
	void m1(int a, int b) {
		System.out.println("The Addition is---->"+(a+b));
		System.out.println("Used of This Keyword To Acess Instance Variables--->"+(this.a+this.b));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod5 t = new TestMethod5();
		t.m1(100, 200);

	}

}
