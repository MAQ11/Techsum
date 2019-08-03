package com.techsum.basicprograms;

class ParentInheritanceConstrctr{
	
	public ParentInheritanceConstrctr() {
		
		System.out.println("We are In Parent Constructor");
		
	}
}

public class InheritanceConstrctr extends ParentInheritanceConstrctr {
	
	public InheritanceConstrctr() {
		// TODO Auto-generated constructor stub
		System.out.println("We are in Child Default Constructor");
	}
	
	public InheritanceConstrctr(int var) {
		
		System.out.println("We are in Child Paramitrised Constrcutor");
	}
	
	public static void main(String[] args) {
		
		new InheritanceConstrctr();
		new InheritanceConstrctr(100);
	}

}
