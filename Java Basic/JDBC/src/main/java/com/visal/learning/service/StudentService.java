package com.visal.learning.service;

import com.visal.learning.model.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    Connection connection;
    public StudentService(Connection connection){
        this.connection = connection;
    }
    public StudentService(){

    }

    public void save(){
        String sql = "INSERT INTO students (name , gender , grade ) VALUES ('Jing' , 'M' , 11)";
        try {
            Statement createStatement = connection.createStatement();
            createStatement.executeUpdate(sql);
            System.out.println("Insert Successfully");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void saveStudent(Student student ){

        String sql = "INSERT INTO students (name , gender , grade ) VALUES (? , ? , ?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString( 1 , student.getName());
            preparedStatement.setString( 2 , student.getGender());
            preparedStatement.setInt( 3 , student.getGrade());
            preparedStatement.executeUpdate();
            System.out.println("Insert Success");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public Student findById(int id ){
        String sql = "SELECT * FROM students WHERE id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1 , id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){

                 return GetStudentObj(resultSet);
            }else {
                System.out.println("Student not fount ");
                return  null;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private Student GetStudentObj(ResultSet resultSet){
        try {
            String name = resultSet.getString(2);
            String gender = resultSet.getString(3);
            int grade = resultSet.getInt(4);
            return new Student(name, gender, grade);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void UpdateStudet(Student student ){
        int idTofind = student.getId();
        Student student1 = findById(idTofind );
        if(student1 != null){
            String sql = "UPDATE students SET name = ?, gender = ? , grade = ? WHERE id = ?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1 , student.getName());
                preparedStatement.setString(2 , student.getGender());
                preparedStatement.setInt(3 , student.getGrade());
                preparedStatement.setInt(4 , idTofind);
                preparedStatement.executeUpdate();
                System.out.println("Update Successfully");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        }

    }
    public void DeleteStudent(int id ){
        Student student = findById(id );
        if(student != null){
            String sql = "DELETE FROM students WHERE id = ?";
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1 , id);

                preparedStatement.executeUpdate();
                System.out.println("Delete Successfully");
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public List<Student> GetAllStudent(){
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM students";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                Student student = GetStudentObj(resultSet);
                students.add(student);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  students;
    }


}
