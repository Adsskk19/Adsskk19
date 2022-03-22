package com.training.cg;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Studentsort {
public static void main(String[] args) {
	Student stud1 = new Student("Teja "," A1","Rcpm");
	Student stud2 = new Student("Balu","A2","Rjy");
	Student stud3 =new Student("Sundar","A3","Kkd");
	Student stud4 = new Student("Yunus","A4","Kkd");
	Student stud5 = new Student("Kiran","A5","Drm");
	
	stud1.setGrade(70);
	stud2.setGrade(60);
	stud3.setGrade(64);
	stud4.setGrade(59);
	stud5.setGrade(80);
	
	List<Student> allStudents = new LinkedList<Student>(); 
	allStudents.add(stud1);
	allStudents.add(stud2);
	allStudents.add(stud3);
	allStudents.add(stud4);
	allStudents.add(stud5);
	
	Collections.sort(allStudents,S);
	for(Student s :allStudents) {
		System.out.println("Student Name:"+s.studName);
		System.out.println("Student Id:"+s.studId);
		System.out.println("Student Address :"+s.studAddress);
		System.out.println("Grade : "+s.getGrade());
		
	}
}
}
