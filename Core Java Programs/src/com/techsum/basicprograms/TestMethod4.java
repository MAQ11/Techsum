package com.techsum.basicprograms;

class Employee1 {}
class Student1 {}

public class TestMethod4 {
	
	void m1(Employee e) {
		System.out.println("I am in M1");
	}
	
	void m2(Student s) {
		System.out.println("I am in M2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMethod4 t = new TestMethod4();
		Employee e1 = new Employee();
		Student s1 = new Student();
		t.m1(e1);
		t.m2(s1);

	}

}
