package com.visal.learning.functional;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		UnaryOperator<String> toUpper = text -> text.toUpperCase();
		System.out.println(toUpper.apply("visal"));
		
		UnaryOperator<Integer> power = n -> n*n;
		System.out.println(power.apply(7));
		
//		visal => 5 (length) => 25 power 
		
		Function<String, Integer> toLength = t -> t.length();
		int result = toLength.andThen(power).apply("visal");
		System.out.println(result);
		
	}
}
