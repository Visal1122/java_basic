package practice;

import StaticKeyword.Gender;

public class Employee {
    static int count = 0;
    private int id ;
    private String name;
    private Gender gender;
    private double salary;
    private EmployeeType employeeType;

    public Employee(String name, Gender gender, double salary, EmployeeType employeeType) {
        count++;
        this.id = count;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.employeeType = employeeType;
    }

    public  int getId() {
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

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public String toString() {
        double total = 0;
        switch (employeeType){
            case FULL_TIME -> total = salary + (salary*0.05);
            case PART_TIME -> total = salary + (salary*0.03);
            case INTERNSHIP -> total = salary + (salary*0.02);
        }
        return "Employee{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", salary=" + salary +
                ", total =" + total +
                ", employeeType=" + employeeType +
                '}';
    }
}
