package com.javalearning.oop06;

public class Dog extends Animal{
    public Dog() {
    }

    public Dog(String name,
               int age) {
        super(name, age);
    }

    @Override
    void eat() {
        System.out.println(this.getName() + "啃骨头。");
    }
}

