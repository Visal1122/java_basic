package com.visal.learning;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
    static void main() {
        try {
            String text = "Write to the file using OutputStream";
            String text2 = "I append the text";
            FileOutputStream write = new FileOutputStream("/home/visal/Desktop/java_basic/Java Basic/File/text2.txt" , true);
            write.write(text2.getBytes());
            write.close();
            System.out.println("Finish");

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
