package com.io.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderAndWriterDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/pulkitpushkarna/a.txt"));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/pulkitpushkarna/def.txt"));
        String string;
        while ((string=bufferedReader.readLine())!=null){
            bufferedWriter.write(string);
            bufferedWriter.newLine();
        }
        bufferedReader.close();
        bufferedWriter.close();
    }
}
