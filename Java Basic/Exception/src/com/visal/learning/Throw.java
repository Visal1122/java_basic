package com.visal.learning;

import java.io.FileNotFoundException;

public class Throw {
    static void main() throws Exception {
        int age = 17;
        if(age < 18) throw new RuntimeException("Age must be bigger than 18");
        System.out.println("Can vote");
        if(age < 19) throw new FileNotFoundException("Age must be bigger than 18");
        // use throw to raise your own exception using your own logic

    }
}
