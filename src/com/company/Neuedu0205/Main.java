package com.company.Neuedu0205;

public class Main {
    public static class Company {
        //	打印出某月某个员工的工资数额
        public void getSalary(ColaEmployee c,int month) {
            System.out.println(c.name + "在" + month +
                    "月的月薪为" + c.getSalary(month)+"元");
        }
    }
    public static void main(String[] args) {
        //创建、初始化数组
        ColaEmployee[] cel = {
                new SalariedEmployee("salariedEmployee", 6, 30000),//name,month,月薪
                new HourlyEmployee("hourlyEmployee", 5, 100, 300),//name,month,时薪,小时数
                new SalesEmployee("salesEmployee", 3, 7000000, 0.3)//name,month,月销售额，提成率
        };
        //数组遍历
        for (int i = 0; i < cel.length; i++) {
            new Company().getSalary(cel[i],7);
        }
    }
}
