package com.company.Neuedu0205;

public  class HourlyEmployee extends ColaEmployee {

    private int hourSalary;//时薪
    private int hourNum;//每月工作的小时数

    public HourlyEmployee(String name, int month,int hourSalary,int hourNum) {
        super(name,month);
        this.hourSalary=hourSalary;
        this.hourNum=hourNum;
    }

    @Override
    public double getSalary(int month) {
        if (hourNum>=160){
            return hourSalary*160+hourSalary*(hourNum-160)*1.5;
        }else{
            return hourSalary*160;
        }
    }

}
