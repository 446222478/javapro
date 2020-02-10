package com.company.Neuedu0205;

public abstract class ColaEmployee {
    public String name;
    public int month;

    public ColaEmployee(){

    }

    public ColaEmployee(String name , int month){
        this.month = month;
        this.name = name;
    }

    public abstract double getSalary(int month);

}
