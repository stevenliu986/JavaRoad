package com.javalearning.oop06;

public class YingWu extends Animal implements Flyable, Speakable {
    public YingWu() {
    }

    public YingWu(String name,
                  int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println(this.getName() + "吃面包。");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + "飞啊飞。");
    }

    @Override
    public void speak() {
        System.out.println(this.getName() + "学舌。");
    }
}

