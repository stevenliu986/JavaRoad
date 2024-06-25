package com.javalearning.threadConcept;

/**
 * 练习题：循环输出t1-->A,t2-->B,t3-->C 10次
 */

public class ThreadTest09 {
    private static final Object lock = new Object();
    private static boolean t1Output = true;
    private static boolean t2Output = false;
    private static boolean t3Output = false;
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        while (!t1Output) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                        System.out.println(Thread.currentThread().getName() + "-->A");
                        t1Output = false;
                        t2Output = true;
                        t3Output = false;
                        lock.notifyAll();
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        while (!t2Output) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                        System.out.println(Thread.currentThread().getName() + "-->B");
                        t1Output = false;
                        t2Output = false;
                        t3Output = true;
                        lock.notifyAll();
                    }

                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    for (int i = 0; i < 10; i++) {
                        while (!t3Output) {
                            try {
                                lock.wait();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }

                        }
                        System.out.println(Thread.currentThread().getName() + "-->C");
                        t1Output = true;
                        t2Output = false;
                        t3Output = false;
                        lock.notifyAll();
                    }
                }
            }
        }).start();
    }
}

