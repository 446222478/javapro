package com.company;

public class test4 {
    public static void main(String[] args) {
        int array[] = {0,1,2,3,4,5,6,7,8,9};
        for(int i : array){
            for(int j : array){
                for(int k : array){
                    int sum = i*100 + j*10 + k;
                    int num = (int) (Math.pow(i,3) + Math.pow(j,3) + Math.pow(k,3));
                    if(sum>100){
                        if (sum==num){
                            System.out.println(sum);
                        }
                    }
                }
            }
        }
    }
}
