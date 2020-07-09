package com.vmodev.first;



import java.util.ArrayList;

import java.util.List;

public class DemoList {
    private List<Student> students;

    public DemoList() {
        students = new ArrayList<>();
    }

    public void createFiveStudents() {
        Student s = new Student();
        s.setName("Nguyen Van A");
        s.setAge(20);
        s.setPoint(10);
        students.add(s);

        s = new Student();
        s.setName("Nguyen Van B");
        s.setAge(21);
        s.setPoint(10);
        students.add(s);

        s = new Student();
        s.setName("Nguyen Van C");
        s.setAge(19);
        s.setPoint(8);
        students.add(s);

        s = new Student();
        s.setName("Quach Van keo");
        s.setAge(12);
        s.setPoint(5);
        students.add(s);

    }

    public void shortPointName() {

        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                Student s1 = students.get(i);
                Student s2 = students.get(j);
                if (s1.getName().compareTo(s2.getName()) > 0) {
                    students.set(i, s2);
                    students.set(j, s1);
                }

            }
        }
    }

    public void printAllStudent() {

    }
}
