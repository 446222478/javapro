package com.Neuedu.Test0213;

public class Test05Main {
    public static void main(String[] args) {
        /*
        //Tread类实现操作
        Test05 t1 = new Test05();
        Test05 t2 = new Test05();
        t1.start();
        t2.start();*/

        //Runnable接口的方式
        /*Runnable r = new Test05();
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);*/

        Test05 thread = new Test05();
        Thread t1 = new Thread(()->{
            thread.method1();
        });
        Thread t2 = new Thread(()->{
            thread.method2();
        });
        t1.start();
        t2.start();

    }
}
