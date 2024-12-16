package org.example.bean;

public class Student {
    private Teacher teacher;
    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    public void study(){
        teacher.teach();
    }
}
