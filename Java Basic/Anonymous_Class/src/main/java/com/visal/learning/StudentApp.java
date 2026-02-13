package com.visal.learning;

import java.util.Arrays;
import java.util.Comparator;

public class StudentApp {
    static Comparator<Student> sortByAge = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.getAge() - o1.getAge();
        }
    };
    public static void main(String[] args) {
        StudentApp studentApp = new StudentApp();
        Student[] students = new Student[]{
                new Student("Visal" , 21),
                new Student("Jing" , 22),
                new Student("Nan" , 20),
                new Student("Thya" , 23),
        };

        for (Student student : students){
            System.out.println(student.toString());
        }
        Arrays.sort(students ,  sortByAge);
//        Arrays.sort(students , new SortStudent());
        for (Student student : students){
            System.out.println(student.toString());
        }
    }



}
