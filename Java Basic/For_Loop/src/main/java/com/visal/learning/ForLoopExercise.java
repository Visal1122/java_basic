package com.visal.learning;

import java.util.Scanner;

public class ForLoopExercise {
    public static void main(String[] args) {
        System.out.println("Find the sum of Sequal 2n-1 ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            int n1 = (2*i) - 1;
            sum += n1;
        }
        System.out.println("The result of Sum is : " + sum);

        System.out.println("Find Factorial Number ");
        int fac = 1;
        n = sc.nextInt();
        for (int i = 1 ; i <= n ; i++){
            fac*=i;
        }
        System.out.println(fac);

        System.out.println("Count Even Number in N ");
        n = sc.nextInt();
        int count = 0;
        for(int i = 1 ; i <= n ; i++){
            if(i%2 ==0){
                count++;
            }
        }
        System.out.println("The Even Number in " + n + " is " + count);
    }
}
