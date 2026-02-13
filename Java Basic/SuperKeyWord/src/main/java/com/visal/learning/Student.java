package com.visal.learning;

public class Student extends Person {

    private int grade;

    public Student(){
        super("Visal" , "Male" , 21);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    public int getGrade(){
        return grade;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }



}
