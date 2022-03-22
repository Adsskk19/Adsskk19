//Java 8 changes 
//1.Lambda Expression
package co.kiran;
import java.lang.reflect.Array;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
public class LambdaDemo {
public static void main(String[] args) {
	//Addition  add= new Addition();
	//add.getSum(45, 89);
	
//	DemoInterface d = (a) ->{ //Return type of a lambda expresion
//		double sum=0;
//		for (int i = 0; i < a.length; i++) {
		
			
//			 sum =sum+a[i];	
			 
				
				
//		}
//		System.out.println(sum);
//		System.out.println("average is : " +  ( sum/Array.getLength(a)));	
		
	//};
//	double[]num= {45,56,78,98};
	//d.show(10,20,30);
//	d.show(num);
	
//}
//}

//Predicate<Integer> p = (b)->{
//	if(b>5) {
//		return true;
//	}
//	else {
//		return false;
//	}
//};

// boolean pass = p.test(9);
 //System.out.println(pass);
	
//Function , Consumer, Supplier
//Lambda interface
//Functional interfaces
//Streams	

Consumer<Integer> consumer = (value) -> System.out.println(value);

Supplier<Integer> supplier = ()-> new Integer((int) (Math.random()*1000D));

}
}




	
	
	
	
	
	
	
//class Addition{
//	public void getSum(int a,int b) {
		
	//}
//}

// Write a lambda expression to calculate average  of 3 numbers
//pass an array of int and calculate the average value of elements

