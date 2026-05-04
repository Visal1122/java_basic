package com.visal.learning;

import java.util.List;
import java.util.Optional;

public class StreamDemo3 {
	public static void main(String[] args) {
		List<String> names = List.of("Visal" , "Nan" , "Jing" , "Thya");
	
		boolean anyMatch = names.stream()
			 .anyMatch(name -> name.endsWith("m"));
		System.out.println(anyMatch);
		
		boolean allMatch = names.stream()
			 .allMatch(n-> n.contains("a"));
		
		System.out.println(allMatch);
		
		Optional<String> first = names.stream()
			 .filter(name -> name.length() > 5)
			 .findFirst();
//			 .orElse("No name");
		System.out.println(first);
	
		Optional<String> max = names.stream()
			 .max((x,y) -> x.length()-y.length());
		
		System.out.println(max);
		
		Optional<String> reduce = names.stream().reduce((a , b) -> a + "," +b);
		System.out.println(reduce.get());
		
		String reduce2 = names.stream().reduce("", (a, b) -> a+ "-" + b);
		System.out.println(reduce2);
	}
	
}
