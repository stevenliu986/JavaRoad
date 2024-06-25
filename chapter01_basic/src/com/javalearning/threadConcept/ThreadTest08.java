package com.javalearning.threadConcept;

/**
 * 线程交替输出 t1-->1, t2-->2, t1-->3, t2-->4, ...
 * 该功能涉及到线程通信的问题及wait(), notify(), notifyAll()这三个方法
 */
public class ThreadTest08 {
    public static void main(String[] args) {
        MyRunnable08 mr = new MyRunnable08();
        Thread t1 = new Thread(mr);
        Thread t2 = new Thread(mr);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        t2.start();
    }
}

class MyRunnable08 implements Runnable {
    // 实例变量，多线程共享
    private int count = 0;

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                // 记得唤醒进入无限期等待的线程。
                // t2执行的过程中已经把t1唤醒了，但由于t2占用着对象锁，所以即便t1被唤醒也没关系
                this.notify();

                if (count >= 100) break;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "--> " + (++count));
                try {
                    // 让其中的一个线程等待，这个线程可能是t1也可能是t2。假设是t1
                    // 此时t1进入无限期等待，并且等待的时候，不占用对象锁
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
