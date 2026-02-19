package com.visal.learning;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CheckedExceptionDemo {
    static void main() {
        File file = new File("/home/visal/Desktop/java_basic/Java Basic/Exception/src/storage/person.txt");
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Finally");
        }



    }
}
