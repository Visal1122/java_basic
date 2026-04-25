package com.visal.learning;

import java.util.List;

public class UpperBoundWildCard {
	public static void main(String[] args) {
		List<Number> numbers = List.of(1,2,3,4,5);
		double total = sum(numbers);
		System.out.println(total);
		
		List<Integer> numbers2 = List.of(1,2,3,4,5);
		double total2 = sum(numbers2);
		System.out.println(total);
	}
	
	public static double sum (List<? extends Number> numbers ) {
		double total = 0;
		for (Number num : numbers) {
			total +=num.doubleValue();
		}
		return total;
	}
	
	public static  <T extends Number> double su2 (List<T> numbers ) {
		double total = 0;
		for (Number num : numbers) {
			total +=num.doubleValue();
		}
		return total;
	}
}
