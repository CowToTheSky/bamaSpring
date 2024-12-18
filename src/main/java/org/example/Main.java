package org.example;


import org.example.bean.Student;
import org.example.bean.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        //ApplicationContext是应用程序上下文的顶层接口，它有很多种实现，这里我们先介绍第一种
        //因为这里使用的是XML配置文件，所以说我们就使用 ClassPathXmlApplicationContext 这个实现类
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");  //这里写上刚刚的名字
        context.close();
    }
}