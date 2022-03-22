//Question2
package com.training.cg;
class EmpDetails
{
	double PfPer;
	static double Pfamt;
	static int Salary;
	static int Allowances;
	String name;
	String id;
	
	public EmpDetails()//Default
	{
		name="kiran";
		id="CG101";
	}	
	public EmpDetails(double PfPer,int Sal)
	{
		this.PfPer = PfPer;
		Salary = Sal;
		Pfamt = ((PfPer*Salary)/100);
		System.out.println("PFAMOUNT "+Pfamt);
		
	}
	
	public EmpDetails(int Sal)
	{
		
		 Allowances = ((40*Sal)/100);
		 System.out.println("Allowance Amount"+Allowances);
	}
	
}

public class Employee {
	public static void main(String[] args) {
		EmpDetails emp = new EmpDetails();
		EmpDetails pf = new EmpDetails(12.0,30000);
		EmpDetails Al = new EmpDetails(30000);
		System.out.println(emp.name);
		System.out.println(emp.id);
		System.out.println("PF Percentage "+pf.PfPer);
		System.out.println("ALLOWANCES "+Al.Allowances);
		//System.out.println(Pfamt());
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
