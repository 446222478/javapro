package com.Neuedu.Test0213;

public class Test02 {
    public static void main(String[] args) {
        double a = 100;
        int n = 10;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum = a/2;
            a = sum;
        }
        System.out.println("第十次落地后反弹到"+sum+"米");
    }
}
