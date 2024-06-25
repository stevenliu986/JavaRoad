package com.javalearning.lambdaConcept;

import java.util.function.Supplier;

/**
 * 实例方法引用
 *      语法：对象::实例方法
 */

public class LambdaTest03 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("John");
        Teacher teacher2 = new Teacher("Jane", 33);
        Supplier<String> supplier1 = teacher::getName;
        System.out.println(supplier1.get());

        Supplier<Integer> supplier2 = teacher2::getAge;
        System.out.println(supplier2.get());
    }
}

class Teacher {
    private String name;
    private Integer age;

    public Teacher() {
    }

    public Teacher(String name) {
        this.name = name;
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }
}

