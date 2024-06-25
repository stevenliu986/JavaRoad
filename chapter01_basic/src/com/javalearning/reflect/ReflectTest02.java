package com.javalearning.reflect;
// 使用反射机制获取一个自定义类的所有属性、字段

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ReflectTest02 {
    public static void main(String[] args) throws Exception {
        Class vipClass = Class.forName("reflect.Vip");

        // 获取Vip类的所有属性
        Field[] fields = vipClass.getDeclaredFields();
        for (Field field : fields) {

            // 获取属性名
            String name = field.getName();
            System.out.println(name);

            // 获取属性类型
            Class fieldType = field.getType();
            System.out.println(fieldType.getSimpleName());

            // 获取属性的修饰符
            System.out.println(Modifier.toString(field.getModifiers()));
            System.out.println("=================");
        }
    }
}
