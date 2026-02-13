package com.visal.learning;

public class DemoMethodOverload {
    public static void main(String[] args) {
        print("Welcome");
        print(23);
        print("Coca" , 21 );
        int[] a = {1 , 3 , 5, 2 , 6};
        print(a);
        varargPrint(1 , 3, 4, 5, 8, 2);
        varargPrint("coca" , 10 , 20 ,3);
    }
    public static void print(String string){
        System.out.println(string);
    }
    public static void print(Integer num){
        System.out.println(num);
    }
    public static void print(String property , int value){
        System.out.println(property + " = " + value);
    }
    public static void print(int[] a){
        for (int n : a ){
            System.out.println(n);
        }
    }
    public static void varargPrint(int... a){
        for(int n : a){
            System.out.println(n);
        }
    }
    public static void varargPrint(String name , int... a){
        System.out.println(name);
        for(int n : a ){
            System.out.println(n);
        }
    }

}
