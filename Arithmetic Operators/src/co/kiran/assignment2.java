package co.kiran;

import java.util.Scanner;

public class assignment2 {

	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int count =1;
		int num =6;
		while(count<5) {
			System.out.println("Guess your lucky Number..PLease Enter! ");
			int n = sc.nextInt();
			if(n>num) {
				System.out.println("Not Really! try again");
			}else if(n<num){
				System.out.println("Not Really! try again");
			}else {
				System.out.println("Congrats!! you guessed it Right");
				count++;
			if(count==4) {
				break;
			}
			}
		}
		
		
		
}
}