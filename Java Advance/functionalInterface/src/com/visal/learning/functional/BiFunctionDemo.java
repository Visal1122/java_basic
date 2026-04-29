package com.visal.learning.functional;

import java.util.function.BiFunction;

public class BiFunctionDemo {
	public static void main(String[] args) {
		BiFunction<String , Integer, Integer> powOfLength = (t , n) ->Math.powExact(t.length() , n);
		System.out.println(powOfLength.apply("visal", 2));
	}
	
	
}
