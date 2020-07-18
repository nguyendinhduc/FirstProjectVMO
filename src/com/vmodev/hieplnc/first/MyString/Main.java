package com.vmodev.hieplnc.first.MyString;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        MyString test = new MyString("hello viet nam");
//        test.display(test.calculateString("100000000000000000000", "2", "/"));

//        CheckerMath myChecker = new CheckerMath();
//        System.out.println(myChecker.checkValidMath(")()(())"));

        SearchString mySearch = new SearchString(new ArrayList<>());
        mySearch.addString("Do Thi Minh Ngoc");
        mySearch.addString("Do Thi Nhu Ngoc");
        mySearch.addString("Do Nhu Minh Ngoc");
        mySearch.addString("Le Thi Hoa Ngoc");
        mySearch.addString("Do Minh Minh Do");
        mySearch.addString("o to do choi");
        mySearch.addString("phi thuyen choi Ngoc");

        mySearch.searchString("choi");
    }
}
