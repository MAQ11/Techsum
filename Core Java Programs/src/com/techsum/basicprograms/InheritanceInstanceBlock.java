package com.techsum.basicprograms;

class ParentInheritanceInstanceBlock {
	{
		System.out.println("TestParent:: In m1 method");
	}

}

public class InheritanceInstanceBlock extends ParentInheritanceInstanceBlock {

	{
		System.out.println("InheritanceProg:: In m3 method");
	}
	
	public static void main(String[] args) {
		//TestParent p = new TestParent();
		new InheritanceInstanceBlock();
		new InheritanceInstanceBlock();

	}
}