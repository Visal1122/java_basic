package practice;

import StaticKeyword.Gender;

public class EmployeeService {
    public Employee[] createEmployees(int n){
        return null;
    }
    public Employee createEmployee(){
        return null;
    }

    public int countEmployeeByGender(Employee[] employees , Gender gender){
        int total = 0 ;
        for(Employee em : employees){
            if(em.getGender() == gender){
                total++;
            }
        }
        return total;
    }
}
