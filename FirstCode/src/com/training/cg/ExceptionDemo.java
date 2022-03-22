package com.training.cg;

public class ExceptionDemo {
	public static void main(String[] args) {
//		int[] numbers = new int[4];
//		for (int i = 0; i < numbers.length; i++) {
//			System.out.println(numbers[i]);
//		}
		try {
			int a = 8/7;
		}
		catch(Exception e) {
			System.out.println("Exception occured...");
		}
		System.out.println("Display array values::End");
	}

}
//when someone tries to put a grade value than [A,B,C,D] , [1,2,3,4]
//then throw a custom exception which will display a msg "Grade value not allowed "


//ArrayList,LinkedList,Map
//Comparable and Comparator
//Exception Handling : Checked and unchecked exceptions in java
//try catch finally block
//throw,throws keyword
//Generics
//Wrapper classes and autoboxing