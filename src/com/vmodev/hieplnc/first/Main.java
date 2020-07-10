package com.vmodev.hieplnc.first;

import com.vmodev.hieplnc.first.collection.DemoList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        System.out.println("hello world");
        DemoList myList = new DemoList();
        myList.addSt("Pham Van A", 16, 9.5);
        myList.addSt("Pham Van B", 13, 7.0);
        myList.addSt("Pham Van C", 19, 7.0);
        myList.addSt("Pham Van C", 13, 8.4);

        myList.sortPoint();
        myList.display();
    }
}
