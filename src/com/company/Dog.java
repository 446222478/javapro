package com.company;

public class Dog {
    private int age;
    private int num;
    private char sex;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if (age<1||age>150){
            System.out.println("年龄输入错误");
        }
        else {
            this.age = age;
        }
    }

}
