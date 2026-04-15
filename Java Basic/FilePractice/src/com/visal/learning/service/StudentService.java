package com.visal.learning.service;

import com.visal.learning.helper.FileHelper;
import com.visal.learning.model.Gender;
import com.visal.learning.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public void SaveToFile(Student student){

        FileHelper.WriteToFile(student.ToData());
        System.out.println("New Student Added to file");
    }
    public List<Student> ReadFromFile(){
        List<String> data = FileHelper.ReadFromFile();
        List<Student> students = new ArrayList<>();
        for (String st : data){
            students.add(DataSplitting(st));
        }
        return students;
    }

    private Student DataSplitting(String data){
        String[] text =  data.split(",");
        int id = Integer.parseInt(text[0]);
        String name = text[1];
        String genderString = text[2];
        Gender gender = Gender.valueOf(genderString);
        int grade = Integer.parseInt(text[3]);
        Student student = new Student(id , name , gender , grade);
        return student;
    }


}
