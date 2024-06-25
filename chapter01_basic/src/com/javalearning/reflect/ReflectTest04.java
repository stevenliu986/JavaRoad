package com.javalearning.reflect;
// 反射机制中的Method

import java.lang.reflect.Method;

public class ReflectTest04 {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();
        // 获取类名
        Class clazz = Class.forName("reflect.UserService");

        // 获取方法
        Method loginMethod = clazz.getDeclaredMethod("login", String.class, String.class);
        Object returnValue = loginMethod.invoke(userService, "admin", "admin");
        System.out.println(returnValue);
    }
}
