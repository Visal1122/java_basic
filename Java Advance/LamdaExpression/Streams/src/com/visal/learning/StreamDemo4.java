package com.visal.learning;

import java.util.List;

public class StreamDemo4 {
	public static void main(String[] args) {
		List<Integer> list = List.of(23 , 31 , 17 , 45 , 12);
		Integer reduce = list.stream().reduce(0 , (a,b) -> a+b);
		System.out.println(reduce);
	}
}
