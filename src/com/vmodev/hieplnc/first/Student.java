package com.vmodev.hieplnc.first;

public class Student {
    private String name;
    private int age;
    private int point;

    public Student(String name, int age, int point){
        this.name = name;
        this.age = age;
        this.point = point;
    }

    public Student(){ super(); }

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

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
