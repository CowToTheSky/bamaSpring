package org.example.bean;

public class ArtTeacher implements Teacher{
    @Override
    public void teach() {
        System.out.println("我可以教美术！");
    }
}
