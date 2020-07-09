package com.vmodev.hieplnc.first.collection;

import com.vmodev.hieplnc.first.Student;

import java.util.List;

public class DemoList {
    private List<Student> listStudent;

    public List<Student> getSt(){
        return listStudent;
    }

    public void setSt(List<Student> listStudent){
           this.listStudent = listStudent;
    }

    public void sortName(){
        for(int i = 0; i < listStudent.size(); i++){
            for(int j = i + 1; j < listStudent.size(); j++){
                Student st1 = listStudent.get(i);
                Student st2 = listStudent.get(i);
                if()
            }
        }
    }
}
