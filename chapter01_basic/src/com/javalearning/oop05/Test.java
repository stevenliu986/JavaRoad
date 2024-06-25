package com.javalearning.oop05;

public class Test {
    public static void main(String[] args) {
        HardDrive hardDrive = new HardDrive();
        Computer computer = new Computer();
        computer.connect(hardDrive);

        Printer printer = new Printer();
        computer.connect(printer);
    }
}
