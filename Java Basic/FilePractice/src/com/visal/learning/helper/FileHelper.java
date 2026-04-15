package com.visal.learning.helper;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
    static File file = new File("/home/visal/Desktop/java_basic/Java Basic/FilePractice/data.txt");
    public static void WriteToFile(String data){
        try {
            FileWriter writer = new FileWriter(file ,true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write(data);
            bufferedWriter.newLine();
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static List<String> ReadFromFile(){
        List <String> data = new ArrayList<>();
        try {
            FileReader reader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String st = bufferedReader.readLine();
            while (st!= null){
                data.add(st);
                st = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
}
