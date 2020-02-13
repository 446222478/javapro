package com.Neuedu.Test0213;

import java.util.ArrayList;
import java.util.List;

public class Test04 {
    public static void main(String[] args) {
        System.out.println(method(1000));
    }

    public static int method(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n ; i++) {
            list.add(i);
        }
        int m = 1;
        while (list.size()>1){
            if (m!=3){
                list.add(list.remove(0));
                m++;
            }
            else {
                list.remove(0);
                m = 1;
            }
        }
        return (int) list.get(0);
    }
}
