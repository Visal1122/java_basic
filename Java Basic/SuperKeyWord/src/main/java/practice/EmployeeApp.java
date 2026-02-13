package practice;

import StaticKeyword.Gender;

public class EmployeeApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Visal" , Gender.MALE , 200 , EmployeeType.FULL_TIME );
        Employee employee2 = new Employee("Nan" , Gender.MALE , 180 , EmployeeType.PART_TIME );
        Employee employee3 = new Employee("Jing" , Gender.MALE , 160 , EmployeeType.INTERNSHIP );

        Employee[] employees = new Employee[] {employee1 , employee2 , employee3};
        EmployeeService employeeService = new EmployeeService();
        System.out.println(employee1.toString());
        System.out.println(employee2.toString());
        System.out.println(employee3.toString());

        System.out.println(employeeService.countEmployeeByGender(employees , Gender.FEMALE));
    }
}
