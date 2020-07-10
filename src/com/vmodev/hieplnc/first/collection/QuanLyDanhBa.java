package com.vmodev.hieplnc.first.collection;

import com.vmodev.hieplnc.first.DanhBa;
import com.vmodev.hieplnc.first.HocSinh;

import java.util.ArrayList;
import java.util.List;

public class QuanLyDanhBa {
    private List<DanhBa> listDanhBa;

    public QuanLyDanhBa(){
        listDanhBa = new ArrayList<>();
    }

    public boolean hasDanhBa(String name, String phone){
        for(DanhBa i : listDanhBa){
            if(i.getName().contains(name) && i.getPhone().contains(phone)) return true;
        }
        return false;
    }

    public void addDanhBa(String name, String phone){
        if(hasDanhBa(name, phone)){
            System.out.println("Danh ba da ton tai");
            return;
        }
        DanhBa newDanhBa = new DanhBa(name, phone);
        listDanhBa.add(newDanhBa);
    }

    public void fixDanhBa(String name, String newPhone){
        for(DanhBa i : listDanhBa){
            if(i.getName().contains(name)){
                i.setPhone(newPhone);
                return;
            }
        }
    }

    private boolean checkTenGanDung(String keyword, String sentence){
        int index = 0;
        for(int i = 0; i < sentence.length(); i++){
            if(keyword.charAt(index) == sentence.charAt(i)) index++;
        }
        return index == keyword.length();
    }

    public void searchDanhBa(String name){
        List<DanhBa> listTimKiem = new ArrayList<>();
        for(DanhBa i : listDanhBa){
            if(checkTenGanDung(name, i.getName())) listTimKiem.add(i);
        }
        displayList(listTimKiem);
    }

    public static void displayList(List<DanhBa> listDanhBa){
        System.out.println("List Danh Ba:");
        for(DanhBa i : listDanhBa){
            i.display();
            System.out.println("");
        }
    }
}
