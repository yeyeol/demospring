package com.imooc.demospring;

/**
 * @author linckye
 */
public class Son extends Father {

    static {
        System.out.println("Son-static");
    }

    public Son() {
        System.out.println("Son-new");
    }

}
