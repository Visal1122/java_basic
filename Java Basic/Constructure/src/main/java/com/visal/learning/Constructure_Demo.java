package com.visal.learning;

public class Constructure_Demo {

    public static void main(String[] args) {
        Student st = new Student();
        System.out.println(st.getName());
        Student st2 = new Student("Visal" ,  19);
        System.out.println(st2.getName());
    }
}
