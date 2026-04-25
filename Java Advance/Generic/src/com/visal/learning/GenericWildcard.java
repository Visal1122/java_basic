package com.visal.learning;

import java.util.ArrayList;
import java.util.List;

public class GenericWildcard {
	public static void main(String[] args) {
		
		List<?> list1 = new ArrayList<>();
		
		
	}
	public List<?> getList(){
		return null ;
	}
	public static void display(List<?> list) {
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
}
