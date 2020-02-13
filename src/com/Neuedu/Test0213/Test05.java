package com.Neuedu.Test0213;

public class Test05 extends Thread{
    Object obj = new Object();
    private int count = 80;
    @Override
    public void run(){
        /*
        //Tread类实现操作
        while (count>0){
            System.out.println(Thread.currentThread().getName()+"卖出了"+count+"票");
            count--;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/

        //Runnable接口的方式
        while (count>0){
            synchronized (obj){//锁旗标
                System.out.println(Thread.currentThread().getName()+"卖出了"+count+"票");
                count--;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public synchronized void method1(){
        while (true){
            System.out.println("method1");
        }
    }
    public synchronized void method2(){
        while (true){
            System.out.println("method2");
        }
    }


    /*
    public synchronized void method(){

    }
    相当于
    public void method(){
        synchronized(this){

        }
    }
    */
}
