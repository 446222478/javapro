package com.Neuedu.Test0210;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PrintBook {
    Scanner input=new Scanner(System.in);
    ArrayList<Mybook> books=new ArrayList<>();

    //输入
    public void inputData(){
        System.out.print("请输入书本名称,");
        System.out.println("请输入书本价格:");
        System.out.print("请输入出版社,");
        System.out.println("请输入本书的作者:");
        System.out.print("请输入书的ISBN号,");
        Mybook book=new Mybook(input.next(),input.nextDouble(),input.next(),input.next(),input.next());
        books.add(book);
        System.out.println("添加成功");
    }

    //输出
    public void print(){
        Iterator<Mybook> it = books.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    //查找
    public void searchName(String searchname){
        Iterator<Mybook> it = books.iterator();
        Mybook searchbook;
        for (int i = 0; i <books.size(); i++) {
            searchbook = books.get(i);
            if (searchname.equals(searchbook.getName()))
            {
                System.out.println(searchbook.toString());
            }
        }
    }

    //删除
    public void deleteName(String deletename){
        Iterator<Mybook> it = books.iterator();
        Mybook deletebook;
        while (it.hasNext()){
            deletebook=it.next();
            if (deletebook.getName()==deletename){
                it.remove();
            }else{
                System.out.println("该图书不存在");
            }
        }
    }
}
