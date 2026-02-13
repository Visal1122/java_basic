package com.visal.learning;

public class car {
    String color;
    int numberOfWheel;
    double price;
    void drive(){
        System.out.print("Car Drive");
    }
    void info(){
        System.out.println("Color " + color + " Number Of wheel " + numberOfWheel + " Price " + price);
    }


    public static void main(String[] args) {
//        car car = new car();
//        car.drive();
//        System.out.println(car.numberOfWheel);
//        System.out.println(car.price);
        car sportCar = new car();
        car touringCar = new car();

        sportCar.color = "red" ;
        sportCar.numberOfWheel = 4;
        sportCar.price = 500000;

        touringCar.color = "white";
        touringCar.numberOfWheel = 6;
        touringCar.price = 25000;

        System.out.print(sportCar.color + " ");
        sportCar.drive();
        System.out.println(" has " + sportCar.numberOfWheel + " and the price is " + sportCar.price);

        touringCar.info();
    }
}
