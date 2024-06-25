package com.javalearning.oop06;

public class XiaoYanZi extends Animal implements Flyable{
    public XiaoYanZi() {
    }

    public XiaoYanZi(String name, int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println(this.getName() + "捉虫吃。");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "飞啊飞。");
    }
}

