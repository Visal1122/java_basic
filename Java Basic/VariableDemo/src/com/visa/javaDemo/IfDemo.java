package com.visa.javaDemo;

public class IfDemo {
    public static void main(String[] args){
        int score = 80;
        char grade = 'A';
        if(score >= 90){
            grade = 'A';
        } else if (score >= 80) {
            grade = 'B';
        }else if (score >= 70) {
            grade = 'C';
        }else if (score >= 60) {
            grade = 'D';
        }else if (score >= 50) {
            grade = 'E';
        }else if (score < 50 ) {
            grade = 'F';
        }
        System.out.println("Your Grade is " + grade);

    }

}
