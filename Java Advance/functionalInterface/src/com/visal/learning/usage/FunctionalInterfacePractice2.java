package com.visal.learning.usage;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.visal.learning.model.Student;

public class FunctionalInterfacePractice2 {
	
	static List<Student> students = List.of(
			new Student("Visal", "M", 21),
			new Student("Jing", "M", 22),
			new Student("Nan", "M", 20),
			new Student("Thya", "M", 22),
			new Student("Thida", "F", 20),
			new Student("Satya", "F", 21),
			new Student("Nimol", "F", 21),
			new Student("Sivmey", "F", 23),
			new Student("Mony", "F", 22)
			);
	public static void main(String[] args) {
		
		
		//print all student 
//		students.stream()
//				.forEach(student -> System.out.println(student.getName()));
		
		//print student that is Female  
		students.stream()
				.filter(gender -> gender.getGender() == "F")
				.forEach(student -> System.out.println(student.getName()));
		
		
		// comparator that use anonymous class style 
//				Comparator<Student> sortedByage = new Comparator<Student>() {
//					
//					@Override
//					public int compare(Student o1, Student o2) {
//						
//						return o1.getAge() - o2.getAge();
//					}
//				};  
//				
				
				// comparator that use Lamda expression style 
		Comparator<Student> sortByAge = (age1 , age2)-> (int) age1.getAge() - age2.getAge();
		
		// print student that is female and filter by age and print in a limited number 
//		students.stream()
//				.filter(gender -> gender.getGender() == "F")
//				.sorted(sortByAge)
//				.limit(3)
//				.forEach(student -> System.out.println(student.getName() + " , " + student.getAge()));
//		
		// print student that is female and filter by age and print in a limited number  and use lamda inside the sorted function 
		students.stream()
				.filter(gender -> gender.getGender() == "F")
				.sorted((age1 , age2) -> age2.getAge() - age1.getAge())
				.limit(3)
				.forEach(student -> System.out.println(student.getName() + " , " + student.getAge()));
		System.out.println();
			
		//print student group by gender 
		Map<String, List<Student>> studentGroupByGender = students.stream()
				.collect(Collectors.groupingBy(gender -> gender.getGender()));
//		System.out.println(studentGroupByGender);
		
		// print student group by age 
		Map<Integer, List<Student>> studentGroupByAge = students.stream()
				.collect(Collectors.groupingBy(gender -> gender.getAge()));
		System.out.println(studentGroupByAge);
		
		// print amount student in each age 
				Map<Integer, Long> studentGroupByAgeCount = students.stream()
						.collect(Collectors.groupingBy(gender -> gender.getAge() , Collectors.counting()));
				System.out.println(studentGroupByAgeCount);
		// print group of student that older and younger than a specific age  
		Map<Boolean, List<Student>> map = students.stream()
				.collect(Collectors.partitioningBy(age -> age.getAge() > 21));
		
		System.out.println(map);
	}
}
