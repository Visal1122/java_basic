package com.visal.learning.constructor.reference;

public class ConstructorReferenceDemo {

	public static void main(String[] args) {
		StudentService studentService = (name , age) -> new Student(name ,age);
		Student st = studentService.createStudent("Visal" , 21);
		System.out.println(st.getName());
		// StudentService is a functional interface so we can use lamda expression with it 
		// The lamda expression call the Student Constructor 
		
		
		// using constructor reference 
		StudentService studentService2 = Student::new;
		Student st2 = studentService2.createStudent("Nan", 20);
		System.out.println(st2.getName());
		// if the method inside the interface and the constructor has the same parameter then we can use constructor reference  
		
		
		// example
		StringGenerator string1 = a ->  new String(a);
		char[] a = {'a' , 'b' ,'f'};
		String text = string1.createString(a);
		System.out.println(text);
		// StringGenerator is a functional interface so i can use lamda expression to create a object string 
	
		StringGenerator string2 = String::new;
		String text2 = string2.createString(a);
		System.out.println(text2);
		//and the method inside the interface StringGenerator and the Class String has the same parameter (StringGenerator has char array as parameter and Class String has char array as Constructor)
		// if it is the same type then we can use the Constructor reference 
	}
}
