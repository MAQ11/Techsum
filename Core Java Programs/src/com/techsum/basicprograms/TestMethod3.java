package com.techsum.basicprograms;

public class TestMethod3 {
	int m1() {
		return 10;
	}
	
	String m2() {
		return "Techsum";
	}
	
	float m3() {
		return 3.5f;
	} 
	
	static char m4() {
		return 'A';
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod3 t = new TestMethod3();
		int m1 = t.m1();
		String m2 = t.m2();
		float m3 = t.m3();
		char m4 = TestMethod3.m4();
		System.out.println(m1);
		System.out.println(m2);
		System.out.println(m3);
		System.out.println(m4);
		
	}

}
