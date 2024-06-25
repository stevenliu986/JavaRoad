package com.javalearning.oop06;

public class Test {
    public static void main(String[] args) {

        XiaoYanZi xiaoYanZi = new XiaoYanZi("小燕子", 2);
        xiaoYanZi.display();
        xiaoYanZi.eat();
        if (xiaoYanZi instanceof Flyable) { ((Flyable) xiaoYanZi).fly();}

        YingWu yingWu = new YingWu("鹦鹉", 3);
        yingWu.display();
        yingWu.eat();
        if (yingWu instanceof Flyable) {
            ((Flyable) yingWu).fly();
        }
        if (yingWu instanceof Speakable) {
            ((Speakable) yingWu).speak();
        }

        Dog dog = new Dog("狗狗", 6);
        dog.display();
        dog.eat();
        if (dog instanceof Flyable) {
            ((Flyable) dog).fly();
        }
        if (dog instanceof Speakable) {
            ((Speakable) dog).speak();
        }
    }
}

