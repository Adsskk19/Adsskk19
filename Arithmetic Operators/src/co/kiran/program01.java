package co.kiran;

public class program01 {
	public static void main(String[] args) {
		//int sum = Integer.parseInt(args[0])+Integer.parseInt(args[1]); 
		int num =10;
		System.out.println("Num value is " +num++);//Post increment;n=n+1
		int a = ++num;//Pre increment: First increase the value and then display
		System.out.println("new value of num is"+a);
	}

}
