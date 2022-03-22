package com.training.cg;

 public class Student{
	 
    String studName;
	String studId;
	static int grade;
	String studAddress;
	Student(String studName,String studId,String studAdress){
		this.studName =studName;
		this.studId=studId;
		this.studAddress = studAddress;
	}
	public void setGrade(int grade) {
		this.grade =grade;
	}
	public int getGrade() {
		return this.grade;
	}

	

}
