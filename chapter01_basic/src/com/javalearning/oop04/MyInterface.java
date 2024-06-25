package com.javalearning.oop04;

/**
 * 接口
 */
public interface MyInterface {
    int num1 = 0;
    int num2 = 0;

    void m1();

    void m2();

    // JDK8之后，可以在接口内定义默认方法和静态方法
    // 默认方法，默认方法必须要有方法体且使用default来声明，默认方法可以不用在实现它的类中进行重写
    default void defaultMethod() {
        System.out.println("defaultMethod执行了");
    }

    // 静态方法，其中的public可以省略，但该静态方法只能通过该接口名进行调用，如：MyInterface.staticMethod()
    public static void staticMethod() {
        System.out.println("staticMethod执行了");
    }

    // JDK9之后，允许定义私有的实例方法，这些方法是为默认方法服务的
    private void privateMethod() {
        System.out.println("privateMethod执行了");
    }

    // JDK9之后，允许定义私有的静态方法，这些方法是为静态方法服务的
    private static void privateStaticMethod() {
        System.out.println("privateStaticMethod执行了");
    }
}

interface A {
    void a();
}

interface B {
    void b();
}

interface C extends A, B {
    void c();
}

class MyInterfaceImpl implements MyInterface, C {
    @Override
    public void c() {
        System.out.println("c执行了");
    }

    @Override
    public void a() {
        System.out.println("a执行了");
    }

    @Override
    public void b() {
        System.out.println("b执行了");
    }

    @Override
    public void m1() {
        System.out.println("m1执行了");
    }

    @Override
    public void m2() {
        System.out.println("m2执行了");
    }
}

