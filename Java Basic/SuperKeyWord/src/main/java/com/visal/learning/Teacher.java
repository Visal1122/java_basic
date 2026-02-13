package com.visal.learning;

public class Teacher extends Person{

    private double salary;

    public Teacher(){
        super("Thida" , "Female");
    }
    String info(){
        return "name = " + name + " , Gender = " + gender + " , Age = " + age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
