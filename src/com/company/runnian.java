package com.company;

public class runnian {
    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if ((year%100!=0&&year%4==0)||year%400==0){
            System.out.println("是闰年");
        }
        else{
            System.out.println("不是闰年");
        }

    }
}
