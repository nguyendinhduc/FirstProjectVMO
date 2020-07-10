package NgocDo.ListExcercise;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
    private List<Student> students;

    public ListStudent() {
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

    public void sortByPointName() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                Student s1 = students.get(i);
                Student s2 = students.get(j);
                if (s1.getPoint() > s2.getPoint()) {
                    students.set(i, s2);
                    students.set(j, s1);
                }else if ( s1.getPoint() == s2.getPoint()){
                    if(s1.getName().compareTo(s2.getName()) > 0){
                        students.set(i, s2);
                        students.set(j, s1);
                    }
                }
            }
        }
    }

    public void sortByName() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                Student s1 = students.get(i);
                Student s2 = students.get(j);
                if(s1.getName().compareTo(s2.getName()) > 0) {
                    students.set(i, s2);
                    students.set(j, s1);
                }
            }
        }
    }

    public void sortByAge() {
        for (int i = 0; i < students.size() - 1; i++) {
            for (int j = i + 1; j < students.size(); j++) {
                Student s1 = students.get(i);
                Student s2 = students.get(j);
                if (s1.getAge() > s2.getAge()) {
                    students.set(i, s2);
                    students.set(j, s1);
                }
            }
        }
    }

    public void printAllStudent() {
        for (int i = 0; i < students.size(); i++) {
            Student s1 = students.get(i);
            s1.printInfo();
        }
    }
}
