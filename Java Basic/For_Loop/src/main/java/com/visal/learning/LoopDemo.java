package com.visal.learning;

import java.awt.*;
import java.util.Scanner;

public class LoopDemo {
    public static void main(String[] args) {
//        System.out.println("Welcome To Cambodia");
//        System.out.println("Welcome To Cambodia");
//        System.out.println("Welcome To Cambodia");
//        System.out.println("Welcome To Cambodia");
//        System.out.println("Welcome To Cambodia");


        Scanner sc = new Scanner(System.in);
        System.out.print("Input N : ");
        int max = 0;
        int n = sc.nextInt();
        for(int i = 1 ; i <= n ; i++){
            System.out.print("Input Number " + i + " : ");
            int number = sc.nextInt();
            if(max < number){
                max = number;
            }
        }
        System.out.println("Maximum Number is : " + max);
    }
}
