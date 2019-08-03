package com.techsum.basicprograms;

class ParentInheritanceStaticBlock {
	static{
		System.out.println("TestParent:: In m1 method");
	}

}

public class InheritanceStaticBlock extends ParentInheritanceStaticBlock {

	static{
		System.out.println("InheritanceProg:: In m3 method");
	}
	
	public static void main(String[] args) {
		//TestParent p = new TestParent();
		new InheritanceStaticBlock();
		new InheritanceStaticBlock();
		new InheritanceStaticBlock();
		new InheritanceStaticBlock();

	}
}