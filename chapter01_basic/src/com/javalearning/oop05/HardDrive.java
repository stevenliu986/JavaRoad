package com.javalearning.oop05;

public class HardDrive implements Usb {
    @Override
    public void read() {
        System.out.println("硬盘开始读取数据。");
    }

    @Override
    public void write() {
        System.out.println("硬盘开始写入数据。");
    }
}

