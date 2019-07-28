package com.techsum.basicprograms;
// Object as a Returntype............
class Employee {}
class Student {}

public class TestMethod2 {
	Employee1 m1() {
		System.out.println("We are in M1 Class");
		Employee1 e1 = new Employee1();
		return e1;
	}
	
	Student1 m2() {
		System.out.println("We are in M2 Class");
		Student1 s1 = new Student1();
		return s1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod2 t1 = new TestMethod2();
		Employee1 e = t1.m1();
		Student1 s1 = t1.m2();
		System.out.println("Employee Value is----->"+e);
		System.out.println("Student Value is----->"+s1);
		

	}

}
