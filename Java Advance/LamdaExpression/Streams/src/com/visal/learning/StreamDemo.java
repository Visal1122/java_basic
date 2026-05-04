package com.visal.learning;

import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		List<String> names = List.of("Visal" , "Nan" , "Jing" , "Thya");
		Stream<String> streamName = names.stream(); // obtain stream instance 
		streamName
			 .filter(n -> n.contains("n"))
			 .map(name -> name.length()) // intermediate operation
			 .limit(1)
			 .forEach(System.out::println);; // terminal operation 
		// each operation is take the result of the previous operation to do the work 
		// so becareful with the operation order filter before limit mean (we filter and when get result we take the limit number) limit before filter mean (we limit the element then we filter that element)
	
		
	}
}
