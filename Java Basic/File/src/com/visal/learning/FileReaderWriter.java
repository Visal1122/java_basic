package com.visal.learning;

import java.io.*;

public class FileReaderWriter {

    static void main() {
//        try {
//            char[] text = new char[100];
//            Reader reader = new FileReader("/home/visal/Desktop/java_basic/Java Basic/File/text.txt");
//            System.out.println(reader.ready());
//            reader.read(text);
//            System.out.println(text);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        try {
            String text = " I append another text using Writer ";
            Writer writer = new FileWriter("/home/visal/Desktop/java_basic/Java Basic/File/text2.txt" , true);
            writer.write(text);
            writer.close();
            System.out.println("Finish");



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
