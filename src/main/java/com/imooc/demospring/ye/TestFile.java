package com.imooc.demospring.ye;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author linckye
 */
//IO流
public class TestFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/linckye/yy/yy.txt");
        System.out.println(file.getAbsolutePath());
        System.out.println(file.exists());
        bufferedInputStreamTest(file);
    }
    /*字节输出流*/
    private static void fileOutputStreamTest(File file,byte[] bytes) throws IOException {
        OutputStream outputStream = new FileOutputStream(file,true);
        outputStream.write(bytes);
        outputStream.close();
    }
    /*字节输入流*/
    private static void fileInputStreamTest(File file) throws IOException{
        InputStream inputStream = new FileInputStream(file);
        //获取第一个字节
        int i = inputStream.read();
        System.out.println((char) i);
        //获取多个字节
        byte[] b = new byte[10];
        inputStream.read(b);
        System.out.println(Arrays.toString(b));
        System.out.println(new String(b));
        inputStream.close();
    }
    /*字节缓冲输入流*/
    private static void bufferedInputStreamTest(File file) throws IOException{
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        byte[] b = new byte[1024];
        int len = -1;
        while ((len = bufferedInputStream.read(b)) != -1) {
            System.out.println(new String(b ,0, len));
        }

    }



    /*字符输出流*/
    private static void fileWriterTest(File file, String s) throws IOException{
        Writer w = new FileWriter(file);
        w.write(s);
        w.close();
    }
    /*字符输入流*/
    private static void fileReaderTest(File file) throws IOException{
        Reader r = new FileReader(file);
        //一个个读，全部读完
        int i = -1;
        while((i = r.read()) != -1){
            System.out.print((char) i);
        }
        System.out.println();
        //读取多个
        char[] c = new char[10];
        r.read(c);
        System.out.println(new String(c));
        r.close();
    }

}
