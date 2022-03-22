package com.training.cg;

public class StringDemo {
	public static void main(String[] args) {
		String str1 = "example";//String literals
		String str2 = "example";
		
		String str3 = new String("example");
		String str4 = new String("example");//StringObjetcs
		//System.out.println(str1.equals(str2)); //equals method compares the contents
		//System.out.println(str1 == str2);//compare whether the references are pointing
		
		System.out.println(str3.equals(str4));
		System.out.println(str3 == str2);
		
	}

}
