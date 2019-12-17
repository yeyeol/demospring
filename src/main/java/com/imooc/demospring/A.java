package com.imooc.demospring;

/**
 * @author linckye
 */
public class A {
    private int value;
    public int incrementAndGet(int add) {
        value = value + add;
        return value;
    }

}
