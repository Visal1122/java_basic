package com.visal.learning.functional;

import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// use supplier to return a value 
		
		Supplier<String> GetName = () -> "Dara";
		
		List<Integer> list = List.of(13 , 23 , 25 , 17 , 34  , 53);
		
		// the example bellow is use the supplier to return the value if the number is empty
		// we can use it to retrieve the data from the database in case the data is empty or give the fix value 
		Integer i = list.stream()
		.filter(n -> n%2 == 0)
		.findFirst()
		.orElseGet(() -> 0);
		System.out.println(i);
	
		
		// we use the optional to get the optional type value that will help us handle the null value 
		Optional<Integer> firstEven = list.stream()
				.filter(n -> n%2 == 0)
				.findFirst();
		System.out.println(firstEven);
				
				
	}


}
