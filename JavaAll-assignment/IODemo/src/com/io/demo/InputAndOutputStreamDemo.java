package com.io.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputAndOutputStreamDemo {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/pulkitpushkarna/a.txt");
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/pulkitpushkarna/abcd.txt");
        int b;
        while ((b=fileInputStream.read())!=-1){
            fileOutputStream.write(b);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
