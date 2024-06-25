package com.javalearning.reflect;

/**
 * Java的反射机制，这是一套类库，可以帮助我们操作/读取class字节码文件
 * Java的许多框架都是基于反射机制的，所以有关它的相关方法要熟练掌握
 * java.lang.Class：Class类型的实例代表硬盘上某个class文件。
 * java.lang.reflect.Field：Field类型的实例代表类中的属性或字段
 * java.lang.reflect.Constructor：Constructor类型的实例代表类中的构造器
 * java.lang.reflect.Method：Method类型的实例代表类中的方法
 * <p>
 * java获取类（Class）的方式有三种：
 *  第一种：Class c = Class.forName("完整的全限定类名")
 *  第二种：Class c = obj.getClass()。这个方法是通过引用来调用的。
 *  第三种：在Java中，任一数据类型都可以使用.class来获取类
 */

public class ReflectTest01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 第一种方式
        // stringClass就代表String类型
        Class stringClass = Class.forName("java.lang.String");

        // 获取自定义类
        Class userClass = Class.forName("reflect.User");

        // 第二种方式
        // 使用getClass()来获取类
        String str01 = "Hello Java";
        Class stringClass1 = str01.getClass();

        System.out.println(stringClass == stringClass1);

        // 第三种方式
        Class intClass = int.class;
        Class stringClass2 = String.class;
    }
}

