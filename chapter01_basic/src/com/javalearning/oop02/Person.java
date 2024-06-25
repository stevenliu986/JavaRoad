package com.javalearning.oop02;

public class Person {
    private String name;
    private int age;
    private boolean gender;
    private String address;
    private String occupation;

    public Person() {
    }

    public Person(String name, int age, boolean gender, String address, String occupation) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    void run(){
        System.out.println(name + "is running!");
    }
}

