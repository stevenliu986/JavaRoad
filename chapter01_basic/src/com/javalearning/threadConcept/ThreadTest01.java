package com.javalearning.threadConcept;

/**
 * ClassName: ThreadTest01
 * Package: chapter01_basic.src.ThreadConcept
 * Description: 在Java中，实现线程有2种方式
 *      第一种：
 *          1. 编写一个类继承java.lang.Thread
 *          2. 重写run方法
 *          3. new线程对象
 *          4. 调用线程对象的start方法来启动线程
 *
 * @Author: Steven_LIU
 * @Create: 2024/6/15
 */
public class ThreadTest01 {
    public static void main(String[] args) {
        // 创建线程
        MyThread mt = new MyThread();
        mt.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread --->" + i);
        }
    }
}

/**
 * 自定义一个线程类，java.lang.Thread本身就是一个线程。MyThread继承Thread，因此，MyThread本身也是一个线程
 */

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyThread --->" + i);
        }
    }
}


