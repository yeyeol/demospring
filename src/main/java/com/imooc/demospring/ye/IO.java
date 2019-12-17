package com.imooc.demospring.ye;

import java.io.IOException;

/**
 * @author linckye
 */
public class IO {
    public static void main(String[] args) {
        try{
            System.out.println("please input");
            Integer b;
            b = System.in.read();
            while(b != -1){
                System.out.println(b);
            }
        }catch (IOException e){
            System.out.println(e.toString());
        }

    }
}
