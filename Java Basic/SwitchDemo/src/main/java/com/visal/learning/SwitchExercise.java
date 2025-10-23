package com.visal.learning;

import java.util.Scanner;

public class SwitchExercise {
    public static void main(String[] args) {
        int sizeNumber = 1;
        String size = "";
        switch (sizeNumber){
            case 29:
                size = "small";
                break;
            case 42:
                size = "medium";
                break;
            case 44:
                size = "large";
                break;
            case 48:
                size = "extra large";
                break;
            default:
                size = "Unknown";
                break;
        }
        System.out.println("Your size is " + size);


        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number of Month : ");
        int monthNumber = sc.nextInt();
        int numberOfDay = 0;

        if(monthNumber == 1 || monthNumber == 3 || monthNumber == 5 || monthNumber == 7 || monthNumber == 8 || monthNumber == 10 || monthNumber == 12){
            numberOfDay = 31;
        } else if (monthNumber == 4 || monthNumber == 6 || monthNumber == 9 || monthNumber == 11) {
            numberOfDay = 30;
        }else if (monthNumber == 2){
            System.out.print("Input Year : ");
            int year = sc.nextInt();
            if (year %4 == 0){
                numberOfDay = 29;
            }else {
                numberOfDay = 28;
            }
        }else{
            numberOfDay = 0;
        }

        switch (monthNumber){
            case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 :
                numberOfDay = 31;
                break;
            case 4 : case 6 : case 9 : case 11 :
                numberOfDay = 30;
                break;
            case 2:
                System.out.print("Input Year : ");
                int year = sc.nextInt();
                if (year %4 == 0){
                    numberOfDay = 29;
                }else {
                    numberOfDay = 28;
                }
                break;
            default:
                numberOfDay = 0;
                break;
        }


            System.out.println("The Number if day in that month is : " + numberOfDay);
    }
}
