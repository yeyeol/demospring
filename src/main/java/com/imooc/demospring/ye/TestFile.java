package com.imooc.demospring.ye;

import java.io.File;
import java.io.IOException;

/**
 * @author linckye
 */
public class TestFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/linckye/yy/yy.txt");
        System.out.println(file);
        System.out.println(file.exists());
        file.createNewFile();
    }
}
