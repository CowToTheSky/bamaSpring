package org.example.bean;

public class Student {
    private Teacher teacher;
    //实际上只要set后字母大写，就可以实现自动装配
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void study(){
        teacher.teach();
    }
}

