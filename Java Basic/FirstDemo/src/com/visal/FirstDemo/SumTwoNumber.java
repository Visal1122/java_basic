package com.visal.FirstDemo;
import java.util.*;

public class SumTwoNumber {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Input First Number : ");
         int firstNumber = sc.nextInt();
         System.out.print("Input Second Number : ");
         int secondNumber = sc.nextInt();
         System.out.println("Total = " + (firstNumber+secondNumber));
    }
}
