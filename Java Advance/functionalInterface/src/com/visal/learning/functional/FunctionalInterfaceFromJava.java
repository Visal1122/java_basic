package com.visal.learning.functional;

import java.util.function.Function;

public class FunctionalInterfaceFromJava {

	public static void main(String[] args) {
		
			Function<String , Integer> getlenght = new ToLenght();
			int result = getlenght.apply("Visal");
			System.out.println(result);
			
			Function<String , Integer> getLength2 = t -> t.length();
			result = getLength2.apply("Jing");
			System.out.println(result);
			
			Function<String , Character> firstChar = t -> t.charAt(0);
			System.out.println(firstChar.apply("Nan"));
			
			Function<Integer , Integer> power = n -> n*n;
			System.out.println(power.apply(5));
	}
	static class ToLenght implements Function<String, Integer>{

		@Override
		public Integer apply(String t) {
			// TODO Auto-generated method stub
			return t.length();
		}
		
	}

}
