package com.visal.FirstDemo;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Input NUmber : ");
        int number = sc.nextInt();
        if (number%2 ==0){
            System.out.println("Your Number is Even ");
        }else {
            System.out.println("Your Number is Odd ");
        }
    }
}
