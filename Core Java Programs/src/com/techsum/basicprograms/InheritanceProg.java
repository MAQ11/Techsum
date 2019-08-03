package com.techsum.basicprograms;

class TestParent {
	void m1() {
		System.out.println("TestParent:: In m1 method");
	}
	
	void m2() {
		System.out.println("TestParent:: In m2 method");
	}
}

public class InheritanceProg extends TestParent {
	
	void m3() {
		System.out.println("InheritanceProg:: In m3 method");
	}
	
	void m4() {
		System.out.println("InheritanceProg:: In m4 method");
	}
	
	public static void main(String[] args) {
		TestParent p = new TestParent();
		p.m1();
		p.m2();
		
		new TestParent().m1();
		new TestParent().m2();
		
		InheritanceProg t = new InheritanceProg();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
		
		
	}
}