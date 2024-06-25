package com.javalearning.threadConcept;

/**
 * 线程休眠
 */

public class ThreadTest04 {
    public static void main(String[] args)  {
        Thread  t = new Thread(new MyRunnable02());
        t.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
}

class MyRunnable02 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}