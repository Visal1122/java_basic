package com.visal.learning;

//import java.awt.List;
import java.util.*;

public class GenericMethod {
	public static <T> boolean isEqual(GenericType<T> t1GenericType , GenericType<T> t2) {
		return t1GenericType.getValue().equals(t2.getValue());
	}
	public static <T> List<T> combine(List<T> list1 , List<T> list2){
		
		List<T> list  = new ArrayList<>();
		list.addAll(list1);
		list.addAll(list2);
		
		return list;
	}
	public static void main(String[] args) {
		GenericType<Integer> t1GenericType = new GenericType<>();
		t1GenericType.setValue(5);
		
		GenericType<Integer> t2GenericType = new GenericType<>();
		t2GenericType.setValue(15);

		boolean test = GenericMethod.isEqual(t1GenericType, t2GenericType);
		System.out.println(test);
		
		List<Integer> lst1 = new ArrayList<>();
		lst1.add(10);
		lst1.add(20);
		lst1.add(30);
		
		List<Integer> lst2 = new ArrayList<>();
		lst2.add(15);
		lst2.add(25);
		lst2.add(35);
		
		List<Integer> combineList = combine(lst1, lst2);
		System.out.println(combineList);
	}
}
