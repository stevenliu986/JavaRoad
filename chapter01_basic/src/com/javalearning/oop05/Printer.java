package com.javalearning.oop05;

public class Printer implements Usb {
    @Override
    public void read() {
        System.out.println("打印机开始读取数据。");
    }

    @Override
    public void write() {
        System.out.println("打印机开始打印文件。");
    }
}

