package com.training.cg;
import java.util.Comparator;
public abstract class Comparator1 implements Comparator<Student> {
	public int compare(Student s1 ,Student s2) {
		if(s1.getGrade()>s2.getGrade()) {
			return 1;
		}
		return -1;
	}

}

//Comparable interface :has a compareTo( method)//
//Comparator

//Create a Student class with fields like studId,studNmae,grade,studAddress
//Create at least 5 students sort them as per their grades and display them.

