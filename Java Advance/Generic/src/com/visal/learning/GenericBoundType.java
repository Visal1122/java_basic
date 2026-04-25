package com.visal.learning;

import java.util.List;

public class GenericBoundType {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(1 , 2, 3, 4,5);
		double total  = sum(numbers);
		System.out.println(total);
		
		
		List<String> strings = List.of("Visal" , "Jing");
//		sum(strings); 
		
	} 
	public static <T extends Number> double sum(List<T> numbers){
		double total = 0;
		for (T num : numbers) {
			total += num.doubleValue();
		}
		return total;
	}
	
}
