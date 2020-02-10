package com.company;

public class test0205_1 {
    public static void main(String[] args) {
        int array[] = {12,38,9,47,16,32,55,104,98,99};
        int flat = 0;
        for(int i= 0;i < array.length-1;i++){
            for (int j = 0;j < array.length-1-i;j++){
                if (array[j]>array[j+1]){
                    int num = array[j+1];
                    array[j+1] = array[j];
                    array[j] = num;
                    flat++;
                }
            }
            if (flat==0){
                break;
            }
        }
        for (int a :array){
            System.out.println(a);
        }
    }
}
