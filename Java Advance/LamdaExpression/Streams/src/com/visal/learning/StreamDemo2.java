package com.visal.learning;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo2 {
	public static void main(String[] args) {
		List<Student> students = List.of(
				new Student("Visal", 21, List.of("Math" , "Physic" )),
				new Student("Nan", 20, List.of("English" , "Khmer" )),
				new Student("jing", 22, List.of("Chemistry" , "History" )),
				new Student("Thya", 22, List.of("Geology" , "Physic" ))
				);
		
		List<List<String>> map = students.stream()
				.map(n -> n.getSubject())
				.collect(Collectors.toList());
		System.out.println(map);
		
		List<String> flatMap = students.stream()
				.flatMap(t -> t.getSubject().stream())
				.collect(Collectors.toList());
		System.out.println(flatMap);
	}
}
