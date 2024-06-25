package com.javalearning.threadConcept;

/**
 * 终止一段线程的睡眠
 */

public class ThreadTest05 {
    public static void main(String[] args) {
        // 创建线程并启动
       Thread t =  new Thread(() -> {
           System.out.println("线程启动了......");
           try {
               Thread.sleep(1000 * 60 * 60 * 24 * 365);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           // 睡眠一年后，重新启动
           System.out.println(Thread.currentThread().getName() + " do some!");
       });

       t.start();

        // 在主线程启动5秒后，模拟打断分线程睡眠，让其启动
        try {
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();

    }
}


