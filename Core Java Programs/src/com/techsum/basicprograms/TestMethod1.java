package com.techsum.basicprograms;

public class TestMethod1 {
	void m1() {
		int a = 10, b = 20;
		int c = a + b;
		System.out.println("Addition is---->" + c);
	}

	static void m2() {
		System.out.println("We are in Static Method");
	}
	
	void m3(int a) {
		System.out.println("This is in M3 Method");
	}
	
	static void m4(String str) {
		System.out.println("The Entered String is---->"+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod1 t = new TestMethod1();
		new TestMethod1().m1(); // Another Way To Call Function...
		TestMethod1.m2();
		
		t.m3(10);
		TestMethod1.m4("Techsum");

	}

}
