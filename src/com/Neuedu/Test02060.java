package com.Neuedu;

import com.sun.org.apache.xpath.internal.objects.XObject;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Test02060 {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        List linkdeList = new LinkedList();

        //创建数组比较
        Date startarraycreate = new Date();
        for (int i = 0; i <100000; i++) {
            arrayList.add(i);
        }
        Date endarraycreate = new Date();
        System.out.println("Arraylist创建时间"+(endarraycreate.getTime()-startarraycreate.getTime()));

        Date startlinkcreate = new Date();
        for (int i = 0; i <100000; i++) {
            linkdeList.add(i);
        }
        Date endlinkcreate = new Date();
        System.out.println("Linkedlist创建时间"+(endlinkcreate.getTime()-startlinkcreate.getTime()));

        //插入数组比较
        Date startarrayadd = new Date();
        for (int i = 0; i <100000; i++) {
            arrayList.add(0,i);
        }
        Date endarrayadd = new Date();
        System.out.println("Arraylist插入时间"+(endarrayadd.getTime()-startarrayadd.getTime()));

        Date startlinkadd = new Date();
        for (int i = 0; i <100000; i++) {
            linkdeList.add(0,i);
        }
        Date endlinkadd = new Date();
        System.out.println("Linkedlist插入时间"+(endlinkadd.getTime()-startlinkadd.getTime()));

        //数组读取比较
        Date startarrayride = new Date();
        for (int i = 0; i <100000; i++) {
            Object ary = arrayList.get(i);
        }
        Date endarrayride = new Date();
        System.out.println("Arraylist读取时间"+(endarrayride.getTime()-startarrayride.getTime()));

        Date startlinkride = new Date();
        for (int i = 0; i <100000; i++) {
            Object link = linkdeList.get(i);
        }
        Date endlinkride = new Date();
        System.out.println("Linkedlist读取时间"+(endlinkride.getTime()-startlinkride.getTime()));

    }
}
