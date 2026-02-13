package com.visal.learning;

import java.util.Arrays;

public class ArrayOperation {
    public static void main(String[] args) {
//        addNewElement();
//        addNewElementAtSpecificIndex();
//        updateElements();
//        deleteElementByIndex();
//        deleteAllElementByValue();
//        deleteFirstElementByValue();
        addManyEelementToSpecificIndex();
    }
    public static void addNewElement(){
        int[] a = {23,45,24,12};
        int newElement = 32;
        int[] b = new  int[a.length+1];
        for(int i = 0 ; i < a.length ; i++){
            b[i] = a[i];
        }
        b[b.length-1] = newElement;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }public static void addNewElementAtSpecificIndex(){
        int[] a = {23,45,24,12};
        int newElement = 32;
        int index = 1;
        int decrease = 0;
        int[] b = new int[a.length+1];
        for(int i = 0 ; i < b.length ; i++){
            if(i == index){
                b[i] = newElement;
                decrease = -1;
                continue;
            }
            b[i] = a[i+decrease];


        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    public static void updateElements(){
        int[] a = {23 , 65 , 74 , 12};
        for(int i = 0 ; i < a.length ; i++){
            if(a[i] > 60) a[i] += 20;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void deleteElementByIndex(){
        int[] a = {23 , 65 , 74 , 12 , 50};
        int index =2;
        int[] b = new int[a.length-1];
        int increase =0;
        for (int i = 0 ; i < b.length ; i++){
            if(i == index){
                increase = 1;
            }
            b[i] = a[i+increase];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    public static void deleteAllElementByValue(){
        int[] a = {23 , 65 , 74 , 12 , 50 , 23 , 40};
        int value = 23;
        int newIndex = 0;
        int increase = 0;
        for (int i : a){
            if(i != value) newIndex++;
        }
        int[] b = new int[newIndex];
        for(int i = 0 ; i < a.length ; i++){
            if (a[i] != value) {
                b[increase] = a[i];
                increase++;
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    public static void deleteFirstElementByValue(){
        int[] a = {23 , 65 , 74 , 12 , 50 , 23 , 40};
        int value = 23;
        int newIndex = 0;
        int increase = 0;
        boolean isTrue = false;
        for (int i : a){
            if(i != value && !isTrue){
                newIndex++;
                isTrue = true;
            }
        }
        isTrue =false;
        int[] b = new int[a.length - newIndex];
        for(int i = 0 ; i < a.length ; i++){
          if(a[i] == value && !isTrue){
              increase--;
              isTrue = true;
              continue;

          }
          b[i+increase] = a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
    public static void addManyEelementToSpecificIndex(){
        int[] a = {23 , 65 , 74 , 12 , 50 , 23 , 40};
        int indexToAdd = 3;
        int[] b = { 100 , 200 , 300};
        int[] c = new int[a.length+b.length];
        int increase = 0;

        for (int i =  0 ; i < a.length ; i++){
            if(i == indexToAdd){
                for (int j = 0 ; j<b.length ; j++){
                    c[i+increase] = b[j];
                    increase++;
                }
            }
            c[i+increase] = a[i];
        }
        System.out.println(Arrays.toString(c));
    }
}
