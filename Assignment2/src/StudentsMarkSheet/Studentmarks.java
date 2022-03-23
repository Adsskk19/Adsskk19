package StudentsMarkSheet;

import java.util.Scanner;

public class Studentmarks {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your rollno: ");
		int rollno = sc.nextInt();
		System.out.println("Enter your Name: ");
		String name =sc.next();
		
		System.out.println("Enter marks of Sub1: ");
		int Sub1 = sc.nextInt();
		if(Sub1>100)
		{
			System.out.println("Range Exception please Enter again: ");
		}
		System.out.println("Enter marks of Sub2: ");
		int Sub2 = sc.nextInt();
		if(Sub2>100)
		{
			System.out.println("Range Exception please Enter again: ");
		}
		System.out.println("Enter marks of Sub3: ");
		int Sub3 = sc.nextInt();
		if(Sub3>100)
		{
			System.out.println("Range Exception please Enter again: ");
		}
		System.out.println("Enter marks of Sub4: ");
		int Sub4 = sc.nextInt();
		if(Sub4>100)
		{
			System.out.println("Range Exception please Enter again: ");
			
		}
		System.out.println("Enter marks of Sub5: ");
		int Sub5 = sc.nextInt();
		if(Sub5>100)
		{
			System.out.println("Range Exception please Enter again: ");
		}
		System.out.println("Enter marks of Sub6: ");
		int Sub6 = sc.nextInt();
		if(Sub6>100)
		{
			System.out.println("Range Exception please Enter again: ");
		}
		
		
		int totalscore = Sub1+Sub2+Sub3+Sub4+Sub5+Sub6;
		System.out.println("TotalScore: "+totalscore+" ");
		double percentage  =((totalscore*100)/600);
		System.out.println("percentage: "+percentage+" ");

		
			
	}

	
}
