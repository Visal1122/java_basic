package com.visal.learning;

public class GenericType<T> {
	T value;

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	public static void main(String[] args) {
		GenericType<String> type = new GenericType<>();
		type.setValue("Visal");
//		type.setValue(10);
		String st = type.getValue();
		System.out.println(st);
		
		GenericType<Integer> type2 = new GenericType<>();
		type2.setValue(12);
		Integer s2Integer = type2.getValue();
		System.out.println(s2Integer);
		
	}

}
