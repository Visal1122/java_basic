package com.visal.learning;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        int[] a = new int[10];
//
//        int[] score = {10 , 20 , 40 , 50};
//
//        System.out.println(Arrays.toString(score));
        int[] b = new int[5];
        b[0] = 30;
        b[1] = 25;
        b[2] = 40;
        b[3] = 15;
        b[4] = 23;

//        System.out.println(Arrays.toString(b));
//        for (int i = 0 ; i <= 4 ; i++){
//            System.out.println(b[i]);
//        }
//        for (int i : b){
//            System.out.println(i);
//        }

//        String[] name = {"Visal" , "Dara" , "Thida" , "Tola" , "Seyha"};
//        for(String i :name){
//            System.out.println(i);
//        }
        int[] e = {50 , 20 , 40 , 10};
        int sum = 0;
//        for(int i = 0 ; i<e.length ; i++){
//            sum+=e[i];
//        }
//        System.out.println(sum);
//        for(int num : e){
//            sum+= num;
//        }
//        System.out.println(sum);
//        findAverage();
//        findMax();
//        existOrNot();
//        craeteArrayFromKeyboard();
        generateSequence1();
        generateSequence2();
    }
    public static void findAverage(){
        System.out.println("Average");
        int[] a= {50 , 60 , 78 , 84, 65};
        int numberOfElement = a.length;
        int total = 0;
        for (int i : a){
            total+=i;
        }
        double avg = (double) total/numberOfElement;
        System.out.println(avg);
    }
    public static void findMax(){
        int[] a = {50 , 65 , 23 , 74 , 49 ,83};
        int max = a[0];
//        for(int i = 1 ; i < a.length ; i++){
//            if(max < a[i]) max = a[i];
//        }
        for (int i : a){
            if(max < i) max = i;
        }
        System.out.println(max);
    }
    public static void existOrNot(){
        int[] a = {50 , 65 , 23 , 74 , 49 ,83};
        int numberToFind = 50;
        for (int i : a){
            if (numberToFind == i){
                System.out.println("Number Exist");
                return;
            }

        }
        System.out.println("Number is not exist");
    }
    public static void craeteArrayFromKeyboard(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the number of array Element you wanna crate : ");
        int element = sc.nextInt();
        int[] array = new int[element];
        for (int i = 0 ; i < element ; i++){
            System.out.print("Input array Elemment "+(i+1) + " : ");
            array[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(array));
    }
    public static void generateSequence1(){
        int[] a = new int[4];
        for (int i = 0 ; i < a.length ; i++){
            a[i] = (4*i) + 5;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void generateSequence2(){
        int[] a = new int[4];
        for (int i = 0 ; i < a.length ; i++){
            a[i] = (2*i) + 2;
        }
        System.out.println(Arrays.toString(a));
    }

}
