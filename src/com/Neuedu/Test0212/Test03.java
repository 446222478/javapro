package com.Neuedu.Test0212;

public class Test03 {
    public static void main(String[] args) {
        /*
        //继承Tread类
        Test04Tread tread = new Test04Tread();
        Test04Tread tread1 = new Test04Tread();
        //入口  tread.run();
        tread.start();
        tread1.start();
        */

        /*
        //实现Runnable接口
        Test05Tread tread = new Test05Tread();
        Thread t = new Thread(tread);
        t.start();
        */


        //Lambda表达     匿名内部类

        //使用接口
        /*
        MyInterface jia = new Jia();
        MyInterface jian = new Jian();
        MyInterface cheng = new Cheng();
        MyInterface chu = new Chu();
        System.out.println(method(15,5,jia));
        //变体写法
        System.out.println(method(15,5,(a,b)->{
            return a%b;
        }));
        */

        Thread thread =new Thread(()->{
            for (int i = 0; i < 100 ; i++) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+"线程输出"+i);
            }
        });
        thread.start();


    }
    /*
    public static void eat(){}
    public static void drink(){}
    public static void talk(){}
    */

    public static int method(int a,int b,MyInterface myInterface){
        return myInterface.method(a,b);
    }
}
