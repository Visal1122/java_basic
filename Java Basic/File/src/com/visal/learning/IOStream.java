package com.visal.learning;

import com.sun.security.jgss.GSSUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class IOStream {
    static void main() {
        byte[] myData = new byte[100];
        try {
            InputStream readFile = new FileInputStream("/home/visal/Desktop/java_basic/Java Basic/File/text.txt");
            System.out.println(readFile.available());
            readFile.read(myData);
//            System.out.println(Arrays.toString(myData));
//            for (byte b : myData){
//                System.out.print((char) b);
//            }

            String outPut = new String(myData);
            System.out.println(outPut);
            System.out.println(readFile.available());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
