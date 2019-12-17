package com.imooc.demospring;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author linckye
 */
public class Reflect {

    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("com.imooc.demospring.A");
        Object o = aClass.newInstance();
        Method method = aClass.getDeclaredMethod("incrementAndGet",int.class);
        Object result = method.invoke(o, 3);
        Field field = aClass.getDeclaredField("value");
        field.setAccessible(true);
        System.out.println(result);
        System.out.println(field.get(o));
    }

}
