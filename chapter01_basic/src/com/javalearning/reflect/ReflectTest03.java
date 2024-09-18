package com.javalearning.reflect;
// 反编译java.lang.String类

import java.lang.reflect.Modifier;

public class ReflectTest03 {
    public static void main(String[] args) throws Exception{
        Class stringClass = Class.forName("java.lang.String");

        StringBuilder sb = new StringBuilder();

        // 获取String类的modifier
        String classModifier = Modifier.toString(stringClass.getModifiers());
        sb.append(classModifier);
        sb.append(" ");

        // 获取类名
        String className = stringClass.getName();
        sb.append(className);
        sb.append(" extends ");

        // 获取父类
        Class superClass = stringClass.getSuperclass();
        sb.append(superClass.getName());

        // 获取interfaces
        Class[] stringInterfaces = stringClass.getInterfaces();
        if (stringInterfaces.length > 0) {
            sb.append(" implements ");
            for (int i = 0; i < stringInterfaces.length; i++) {
                sb.append(stringInterfaces[i].getName());
                if (i < stringInterfaces.length - 1) {
                    sb.append(", ");
                }
            }
        }

        sb.append(" {\n");
        sb.append("}");

        // 输出
        System.out.println(sb);
    }
}
