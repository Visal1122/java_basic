package com.visal.learning;

public class MultipleExceptionDemo {
    static void main() {
        String[] name = {"Visal" , "Jing" , "Nan"};
        try {
            int number = 10/0;
            System.out.println(name[3]);

        }catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("Finish");
    }
}
