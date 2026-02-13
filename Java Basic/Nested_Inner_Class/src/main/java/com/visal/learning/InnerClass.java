package com.visal.learning;

public class InnerClass {
    public static void main(String[] args) {
        Computer computer =new Computer("Dell");
        Computer.CPU cpu1 =  computer.new CPU(8 , "AMD");
//        computer.display();
        cpu1.info();
        Computer.Ram ram1 = new Computer.Ram();
        ram1.showRamInfo();
    }


}
