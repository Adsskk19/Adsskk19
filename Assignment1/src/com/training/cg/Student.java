//Question3
package com.training.cg;

class Stud{
	String name;
	String id;
	String branch;
	public void StudDetails() {
		name = "Stud1";
		id = "Ce12";
		branch = "IT";
	}
}
public class Student {
	public static void main(String[] args)
	{
		Stud S = new Stud();
		System.out.println(S);
	}

}
/**
 * Q.3 Create a class Student with following operations 1) create parameterized
 * constructor to initialize the objects 2) create a function isEqual() to check
 * whether the two objects are equal or not which returns the boolean value and
 * gets two objects 3) print the result in main method if objects are equals or
 * not (take variables as your assumption)
 **/