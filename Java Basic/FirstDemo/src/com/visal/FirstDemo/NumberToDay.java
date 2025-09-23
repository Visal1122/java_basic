package com.visal.FirstDemo;

import java.util.Scanner;

public class NumberToDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Input Number To Show Day : ");
        int number = sc.nextInt();
        String day;
        switch (number){
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
            case 7:
                day = "Sunday";
                break;
            default:
                day = "Invalid";
        }
        System.out.println("The Day is : " + day);
    }
}
