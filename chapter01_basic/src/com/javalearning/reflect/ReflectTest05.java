package com.javalearning.reflect;

import java.lang.reflect.Constructor;

/**
 * 利用反射机制获取constructor，并有它创建对象
 */

public class ReflectTest05 {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("reflect.Order");

        // 获取无参构造器
        Constructor con = clazz.getDeclaredConstructor();
        // 使用无参构造器创建对象
        Object o = con.newInstance();
        System.out.println(o.toString());

        // 获取有参构造器
        Constructor stringCons = clazz.getDeclaredConstructor(String.class);
        Object o1 = stringCons.newInstance("123123");
        System.out.println(o1.toString());

    }
}
