package org.example.bean;

public class ProgramTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("我可以教计算机！");
    }
}
