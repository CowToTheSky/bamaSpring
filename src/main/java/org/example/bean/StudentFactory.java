package org.example.bean;

public class StudentFactory {
    public static Student createStudent() {
        System.out.println("欢迎来到电子厂!");
        return new Student();
    }
}
