//Question3
package com.training.cg;

 public class Student{
	String name;
	String id;
	String branch;

	public  Student(String name,String id,String branch) //parametrized Constructor
	{
		this.name= name;
		this.id= id;
		this.branch=branch;
	}
	
	public boolean isEqual(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Student) {
			Student stud = (Student) obj;
			return ( (stud.name.equals(this.name)) && (stud.id.equals(this.id)) && (stud.branch.equals(this.branch)) );
		}
		return false;
	}


	public static void main(String[] args)
	{
		Student S1 = new Student("Ram", "CG101", "IT");
		Student S2 = new Student("lakshman","CG102","IT");
		
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