package co.kiran;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterOdd {
public static void main(String[] args) {
	List<Integer> integer = Arrays.asList(1,2,3,4,5,6,7,8);
	//Stream<Integer> a = a.stream();
	Stream<Integer> a1 = str.stream();
	//Stream.filter(num -> (num%2!=0)).forEach(n->System.out.println(n));

	a1.map(i-> i*i).forEach(data->System.out.println(data));
	System.out.println("----------");
	for (int l:integer) {
		System.out.println(l);
	}
}
}
