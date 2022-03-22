package com.training.cg.dp;

public class Captain {
	private static Captain obj;
	private Captain() { //we cannot do ->singleton obj = new Singleton()
		
	}
     public static Captain getCaptain() {
    	 if(obj==null) {
    		 return new Captain();
    	 }
    	 return obj;
     }
     public void play() {
    	 System.out.println("Captain can play at any number depending on Match Situation");
     }
}
