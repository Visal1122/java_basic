package com.visal.learning.functional;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {
	public static void main(String[] args) {
		BinaryOperator<Integer> multiply = (n , m)-> n*m;
		System.out.println(multiply.apply(5, 20));
	}
}
