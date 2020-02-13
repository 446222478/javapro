package com.Neuedu.Test0213;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

    public static void main(String[] args) {
        List list = new ArrayList();
        Long a = 0L;
        Long b = 1L;
        Long num = 0L;
        list.add(0,1);
        for (int i = 1; i < 50 ; i++) {
            num = a + b;
            a = b;
            b = num;
            list.add(i,num);
        }

        System.out.println(list);
    }

}
