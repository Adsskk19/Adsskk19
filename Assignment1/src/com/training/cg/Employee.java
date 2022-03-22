//Question2
package com.training.cg;
class EmpDetails
{
	double PfPer,Pfamt;
	int Salary;
	String name;
	String id;
	
	public EmpDetails()
	{
		name="kiran";
		id="CG101";
	}	
	public EmpDetails(double PfPer,int Salary)
	{
		this.PfPer = PfPer;
		this.Salary = Salary;
	}
	static void Pfamt() 
	{
		pfamt = ((PfPer*Salary)/100);
		System.out.println(pfamt);
	}
	
	
}

public class Employee {
	public static void main(String[] args) {
		EmpDetails emp = new EmpDetails();
		
		System.out.println(emp.name);
		System.out.println(emp.id);
		System.out.println(emp.Pfamt);
	}

}
/**
 * Q.2 Write a program in java with class Employee and do the following
 * operations on it
 *  1) Create two constructor default and with Object as
 * parameter to initialize class variables. 
 * 2) Create a function calculate which
 * calculates the pf and allowances on the salary of employee and return the all
 * values as an object
 *  3) Print all the employee object associated values
 * returned from calculate functions
 */
