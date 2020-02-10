package com.company;

public class test1 {
    public static void main(String[] args) {
        int array[] = {1,2,3,4};
        int num = 0;
        for(int i : array){
            for(int j : array){
                for (int k : array){
                    if (i!=j && j!=k && k!=i ){
                        num = i * 100 + j * 10 + k ;
                        System.out.println(num);
                    };
                }
            }
        }
    }
}
