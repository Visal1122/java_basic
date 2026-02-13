package com.visal.learning;

import java.util.Scanner;

public class While_Loop {
    public static void main(String[] args) {
        //input 5 number from keyboard and sum it all up
        Scanner sc = new Scanner(System.in);
         int n = 1;
         int sum = 0;
         while (n <= 5 ){
             System.out.print("Number " + n + " : ");
             sum += sc.nextInt();
             n++;
         }
        System.out.println("Total is : " + sum);
    }
}
