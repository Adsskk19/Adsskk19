package com.training.cg;

public class EmployeeTest {
	//static {
		//System.out.println("We are inside the static block..");
	//}
       public static void main(String[] args) {
		Employee emp1 = new Employee(); //Constructer call
		emp1.setEmpId("101_IN");
		emp1.setEmpSalary(45000);
		//System.out.println(emp1.getEmpId());
		System.out.println(emp1.getEmpSalary());
	}
}
// How to create java bean class?
//Why attribute or variable shosuld be declared as private?
//How to create an object of a class and access its data through the methods?
//Use of this keyword
//static members
//Why main method is static?

//CONVENTIONS:
//1.Class name should always be capitalized
//2.The variable name/method name should be camel-cased(employeeAge)
//3.Final variable name should be in all caps(WEEKDAY)

//String literals and String Objects

////////HANDS ON////////////
//Create a product java bean with fields like proID, prodName,prodDes and price
//Create getters and setters for these fields
//create at least 5 products
//Display details of most costly product.
//make sure you follow all java naming conventions 

//Abstract  Class:- If a method is having only declaration and no definition then that
//


