package com.javalearning.oop03;

public class EnglishPeople extends Person {
    @Override
    public void greet() {
        System.out.println("Greetings from " + this.getName());
    }
}

