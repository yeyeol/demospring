package com.imooc.demospring.ye;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author linckye
 */
public class Reflect {
    public static void main(String[] args) throws Exception{
        Class<?> classbook = Class.forName("com.imooc.demospring.ye.Book");
//        Object instance = classbook.newInstance();
        Constructor<?> constructor = classbook.getDeclaredConstructor(String.class,String.class);//反射私有构造函数
        constructor.setAccessible(true);
        Object instance = constructor.newInstance("name1","author1");//通过构造函数新建实例对象
        Method setName = classbook.getDeclaredMethod("setName", String.class);
        setName.invoke(instance,"name2");
        Field name = classbook.getDeclaredField("name");
        Field author = classbook.getDeclaredField("author");
        name.setAccessible(true);
        author.setAccessible(true);
        System.out.println(author.get(instance));
        final Method[] declaredMethods = classbook.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }
}
}
