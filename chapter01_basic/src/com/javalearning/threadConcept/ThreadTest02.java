package com.javalearning.threadConcept;

/**
 * ClassName: ThreadTest02
 * Package: chapter01_basic.src.ThreadConcept
 * Description: 实现线程的第二咱方式，推荐使用这种方式创建线程
 *
 * @Author: Steven_LIU
 * @Create: 2024/6/15
 */
public class ThreadTest02 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("Main Thread --->" + i);
        }
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("MyRunnable --->" + i);
        }
    }
}
