package com.javalearning.threadConcept;

/**
 * 终止一段正在执行的线程。在实际的开发中，通常使用打标记的方式来终止一个线程
 */

public class ThreadTest06 {
    public static void main(String[] args) {
        MyRunnable03 mr = new MyRunnable03();
        Thread t1 = new Thread(mr);
        t1.start();

        // 5秒后线程停止
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        mr.run = false;

    }
}

class MyRunnable03 implements Runnable {
    boolean run = true;
    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "---=>" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                return;
            }
        }
    }
}
