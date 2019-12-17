package com.imooc.demospring;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author linckye
 */
public class Counter {

    private volatile int i = 0;

    public int getI() {
        return i;
    }

    public  void increment() {

        synchronized (this) {
            i++;
        }
    }

    public static void main(String[] args) {
        Integer a = 1;
        Integer b = 1;
        Integer c = 1101010;
        Integer d = 1101010;
        System.out.println(a == b);
        System.out.println(c == d);
    }
}
