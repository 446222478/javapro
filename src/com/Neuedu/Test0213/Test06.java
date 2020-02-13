package com.Neuedu.Test0213;

import java.util.concurrent.CountDownLatch;

public class Test06 {
    public static int a= 0;
    public static void main(String[] args) {
        /*Thread t = new Thread(()->{
            for (int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getName()+i);
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        CountDownLatch countDownLatch =new CountDownLatch(5000);//添加5000个锁
        Object obj = new Object();
        for (int i = 0; i < 5000; i++) {
            Thread t = new Thread(()->{
                synchronized (obj){
                    a++;
                    countDownLatch.countDown();//没调用一次，解一把锁
                }
            });
            t.start();
        }
        try {
            countDownLatch.await();//阻塞，等待全部锁解开为止
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(a);
    }
}
