package com.company.Neuedu0205;

public class SalesEmployee extends ColaEmployee {
    private int monthSales;//月销售额
    private double royaltyRate;//提成率

    public SalesEmployee(String name, int month, int monthSales, double royaltyRate) {
        super(name, month);
        this.monthSales = monthSales;
        this.royaltyRate = royaltyRate;
    }

    @Override
    public double getSalary(int month) {
        if (super.month ==month){
            return monthSales*royaltyRate + 100;
        }else {
            return monthSales*royaltyRate;
        }
    }
}
