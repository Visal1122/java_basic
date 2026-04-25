package com.visal.learning;

import java.util.ArrayList;
import java.util.List;

public class LowerBoundGeneric {
	public static void main(String[] args) {	
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		addInteger(list);
		
		List<Number> list2 = new ArrayList<>();
		list2.add(1);
		list2.add(5);
		addInteger(list2);
		
		List<Long> list3 = new ArrayList<>();
		list3.add(1);
		list3.add(5);
		addInteger(list3);
		
	}
	public static void addInteger(List<? super Integer> number ) {
		number.add(10);
	}
}
