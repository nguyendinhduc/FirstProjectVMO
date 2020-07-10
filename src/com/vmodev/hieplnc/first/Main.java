package com.vmodev.hieplnc.first;

import com.vmodev.hieplnc.first.collection.DemoList;
import com.vmodev.hieplnc.first.collection.QuanLyDanhBa;
import com.vmodev.hieplnc.first.collection.QuanLyHocSinh;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
//        DemoList myList = new DemoList();
//        myList.addSt("Pham Van A", 16, 9.5);
//        myList.addSt("Pham Van B", 13, 7.0);
//        myList.addSt("Pham Van C", 19, 7.0);
//        myList.addSt("Pham Van C", 13, 8.4);
//
//        myList.sortPoint();
//        myList.display();

//        QuanLyHocSinh KimLien = new QuanLyHocSinh(new ArrayList<>());
//        KimLien.addHocSinh("01", "Do Minh Ngoc", "ICT", "ICT", 16.54);
//        KimLien.addHocSinh("02", "Quoc Trung", "ICT", "ICT", 15.5);
//        KimLien.addHocSinh("03", "Le Hiep", "ICT", "ICT", 15.9);
//
//        KimLien.sortPoint();

        QuanLyDanhBa HaBaTrung = new QuanLyDanhBa();
        HaBaTrung.addDanhBa("Ngoc", "09123");
        HaBaTrung.addDanhBa("Huong", "12344");
        HaBaTrung.addDanhBa("Kim Nguuc", "122234");

        HaBaTrung.searchDanhBa("Ngc");
    }
}
