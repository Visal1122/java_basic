package com.visal.learning;

import com.visal.learning.helper.FileHelper;
import com.visal.learning.helper.StudentHelper;
import com.visal.learning.model.Student;
import com.visal.learning.service.StudentService;

import java.util.List;

public class StudentApplication {


    static void main() {
//        Student student = new Student(1 , "Visal" , Gender.MALE , 12);
//        Student student = new Student(2 , "Nan" , Gender.MALE , 12);
//
        StudentService service = new StudentService();
//        service.SaveToFile(student);
//        System.out.println(FileHelper.ReadFromFile());
//        List<Student> studentList = service.ReadFromFile();
//        for (Student st : studentList){
//            System.out.println(st.ToInfo());
//        }
        int studentNumber = 2;

        for(int i = 0 ; i < studentNumber ; i++){
            service.SaveToFile(StudentHelper.createStudent());
        }
    }
}
