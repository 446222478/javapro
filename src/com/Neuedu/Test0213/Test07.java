package com.Neuedu.Test0213;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Test07 {
    /*public static int a= 0;*/
    /*public static List list = new Vector<>();*/
    /*public static ArrayList list = new ArrayList();*/
    /*public static StringBuilder stringBuilder = new StringBuilder();*/
    public static StringBuffer stringBuffer = new StringBuffer();
    public static void main(String[] args) {
        CountDownLatch countDownLatch =new CountDownLatch(5000);//添加5000个锁
        Semaphore semaphore = new Semaphore(2);//信号量
        for (int i = 0; i < 5000; i++) {
            Thread t = new Thread(()->{
                try {
                    /*semaphore.acquire();//用之前那一个信号
                    a++;
                    countDownLatch.countDown();//没调用一次，解一把锁
                    semaphore.release();//用之后放一个信号*/
                    /*list.add(1);*/
                    /*stringBuilder.append("aaa");*/
                    stringBuffer.append("aaa");
                    countDownLatch.countDown();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            });
            t.start();
        }
        try {
            countDownLatch.await();//阻塞，等待全部锁解开为止
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuffer.length());
    }
}
