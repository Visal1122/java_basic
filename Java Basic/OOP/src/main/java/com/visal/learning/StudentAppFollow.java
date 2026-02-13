package com.visal.learning;

public class StudentAppFollow {
    public static void main(String[] args) {
        StudentServiceFollow studentServiceFollow = new StudentServiceFollow();
        StudentFollow[] students = studentServiceFollow.createStudentArray(4);
        System.out.println("Normal Output");
        studentServiceFollow.printStudent(students);
        System.out.println("Sorted By Name");
        studentServiceFollow.sortByName(students);
        System.out.println("Sorted By Age");
        studentServiceFollow.sortByAge(students);
        System.out.println("Oldest Student");
        studentServiceFollow.FindOldestStudent(students);

    }

}
