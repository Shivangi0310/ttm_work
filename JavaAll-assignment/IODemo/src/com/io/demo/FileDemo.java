package com.io.demo;

import java.io.File;
import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        File file = new File("/Users/pulkitpushkarna/a.txt");
        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.getParent());
        System.out.println(file.getPath());


        File file1 = new File("MyDir");
//        file1.mkdir();
        for (File file2: file1.listFiles()){
            System.out.println(file2.getName());
        }

    }
}
