package com.visal.learning;

import com.visal.learning.model.Student;
import com.visal.learning.service.StudentService;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JDBC {
    StudentService service = new StudentService();
    Connection connection;
    JDBC(){
        connection = getConnection();
        service = new StudentService(connection);

    }

    static void main() {
        JDBC jdbc = new JDBC();
//        jdbc.save("Test" , "M" , 12);
//        Student student1 = new Student(16 , "LELELE" , "M" , 10);
//        jdbc.service.UpdateStudet(student1 , jdbc.connection);
//        Student student = jdbc.service.findById(14 , jdbc.connection);
//        System.out.println(student.toString());
//        jdbc.service.DeleteStudent(14 , jdbc.connection);
        List<Student> students = jdbc.service.GetAllStudent();
        System.out.println(students);
    }


    private Connection getConnection(){

        String url = "jdbc:postgresql://127.0.0.1:5433/SchoolManagement";
        String user = "visal";
        String pwd= "123";
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url , user , pwd);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Connection Success");

        return connection;
    }

    private void save(String name , String gender , int grade){
        Student student = new Student(name , gender , grade);
        service.saveStudent(student);
    }
}
