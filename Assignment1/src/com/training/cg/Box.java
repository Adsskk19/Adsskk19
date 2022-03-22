//Question1:
package com.training.cg;

class Volume
{
	int length,breadth,height,volume ;
	public Volume() //Default
	{
		length = 5;
		breadth=6;
		height =8;
		volume = length*breadth*height;
	}
	public Volume(int n )
	{
		length = n;
		breadth=n;
		height =n;
		volume = length*breadth*height;
	}
	
	public Volume(int length ,int breadth,int height ) {
		this.length = length;
		this.breadth=breadth;
		this.height =height;
		volume = length*breadth*height;
	}
	public Volume(double length ,double breadth,double height ) {
		this.length = (int)length;
		this.breadth=(int)breadth;
		this.height =(int)height;
		volume = (int)length*(int)breadth*(int)height;
	}
	
}


public class Box {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Volume vol = new Volume();
		System.out.println(vol.volume);

	}

}
/**
 * Q.1 WAP in java to create Box class with parameterized constructor with an
 * object argument to initialize length, breadth and height also create a
 * function volume which returns the volume of the box and print it in main
 * method.
 * 
 * 
 * 
 * 
 */
