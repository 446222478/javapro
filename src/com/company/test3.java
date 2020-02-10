package com.company;

public class test3 {
    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        int sum = 1;
        int array[] = new int[n];
        for (int i = 0; i<n; i++) {
            array[i] = m;
            sum = sum * array[i];
        }
        System.out.println(sum);
    }
}
