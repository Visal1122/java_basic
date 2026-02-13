package com.visal.learning;

public class Homework {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 2 ; i<= 20 ; i++){
            if(i%5!=0){
                sum+=i;
//                System.out.println(i);
            }
        }
        System.out.println(sum);
        sum = 0;
        int i = 2;
        while (i<=20){
            if(i%5!=0){
                sum+=i;
            }
            i++;
        }
        System.out.println(sum);
        sum = 0;
        i =2;
        do{
            if(i%5!=0){
                sum+=i;
            }
            i++;
        }while (i<=20);
        System.out.println(sum);
        sum = 0;
        i=2;
        while (true){
            if (i%5!=0){
                sum+=i;
            }
            if (i == 20)break;
            i++;
        }
        System.out.println(sum);
        sum = 0;
        i=2;
        do{
            if (i%5!=0) {
                sum += i;
                i++;
            }else {
                i++;
                continue;
            }
        }while (i<=20);
        System.out.println(sum);


        for (i = 5 ; i>=1 ; i--){
            for (int j = 1 ; j<= i ; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
