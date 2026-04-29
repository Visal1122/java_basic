package com.visal.learning.usage;

import java.util.List;

public class FunctionalInterfacePractice {
	public static void main(String[] args) {
		List<String> names = List.of("Visal" , "Nan" , "Jing" , "Thya");
		
		//print all names 
		names.stream()
			 .forEach(name -> System.out.println(name));
		
		//print name to upper case 
		names.stream()
			 .map(name -> name.toUpperCase())
			 .forEach(name -> System.out.println(name));
		
		// print the name with that the length is bigger than 3 and print in Lower case 
		names.stream()
			 .map(name -> name.toLowerCase())
			 .filter(name -> name.length()>3)
			 .forEach(name -> System.out.println(name));
			 
	}
}
