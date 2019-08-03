package com.techsum.basicprograms;

/**
 * @author MAQ
 * HOW TO ACCESS VARIABLES IN INHERITANCE
 */
class ParentInheritanceSuperThis{
	
	int pist = 10;
	
	int pist2 = 20;
	
}

public class InheritanceSuperThis extends ParentInheritanceSuperThis {
	
	int pist = 100;
	
	int pist2 = 20;
	
	void add(int pist, int pist2) {
		
		System.out.println("The Addition is----->"+(pist+pist2));
		
		System.out.println("Variables of Child Class---->"+(this.pist+this.pist2));
		
		System.out.println("Varibles of Base Class----->"+(super.pist+super.pist2));
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new InheritanceSuperThis().add(1000, 2000);

	}

}
