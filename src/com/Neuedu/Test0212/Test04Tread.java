package com.Neuedu.Test0212;

public class Test04Tread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            try {
                Thread.sleep(500);//500毫秒后再抢占CPU
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"线程输出——"+i);
        }
    }
}
