package com.visal.learning;

public class Computer {
    private String model;
    protected class  CPU{
        private int core;
        private String type;

        public CPU(int core, String type) {
            this.core = core;
            this.type = type;
        }

        public void info(){
            display();
            System.out.println("Number of core " + core);
            System.out.println("CPU Type " + type);
        }
    }
    static class Ram{
        private int memorySize;
        void showRamInfo(){
            System.out.println("Ram info");
        };

    }
    public void display(){
        System.out.println("This is a computer "+ model);
    }

    public Computer(String model) {
        this.model = model;
    }
}
