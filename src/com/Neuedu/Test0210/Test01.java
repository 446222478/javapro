package com.Neuedu.Test0210;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PrintBook printBook = new PrintBook();
        System.out.println("---欢迎使用本图书系统---");
        while (true) {
            System.out.println("添加书请按1,查找书请按2,删除书请按3.退出请按0");
            int in = input.nextInt();
            if (in == 1) {
                System.out.println("请输入图书信息:");
                printBook.inputData();
            } else if (in == 2) {
                System.out.println("请输入需要查找图书名字:");
                printBook.searchName(input.next());
            }
            else if (in == 3){
                System.out.println("请输入要删除的图书名字:");
                printBook.deleteName(input.next());
            } else if (in == 0) {
                break;
            } else {
                System.out.println("暂时未开放此功能...");
            }
        }
        printBook.print();//最后显示所以书本
    }

}
