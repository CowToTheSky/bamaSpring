package org.example;


import org.example.DTO.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //通过反射机制创建对象，通过IoC容器管理的JavaBean是单例模式
        Student student =(Student) context.getBean("student");
        System.out.println(student);
        //手动销毁容器
        context.close();
    }
}