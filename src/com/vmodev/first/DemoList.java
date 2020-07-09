package com.vmodev.first;

import java.util.List;

public class DemoList {
    private List<Student> students;

    public static void createStudent(){
        Student s   =   new Student();
        s.setName("Nguyen Van A");
        s.setAge(10);
        s.setPoint(8);

        Student s1  =   new Student();
        s.setName("Nguyen Van B");
        s.setAge(10);
        s.setPoint(7);


    }

    public void shortName(){
        for(int i=0; i<students.size()-1; i++){
            for(int j=i+1; j<students.size();j++){
                Student s1 = students.get(i);
                Student s2 = students.get(j);
                if (s1.getName().compareTo(s2.getName())>0){
                    students.set(i,s2);
                    students.set(j,s1);
                }
            }
        }
    }
}
