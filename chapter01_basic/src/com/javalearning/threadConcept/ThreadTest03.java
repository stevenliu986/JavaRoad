package com.javalearning.threadConcept;

/**
 * ClassName: ThreadTest03
 * Package: chapter01_basic.src.ThreadConcept
 * Description: 使用匿名内部类创建线程
 *
 * @Author: Steven_LIU
 * @Create: 2024/6/15
 */
public class ThreadTest03 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("inner thread ---> " + i);
                }
            }
        });

        t.start();

        // 也可以这样创建线程
        /* new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("inner thread ---> " + i);
                }
            }
        }).start(); */

        for (int i = 0; i < 100; i++) {
            System.out.println("main thread ---> " + i);
        }
    }
}
