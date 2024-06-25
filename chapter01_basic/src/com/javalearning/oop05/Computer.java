package com.javalearning.oop05;

public class Computer {
    public void connect(Usb usb) {
        System.out.println("设备连接成功。");
        usb.read();
        usb.write();
    }
}
