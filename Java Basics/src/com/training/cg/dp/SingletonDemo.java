package com.training.cg.dp;

public class SingletonDemo {
	public static void main(String[] args) {
		//Captain cap = new Captain();
		Captain cap = Captain.getCaptain();
		cap.play();
	}

}
