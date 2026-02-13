package com.visal.learning;

import java.util.Scanner;

public class StudentServiceFollow {

    public StudentFollow createStudent(){
        Scanner sc = new Scanner(System.in);
        StudentFollow st = new StudentFollow();

        System.out.print("Name : ");
        String name = sc.next();
        st.setName(name);
        System.out.print("Gender : ");
        st.setGender(sc.next());
        System.out.print("Age : ");
        st.setAge(sc.nextInt());
        System.out.println("Input Success");
        return st;
    }
    public StudentFollow[] createStudentArray(int n){
        StudentFollow[] students = new StudentFollow[n];
        for(int i = 0 ; i < students.length ; i++){
            System.out.println("Student " + (i+1));
            students[i] = createStudent();
        }
        return students;
    }
    public void printStudent(StudentFollow[] students){
        for(StudentFollow st : students){
            System.out.println(st.toString());
        }
    }
    public void sortByName(StudentFollow[] students){
        for(int i = 0 ; i< students.length-1 ; i++){
            for(int j = 0 ; j < students.length-1-i ; j++){
                if(students[j].getName().compareTo(students[j+1].getName()) > 0){
                    StudentFollow temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }

            }

        }
        for(StudentFollow st : students){
            System.out.println(st.toString());;
        }
    }
    public void sortByAge( StudentFollow[] students){

        for(int i = 0 ; i< students.length-1 ; i++){
            for(int j = 0 ; j < students.length-1-i ; j++){
                if(students[j].getAge() > students[j+1].getAge()){
                    StudentFollow temp = students[j];
                    students[j] = students[j+1];
                    students[j+1] = temp;
                }
            }

        }
        for(StudentFollow st : students){
            System.out.println(st.toString());;
        }
    }
    public void FindOldestStudent(StudentFollow[] students){
        StudentFollow st = students[0];
        for(StudentFollow stu : students){
            if(stu.getAge() > st.getAge()){
                st = stu;
            }
        }
        System.out.println(st);
    }

}
