package com.io.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo {

    public static void main(String[] args) throws IOException {
        BufferedInputStream fileInputStream = new BufferedInputStream(new FileInputStream("/Users/pulkitpushkarna/a.txt"));
        BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream("/Users/pulkitpushkarna/abc.txt"));
        int b;
        while ((b=fileInputStream.read())!=-1){
            fileOutputStream.write(b);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
