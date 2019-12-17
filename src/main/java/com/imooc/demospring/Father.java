package com.imooc.demospring;

/**
 * @author linckye
 */
public class Father {

    static {
        System.out.println("Father-static");
    }

    public Father() {
        System.out.println("Father-new");
    }

}
