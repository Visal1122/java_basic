package com.visal.learning.helper;

import com.visal.learning.model.Gender;
import com.visal.learning.model.Student;

import java.util.List;
import java.util.Scanner;

public class StudentHelper {
    static Scanner sc = new Scanner(System.in);
    static int count = 0;
    public static Student createStudent(){
        count  = Math.max(GetLastID(), 0);
        String name = getString("Name : ");
        String gender = getString("Gender : ");
        int grade = getInt("Grade : ");
        int id = ++count;
        return new Student(id , name , Gender.valueOf(gender.trim().toUpperCase()) , grade);
    }

    static String getString(String label){
        System.out.print("Input " + label);
        return sc.next();
    }
    static  int getInt(String Label){
        return Integer.parseInt(getString(Label));
    }
    static int GetLastID(){
        List<String> strings =  FileHelper.ReadFromFile();
        String LastString = strings.getLast();
        String[] SpiltText = LastString.split(",");
        return Integer.parseInt(SpiltText[0]);
    }

}
