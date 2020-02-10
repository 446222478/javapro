package com.company;

public class test5 {
    public static void main(String[] args) {
        int m = 600;
        int n = 256;
        int b = 0;
        /*最小公倍数*/
        for(int sum = 1; sum<= m*n;sum++ ){
            if(sum%m==0&&sum%n==0){
                System.out.println(sum);
                break;
            }
        }
        /*最大公约数*/
        for(int num = 1; num<=m&&num<=n;num++)
            if (m % num == 0 && n % num == 0) {
                b = num;
            }
        System.out.println(b);
    }
}
