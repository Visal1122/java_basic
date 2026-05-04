package com.visal.learning.method.reference;

import java.util.List;

import com.visal.learning.Printer;

public class MethodReferenceDemo {
	public static void main(String[] args) {
		Finder finder = new MyFinder();
		String text = "welcome to cambodia";
		int index = finder.Find(text, "tom");
//		System.out.println(index);
		
		
		
//		static method reference
		Finder finder2 = FindText::getIndexFromText;
		int index2 = finder2.Find("Nan is a student", "is");
		System.out.println(index2);
//		we can reference the interface to the method if has the same return type and parameter 
//		the method must be static 
		
		
//		instance method reference
		MyFinder2 myFinder2 = new MyFinder2();
		Finder newFinder = myFinder2::Find;
		System.out.println(newFinder.Find("hellow", "w"));
//		if the method is not static type we can reference using the instance (we create instance of that class then reference using that instance)
		
		
//		method reference 
		Printer myprinter = s -> System.out.println(s);
		Printer myprinter2 = System.out::println;
//		myprinter2 is using method reference that the out is the static member of the System class and out object type is PrintStream that contain println so we can reference to that method by using the out memeber 
// 		and we can reference to println without the instance because out is a static member 
//		println and display in Printer class has the same return type and parameter 
		
		
//		parameter method reference 
		
		Finder finder3 = String::indexOf;
		System.out.println(finder3.Find("This is a school ", "school"));
		
		
//		Constructor reference 
		
	}
}
