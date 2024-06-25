package com.javalearning.threadConcept;

/**
 * 线程同步机制面试题：分析以下程序m2在执行的时候需要等待m1方法结束吗？
 *                      是的。因为m1和m2共享同一个mc（mc就创建了一次），所以它们使用同一个锁。如果m2方法前面没有synchronized这个关键字，
 *                      则m2不会等待m1执行完再执行。
 *                      如果t1和t2创建的时候传进去的是不同的对象，则m2不需要等待m1很乖完毕才执行
 *  注意：如果是在静态方法上添加synchronized，线程就会占有类锁。对于一个类来说，无论创建了多少个对象，类锁只有一把。
 */
public class ThreadTest07 {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        Thread t1 = new Thread(new MyRunnable07(mc));
        Thread t2 = new Thread(new MyRunnable07(mc));

        /* new了两个对象(mc1和mc2)，此时，m2不需要等待m1很乖完毕才执行
            MyClass mc1 = new MyClass();
            MyClass mc2 = new MyClass();
            Thread t1 = new Thread(new MyRunnable07(mc1));
            Thread t2 = new Thread(new MyRunnable07(mc2));
        */

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}

class MyRunnable07 implements Runnable {
    private MyClass mc;

    public MyRunnable07(MyClass mc) {
        this.mc = mc;
    }

    @Override
    public void run() {
        if ("t1".equals(Thread.currentThread().getName())) {
            mc.m1();
        }
        if ("t2".equals(Thread.currentThread().getName())) {
            mc.m2();
        }
    }
}

class MyClass {
    public synchronized void m1() {
        System.out.println("m1 begin");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("m1 end");
    }

    public synchronized void m2() {
        System.out.println("m2 begin");
        System.out.println("m2 end");
    }
}
