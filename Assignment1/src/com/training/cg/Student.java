//Question3
package com.training.cg;

public class Stud{
	String name;
	String id;
	String branch;

	public  Stud(String name,String id,String branch) 
	{
		this.name= name;
		this.id= id;
		this.branch=branch;
	}
	public boolean isEqual(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Stud) {
			Student s = (s)obj;
			return ( (s.name.equals(this.name)) && (s.id.equals(this.id)) && (s.branch.equals(this.branch)));
		}
		return false;
	}
	
}
public class Student {
	public static void main(String[] args)
	{
		Stud S1 = new Stud("Ram", "CG101", "IT");
		Stud S2 = new Stud("lakshman","CG102","IT");
		
		System.out.println(S1.isEqual(S2));
	}

}

/**
 * Q.3 Create a class Student with following operations 1) create parameterized
 * constructor to initialize the objects 2) create a function isEqual() to check
 * whether the two objects are equal or not which returns the boolean value and
 * gets two objects 3) print the result in main method if objects are equals or
 * not (take variables as your assumption)
 **/