package com.visal.learning;

import java.util.Scanner;

public class StudentApp {
    public static void main(String[] args) {
        Student[] students = {
                new Student(),
                new Student(),
                new Student(),
                new Student()
        };
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i < students.length ; i++){
            System.out.println("Student " + (i+1));
            System.out.print("Input Name : ");
            students[i].setName(sc.nextLine());
            System.out.print("Input Gender : ");
            students[i].setGender(sc.nextLine());
            System.out.print("Input Age : ");
            students[i].setAge(sc.nextInt());
            sc.nextLine();
        }
        System.out.println("Input Success");
        for(Student st : students){
            System.out.println(st.toString());;
        }
        System.out.println("After Sorted By name");
        Student.sortObjectByName(students);

        System.out.println("After Sorted By Age");
        Student.sortObjectByAge(students);

    }
}
