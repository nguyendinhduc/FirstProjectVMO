package trung.lbq;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    private List<Student> students;

    public DemoList(){
        students = new ArrayList<>();
    }

    public void createFiveStudents(){
        Student s = new Student();
        s.setName("Messi");
        s.setAge(32);
        s.setPoint(10);
        students.add(s);
        
        s = new Students();
        s.setName("Ronaldo");
        s.setAge(34);
        s.setPoint(10);
        students.add(s);
        
        s = new Student();
        s.setName("Ibrahimovic");
        s.setAge(38);
        s.setPoint(9);
        students.add(s);

        s = new Student();
        s.setName("Neymar");
        s.setAge();
