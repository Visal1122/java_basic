package com.visal.learning;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentApp {
    static void main() {
        JFrame frame = new JFrame();
        frame.setTitle("Student Application");
        frame.setSize(300 , 400);
//        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel lblName  = new JLabel("Name");
        lblName.setBounds(10 , 10 , 50 , 20);
        frame.add(lblName);

        JLabel lblGender = new JLabel("Gender");
        lblGender.setBounds(10 , 40 , 50 , 20);
        frame.add(lblGender);

        JLabel lblAge = new JLabel("Age");
        lblAge.setBounds(10 , 70 , 50 , 20);
        frame.add(lblAge);

        JLabel lblGrade = new JLabel("Grade");
        lblGrade.setBounds(10 , 100 , 50 , 20);
        frame.add(lblGrade);

        JButton btnSave = new JButton("Save");
        btnSave.setBounds(10 , 140 , 100 , 20 );
        frame.add(btnSave);

        JTextField txtName = new JTextField();
        txtName.setBounds(80 , 10 , 200 , 20 );
        frame.add(txtName);

        JTextField txtGender = new JTextField();
        txtGender.setBounds(80 , 40 , 200 , 20 );
        txtGender.setVisible(true);
        frame.add(txtGender);

        JTextField txtAge = new JTextField();
        txtAge.setBounds(80 , 70 , 200 , 20 );
        frame.add(txtAge);

//        Integer[] grades =  new Integer[]{1,2,3,4,5,6};
//        JComboBox<Integer> cmbGrade = new JComboBox<>(grades);
            JComboBox cmbGrade = new JComboBox();
        for (int i = 1 ; i <= 12 ; i++){
            cmbGrade.addItem(i);
        }
        cmbGrade.setBounds(80 , 100 , 200 ,  20);
        frame.add(cmbGrade);
        btnSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String gender = txtGender.getText();
                String age = txtAge.getText();
                String grade = cmbGrade.getSelectedItem().toString();
                System.out.println("Name : " + name +"\nGender : " + gender + "\nAge : " +age + "\nGrade : " + grade) ;
            }
        });
        frame.setVisible(true);
    }
}
