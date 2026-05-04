package com.visal.learning;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LamdaDemo {
	public static void main(String[] args) {
		
		/*
		 * matching the lamda expression to the interface 
		 * Interface must be functional interface (interface that has only 1 method) 
		 * must match the parameter of the lamda expression to the interface method ex : void show(String text); Interface interface = (String text) -> .......
		 * same return type 
		 */
		
		Printer printer = (String text) -> System.out.println(text);
//		printer.display("display form lamda expression");
		
		
		Infor infor = () -> System.out.println("Company information");
//		infor.showInfor();
		
		Comparator<Integer> compareByNumber =(o1, o2) -> o1-o2;
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(24);
		list1.add(12);
		list1.add(16);
//		System.out.println(list1);
		
//		sort using the comparator 
		Collections.sort(list1 , compareByNumber );
//		System.out.println(list1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("Visal");
		list2.add("Nan");
		list2.add("Jing");
//		System.out.println(list2);
		
		Collections.sort(list2 , (o1, o2) -> o1.compareTo(o2) );
//		System.out.println(list2);
		
//		Map<String, Integer> priceMap = new HashMap<>();
//		var priceMap = new HashMap<>();
//		priceMap.put("Apple", 30);
		
		Calculator calculator = (a , b) -> {
			
			System.out.println("a * b = ? ");
			return a*b;
		};
		System.out.println(calculator.calculus(4, 5));
		
//		Lamda Expression as an object
		Calculator calculato1 = new MyCalculator();
		Calculator calculator2 = (a ,b)-> a*b;
		
//		calculator1 and calculator2 is the same and it is an object 
		
		
	
	} 
	static class MyCalculator implements Calculator{

		@Override
		public int calculus(int a, int b) {
			
			return 0;
		}
		
	}
}
