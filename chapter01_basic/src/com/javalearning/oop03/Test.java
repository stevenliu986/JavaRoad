package com.javalearning.oop03;

public class Test {
    public static void main(String[] args) {
        Master m = new Master();
        m.feed(new Cat());
        m.feed(new Dog());

        EnglishPeople ep = new EnglishPeople();
        ep.setName("Jack");
        ep.greet();

        ChinesePeople cp = new ChinesePeople();
        cp.setName("李四");
        cp.greet();

    }
}

