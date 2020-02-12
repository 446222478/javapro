package com.Neuedu.Test0212;

import java.io.*;

public class Test02 {
    public static void main(String[] args) {
        /*int a = 10;
        Student student = new Student();
        student.setId(10);
        student.setName("黄顺");
        student.setAge(23);
        student.setGrade("卓越1班");
        File file = new File("d:\\Test.java");
        System.out.println(file.getName());
        System.out.println(file.length());
        System.out.println(file.exists());
        System.out.println(file.getPath());
        System.out.println(file.isDirectory());
        try {
            OutputStream outputStream = new FileOutputStream(file,true);
            String array = "\n11111111111";
            outputStream.write(array.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        /*File file = new File("d:\\Test.java");
        InputStream inputStream = null;
        try {
             inputStream = new FileInputStream(file);
            byte[] array = new byte[10];
            int b = inputStream.read(array);
            while(b!= -1){
                System.out.println("读取字节数:"+b);
                System.out.println(new String(array,0,b));
                b = inputStream.read(array);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        /*File file = new File("d:\\Test.java");
        Reader reader = null;
        BufferedReader br = null;
        try {
            reader = new FileReader(file);
            br = new BufferedReader(reader);
            String str = br.readLine();
            while(str!=null){
                System.out.println(str);
                str = br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(br!=null){
                    br.close();
                }
                if(reader!=null) {
                    reader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }*/
        File file = new File("d:\\Test.java");
        Writer writer = null;
        try {
            writer = new FileWriter(file,true);
            writer.write("11111111");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(writer!=null){
                    writer.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
