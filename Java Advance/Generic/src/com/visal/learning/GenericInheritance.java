package com.visal.learning;



public class GenericInheritance {
	
	public static void main(String[] args) {
		
		String str = new String();
		Object obj = new Object();
		
		obj = str;
		
		Visal<String> strG = new Visal<>();
		Visal<Object> objG = new Visal<>();
//		objG = strG;
		
		obj = strG;
		
		Nan<Object> objN = new Nan<>();
		objG = objN;
		
		Jing<String , Integer> strJ = new Jing<>();
		
		strG = strJ;
		
		
	
	
	
	}
	
	static class Visal<T>{
		
	}
	
	static class Nan<T> extends Visal<T>{
		
	}
	
	static class Jing<T , E> extends Visal<T>{
		
	}
}
