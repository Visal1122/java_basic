package com.visal.learning.form;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentForm extends JFrame {
    Boolean selected = false;
    int currentRow ;
    JPanel topPanel;
    JTable table;
    JTextField txtName;
    JComboBox<String> cbxGender;
    JTextField txtAge;
    JComboBox<Integer> cbxGrade;

    public StudentForm(){
        this.setTitle("Student Form");
        this.setSize(500,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        topPanel = topPanel();

        table = createTable();
        JScrollPane js = new JScrollPane();
        js.getViewport().add(table);
        ClickOnTableCell();

        this.setLayout(new BorderLayout());
        this.add(topPanel , BorderLayout.NORTH);
        this.add(js , BorderLayout.CENTER);
        this.setVisible(true);
    }

    private JPanel topPanel(){
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(5 , 2));

        JLabel lblName = new JLabel("Name");
        jPanel.add(lblName);
        txtName = new JTextField();
        jPanel.add(txtName);

        JLabel lblGender = new JLabel("Gender");
        jPanel.add(lblGender);
        String[] genders = new String[]{"Male" , "Female"};
        cbxGender = new JComboBox<>(genders);
        jPanel.add(cbxGender);

        JLabel lblAge = new JLabel("Age");
        jPanel.add(lblAge);
        txtAge = new JTextField();
        jPanel.add(txtAge);

        JLabel lblGrade = new JLabel("Grade");
        jPanel.add(lblGrade);
        Integer[] grades = new Integer[]{ 1,2,3,4,5,6,7,8,9,10,11,12};
        cbxGrade = new JComboBox<>(grades);
        jPanel.add(cbxGrade);

        JButton btnSave = new JButton("Save");
        jPanel.add(btnSave);
        btnSave.addActionListener(new MyClickListener());

        JButton btnDelete = new JButton("Delete");
        jPanel.add(btnDelete);
        btnDelete.addActionListener(new DeleteAction());
        return jPanel;
    }
    class MyClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e ) {
            String name = txtName.getText();
            String gender = cbxGender.getSelectedItem().toString();
            String grade = cbxGrade.getSelectedItem().toString();
            int age = Integer.parseInt(txtAge.getText());
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            if((selected != true)){
                model.addRow(new Object[]{name , gender , grade , age});

            }else {
                model.setValueAt(name ,currentRow , 0);
                model.setValueAt(gender , currentRow , 1);
                model.setValueAt(grade , currentRow , 2);
                model.setValueAt(age , currentRow , 3);
                selected = false;
            }

            clearControl();

        }
    }
    private void clearControl(){
        txtName.setText("");
        cbxGender.setSelectedIndex(0);
        cbxGrade.setSelectedIndex(0);
        txtAge.setText("");
    }
    private void ClickOnTableCell(){
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                addValueToControl();
            }
        });
    }
    class DeleteAction implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ClickOnTableCell();
            if(selected != false){
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.removeRow(currentRow);
                selected = false;
                clearControl();
            }
        }
    }

    private void addValueToControl(){
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        currentRow = table.getSelectedRow();
        Object name = model.getValueAt(currentRow , 0);
        Object gender = model.getValueAt(currentRow , 1);
        Object grade = model.getValueAt(currentRow , 2);
        Object age = model.getValueAt(currentRow , 3);

       System.out.println(grade);
       txtName.setText(name.toString());
       cbxGender.setSelectedItem(gender);
       cbxGrade.setSelectedItem(Integer.valueOf(grade.toString()));
       txtAge.setText(age.toString());

       selected =true;
    }


    JTable createTable(){
        String[] ColumnName = new String[]{"Name" , "Gender" , "Grade" , "Age"};
        Object[][] rowData = {
                {"Dara" , "Male" , "10" , 16},
                {"Thida"  , "Female" , "11" , 17}
        };
        DefaultTableModel defaultTableModel = new DefaultTableModel(rowData , ColumnName);

//        JTable jTable = new JTable(rowData , ColumnName);
        JTable jTable = new JTable(defaultTableModel);

        return jTable;
    }
}
