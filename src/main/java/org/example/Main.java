package org.example;


import org.example.DTO.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("text");
        //通过反射机制创建对象
        Student student =(Student) context.getBean("student");
        System.out.println(student);
    }
}