package com.training.cg.dp;

public class NonVegRestaurant  implements Hotel{
	public  Menu getMenus() {
		NonVegMenu nv = new NonVegMenu();
		return nv;
	}

}
