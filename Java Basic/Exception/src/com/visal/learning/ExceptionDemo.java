package com.visal.learning;

public class ExceptionDemo {
    static void main() {
        System.out.println("First Line");
        int a = 0;
        int b = 5;
        try{
            int result = b/a;
            System.out.println("result is " + result);
        }catch (ArithmeticException e){
            System.out.println("ArithmeticException");
            System.out.println(e.getMessage());
            e.printStackTrace();
            return;
        }finally {
            System.out.println("finally");
        }
        System.out.println("Second Line");
    }
}
