package com.company;

import javax.swing.*;

public abstract class Shape {
    public double area;//面积
    public double per;//周长
    public String color;//颜色

    public Shape(){

    }

    public Shape(String color) {
        this.color = color;
    }

    public abstract void getArea();
    public abstract void getPer();
    public abstract void showAll();
}
