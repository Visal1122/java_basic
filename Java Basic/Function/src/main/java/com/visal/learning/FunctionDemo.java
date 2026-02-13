package com.visal.learning;

import java.util.Arrays;
import java.util.Scanner;

public class FunctionDemo {
    public static void main(String[] args) {

//        sayWelcome();
        int[] a = {25 , 26 , 52 , 34, 62};
        int[] arr = {10, 2, 8, 1};
//        printArray(a);
//        sumAllArrays(a);
//        power(3,4);
//        maxInArray(arr);
//        getArraysFromKeyboard();
        sumAllArrays(a);
        sumAllArrays(arr);
        System.out.println(sumArrays(a) + sumArrays(arr));
    }


    public static void sayWelcome(){
        System.out.println("Welcome to Cambodia");
    }
    public static void printArray(int[] a){
//        System.out.println(Arrays.toString(a));
        for(int n : a){
            System.out.println(n);
        }
    }
    public static void sumAllArrays(int[] a ){
        int total = 0;
        for(int n : a){
            total+=n;
        }
        System.out.println("Total = " + total);
    }
    public static void power(int num , int pow){
        int result = 1;
        for(int i = 0 ; i < pow ; i++){
            result*=num;
        }
        System.out.println("Result of Pow = " + result);
    }
    public static void maxInArray(int[] arr){
        int max = arr[0];
        for(int i = 0 ; i<arr.length  ; i++){
            if( max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max Number in array is : " + max);
    }
    public static void getArraysFromKeyboard(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input Number of Element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ; i<n ; i++){
            System.out.print("Element " + (i+1) + " : ") ;
            arr[i] = sc.nextInt();
        }
        System.out.println("Inputed Arrays is : " + Arrays.toString(arr));
    }
    public static int sumArrays(int[] arr){
        if(arr.length!=0){
            int total = 0;
            for(int n : arr){
                total+=n;
            }
            return total;
        }
        return 0;
    }
}
