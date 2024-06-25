package com.javalearning.oop03;

public class ChinesePeople extends Person {
    @Override
    public void greet() {
        System.out.println("来自" + this.getName()+ "的问候。");
    }
}

