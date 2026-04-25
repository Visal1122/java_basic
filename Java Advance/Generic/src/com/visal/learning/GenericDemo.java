package com.visal.learning;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	public static void main(String[] args) {
		List<String> list  = new ArrayList<String>();
		list.add("school");
//		list.add(Integer.valueOf(5));
		for(String obj : list) {
//			String str = (String) obj;
			System.out.println(obj);
			
		}
	}
}
