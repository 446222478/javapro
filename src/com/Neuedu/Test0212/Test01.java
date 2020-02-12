package com.Neuedu.Test0212;


import java.io.*;

public class Test01 {
    public static void main(String[] args) {
        File file = new File("d:/test01.java");
        File file1 = new File("d:/test02.java");
        OutputStream output = null;
        InputStream input = null;
        try {
            file.createNewFile();
            file1.createNewFile();
            output = new FileOutputStream(file);
            input = new FileInputStream(file);
            String a = "cgaklgakhaa";
            output.write(a.getBytes());
            System.out.println(input.read());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                output.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
