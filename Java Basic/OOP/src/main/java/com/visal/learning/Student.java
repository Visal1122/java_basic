package com.visal.learning;

import java.util.Scanner;

public class Student {
    private String name;
    private String gender;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.compareTo("Male") == 0 || gender.compareTo("Female") ==0) {
            this.gender = gender;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0){
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
    static void sortObjectByName(Student[] students){

        for(int i = 0 ; i< students.length-1 ; i++){
            for(int j = 0 ; j < students.length-1-i ; j++){
                if(students[j].name.compareTo(students[j+1].name) > 0){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }

        }
        for(Student st : students){
            System.out.println(st.toString());;
        }
    }
    static void sortObjectByAge(Student[] students){

        for(int i = 0 ; i< students.length-1 ; i++){
            for(int j = 0 ; j < students.length-1-i ; j++){
                if(students[j].age > students[j+1].age){
                    Student temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }

        }
        for(Student st : students){
            System.out.println(st.toString());;
        }
    }

}
