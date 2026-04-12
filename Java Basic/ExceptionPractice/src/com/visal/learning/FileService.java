package com.visal.learning;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileService {
    static void Save(String data){
        String path = System.getProperty("user.dir");
        String FileLocation = path+"/voter.txt";
        try {
            FileWriter fileWriter = new FileWriter(FileLocation);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(path);
    }

}
