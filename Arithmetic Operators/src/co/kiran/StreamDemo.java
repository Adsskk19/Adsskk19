package co.kiran;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
public static void main(String[] args) {
	List<String> strings = Arrays.asList("ram ","","","Mohan","Kiran","Kumar");
	Stream<String> stream = strings.stream();
	//long counter = 
			stream.filter(str -> !str.equals(""))
			.forEach(name->System.out.println(name));
	//System.out.println("Total Empty Strings are: "+counter);
	
}
}


//Intermediate operation
//Terminal operation
//take a list of integers and filter out all the odd number
