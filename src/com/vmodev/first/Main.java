package com.vmodev.first;

public class Main {
    public static void main(String[] args) {
//        FindPrime.printPrime(
//                new int[]{1, 2, 4, 11, 12, 13, 2, 5}
//        );
//        int a[] = {2, 4, 3, 10 ,16, 17, 8, 9, 10, 2, 5, 6, 2, 4 ,6 ,8, 1};
//        FindPrime primeNumber = new FindPrime();
//        primeNumber.printSubArrays(a);


        DemoList demoList = new DemoList();
        demoList.createFiveStudents();
        demoList.shortPointName();

        demoList.printAllStudent();

        DemoList.createFiveStudents();


    }
}
