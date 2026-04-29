package com.visal.learning.functional;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {
	public static void main(String[] args) {
		Consumer<String> print = text -> System.out.println(text);
//		print.accept("Print using consumer");
		
		List<Integer> list = List.of(20, 23 , 25 , 32 , 11 );
		

		Consumer<List<Integer>> display = num -> System.out.println(num);
		display.accept(list);
		
		Consumer<Integer> display2 = num -> System.out.println(num);
		list.forEach(display2);
		
		Consumer<Integer> display3 = num -> {
			System.out.println(num);
			if (num%2 == 0) {
				System.out.println("Even");
			}
		};
		list.forEach(display3);
		
		//use consumer to solve a problem that take a argument to do the job but doesn't return any value back 
		// for example write the data to the database
		// read data from the database 
	
	}
}
