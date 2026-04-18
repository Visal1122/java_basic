package com.visal.learning.model;

public class Student {
    private int id;
    private String name;
    private String Gender;
    private int grade;

    public Student(int id, String name, String gender, int grade) {
        this.id = id;
        this.name = name;
        Gender = gender;
        this.grade = grade;
    }

    public Student(String name, String gender, int grade) {
        this.name = name;
        Gender = gender;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", grade=" + grade +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
