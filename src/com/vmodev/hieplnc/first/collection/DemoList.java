package com.vmodev.hieplnc.first.collection;

import com.vmodev.hieplnc.first.Student;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    private List<Student> listStudent;

    public DemoList(){
        listStudent = new ArrayList<>();
    }

    public List<Student> getSt(){
        return listStudent;
    }

    public void setSt(List<Student> listStudent){
           this.listStudent = listStudent;
    }

    public void addSt(String name, int age, double point){
        listStudent.add(new Student(name, age, point));
    }

    public void sortName(){
        for(int i = 0; i < listStudent.size(); i++){
            for(int j = i + 1; j < listStudent.size(); j++){
                Student st1 = listStudent.get(i);
                Student st2 = listStudent.get(j);
                if(st1.getName().compareTo(st2.getName()) > 0){
                    listStudent.set(i, st2);
                    listStudent.set(j, st1);
                }
            }
        }
    }

    public void sortAge(){
        for(int i = 0; i < listStudent.size(); i++){
            for(int j = i + 1; j < listStudent.size(); j++){
                Student st1 = listStudent.get(i);
                Student st2 = listStudent.get(j);
                if(st1.getAge() > st2.getAge()){
                    listStudent.set(i, st2);
                    listStudent.set(j, st1);
                }
            }
        }
    }

    public void sortPoint(){
        for(int i = 0; i < listStudent.size(); i++){
            for(int j = i + 1; j < listStudent.size(); j++){
                Student st1 = listStudent.get(i);
                Student st2 = listStudent.get(j);
                if(st1.getPoint() < st2.getPoint()){
                    listStudent.set(i, st2);
                    listStudent.set(j, st1);
                } else if(st1.getPoint() == st2.getPoint()){
                    if(st1.getName().compareTo(st2.getName()) > 0){
                        listStudent.set(i, st2);
                        listStudent.set(j, st1);
                    }
                }
            }
        }
    }

    public void display(){
        System.out.println("List of student:");
        for(Student i : listStudent){
            i.display();
        }
    }
}
