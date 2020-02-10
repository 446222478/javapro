package com.company;

import sun.plugin.viewer.frame.WNetscapeEmbeddedFrame;

import java.time.Year;

public class Main {
    public static void main(String[] args) {
        /*Dog d1 = new Dog();
        d1.setAge(200);
        int age = d1.getAge();
        d1.setNum(1);
        int num = d1.getNum();
        d1.setSex('男');
        char sex = d1.getSex();
        System.out.println(age);
        System.out.println(num);
        System.out.println(sex);*/
        /*runnian Y = new runnian();
        Y.setYear(1996);
        int year = Y.getYear();*/
        /*int i = 2;
        int sum = 0;
        int j = 500;
        while (i < j) {
            if (i==2||i==3||i==5||i==7){
                sum = sum + i;
                i++;
            }
            else if (i%2==0||i%3==0||i%5==0||i%7==0) {
                i++;
            }
            else{
                sum = sum + i;
                i++;
            }
        }
        System.out.println(sum);*/
        Circle circle = new Circle(3,"black");
        Rectangle rectangle = new Rectangle(3,4,"red");

        circle.getArea();
        circle.getPer();
        circle.showAll();

        rectangle.getArea();
        rectangle.getPer();
        rectangle.showAll();
    }
}