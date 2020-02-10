package com.company.Neuedu0205;

public class SalariedEmployee extends ColaEmployee {

    double monSalary;

    public SalariedEmployee(String name, int month, double monSalary) {
        super(name,month);
        this.monSalary=monSalary;
    }

    @Override
    public double getSalary(int month) {

        return 0;
    }
}
