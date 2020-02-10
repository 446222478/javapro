package com.company;

public class Circle extends Shape {
    private double radius;

    @Override
    public void getArea() {
        area = radius*radius*3.14;
    }

    @Override
    public void getPer() {
        per = 2*radius*3.14;
    }

    @Override
    public void showAll() {
        System.out.println("圆的面积是"+area+";"+"圆的周长是"+per);
    }

    public Circle(int radius,String color){
        this.radius = radius;
        this.color = color;
    }

}
