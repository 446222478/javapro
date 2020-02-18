package com.Neuedu.Test0218.web;

import com.Neuedu.Test0218.pojo.Student;
import com.Neuedu.Test0218.service.ServiceInterface;
import com.Neuedu.Test0218.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentWeb {
    ServiceInterface serviceInterface = new StudentService();
    public void showmain(){
        System.out.println("---------------------------");
        System.out.println("1----------------------查询");
        System.out.println("2----------------------添加");
        System.out.println("3----------------------修改");
        System.out.println("4----------------------删除");
        System.out.println("---------------------------");
    }
    public void input(){
        Scanner scanner =new Scanner(System.in);
        int i = scanner.nextInt();
        if (i==1){
            /*System.out.println("查询");*/
            query();
        } else if (i==2){
            add(scanner);
        } else if (i==3) {
            update(scanner);
        } else if (i==4){
            System.out.println("删除");
        } else{
            System.out.println("未知命令");
        }

    }

    public void query(){
        /*System.out.println("调用查询方法");*/
        //再次调用服务层提供的方法来访问数据库
        List<Student> list = serviceInterface.query();
        for (Student student :list){
            System.out.println(student);
        }

    }

    public void add(Scanner scanner){
        System.out.println("请输入添加的编号");
        int Sno = scanner.nextInt();
        System.out.println("请输入添加的姓名");
        String Sname = scanner.next();
        System.out.println("请输入添加的性别");
        String Ssex = scanner.next();
        System.out.println("请输入添加的年龄");
        int Sage = scanner.nextInt();
        System.out.println("请输入添加的班级");
        String Sdept = scanner.next();
        Student student = new Student(Sno,Sname,Ssex,Sage,Sdept);
        //调用服务层添加改数据
        serviceInterface.add(student);
        //显示列表
        query();
    }

    public void update(Scanner scanner){
        System.out.println("请输入修改的编号");
        int Sno = scanner.nextInt();
        System.out.println("请输入修改的姓名");
        String Sname = scanner.next();
        System.out.println("请输入修改的性别");
        String Ssex = scanner.next();
        System.out.println("请输入修改的年龄");
        int Sage = scanner.nextInt();
        System.out.println("请输入修改的班级");
        String Sdept = scanner.next();
        Student student = new Student(Sno,Sname,Ssex,Sage,Sdept);
        //调用服务层添加改数据
        serviceInterface.update(student);
        //调用服务层修改方法
        serviceInterface.update(student);
        //显示列表
        query();
    }

    public void del(Scanner scanner){
        System.out.println("请输入要删除的Sno");
        int Sno = scanner.nextInt();
        //调用服务层删除方法
        serviceInterface.del(Sno);
        //显示列表
        query();
    }
}
