package com.visal.learning.functional;

import java.util.function.Predicate;

public class PredicateDemo {
	public static void main(String[] args) {
		Predicate<String> containA = text ->  text.toLowerCase().contains("a"); //text.contains("a")||text.contains("A");
		boolean hasA = containA.test("Visal");
		System.out.println(hasA);
	}
}
