package com.company;

public class leijia {
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        for (int i = 1; i<=100; i++){
            num = i + num;
        }
    }
    public static int abc(int a , int b){
        int c = a + b;
        return c;
    }
}
