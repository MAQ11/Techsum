package com.techsum.basicprograms;

/**
 * @author MAQ How To Access Methods in Inheritance
 * 
 */

class ParentInheritanceMethodAccess {

	void m1() {

		System.out.println("We are in Parent Method M1");
	}
}

public class InheritanceMethodAccess extends ParentInheritanceMethodAccess {

	void m1() {

		System.out.println("we are in Child Method M1");
	}

	void m2() {

		System.out.println("This is in Chid M2");
		super.m1();
		this.m1();
	}

	public static void main(String[] args) {
		new InheritanceMethodAccess().m2();
	}

}
