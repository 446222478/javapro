package com.company;

public class Rectangle extends Shape {
    private double width;
    private double height;

    @Override
    public void getArea() {
         area = width*height;
    }

    @Override
    public void getPer() {
         per = width*2+height*2;
    }

    @Override
    public void showAll() {
        System.out.println("面积是"+area+";"+"周长是"+per);
    }

    public Rectangle(){

    }

    public Rectangle(int width,int height,String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

}
