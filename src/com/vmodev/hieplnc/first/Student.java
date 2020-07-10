package com.vmodev.hieplnc.first;

public class Student {
    private String name;
    private int age;
    private double point;

    public Student(String name, int age, double point){
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

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public void display(){
        System.out.println("Student: " + name);
        System.out.println("Age: " + age);
        System.out.println("Point: " + point + "\n");
    }
}
