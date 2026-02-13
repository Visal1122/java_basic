package com.visal.learning;

import java.util.Scanner;

public class Break_Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do{
            System.out.print("Input non Even Number : ");
            num = sc.nextInt();
            if(num%2 == 0) {
                System.out.println("You have input a even number !!!1");
                break;
            }

        }while (true);
    }
}
