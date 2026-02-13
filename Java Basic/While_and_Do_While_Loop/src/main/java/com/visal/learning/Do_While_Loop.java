package com.visal.learning;

import java.util.Scanner;

public class Do_While_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        System.out.print("Input Number you wanna add : ");
        int n = sc.nextInt();
        int total = 0;
        do{
            System.out.print("Input Number " + i + " : ");
            total+= sc.nextInt();
            i++;
        }while (i<=n);
        System.out.println("Total : " + total);
    }
}
