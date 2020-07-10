package com.vmodev.hieplnc.first.collection;

import com.vmodev.hieplnc.first.HocSinh;
import com.vmodev.hieplnc.first.Student;

import java.util.ArrayList;
import java.util.List;

public class QuanLyHocSinh {
    List<HocSinh> listHocSinh;

    public QuanLyHocSinh(ArrayList<HocSinh> listHocSinh){
        this.listHocSinh = listHocSinh;
    }

    public boolean hasHocSinh(String maHS){
        for(HocSinh i : listHocSinh){
            if(i.getMaHS().contains(maHS)){
                return true;
            }
        }
        return false;
    }

    public void suaTenHocSinh(String maHS, String tenMoi){
        for(HocSinh i : listHocSinh){
            if(i.getMaHS().contains(maHS)){
                i.setTen(tenMoi);
                break;
            }
        }
    }

    public void timKiemHocSinh(String name){
        List<HocSinh> listHocSinhTimKiem = new ArrayList<>();
        for(HocSinh i : listHocSinh){
            if(i.getTen().contains(name)){
                listHocSinhTimKiem.add(i);
            }
        }
        displayList(listHocSinhTimKiem);
    }

    public void addHocSinh(String maHS, String ten, String lop, String khoa, Double diemTKHocKy){
        if(hasHocSinh(maHS)){
            System.out.println("Hos Sinh da ton tai");
            return;
        }
        HocSinh hocSinhMoi = new HocSinh();
        hocSinhMoi.setMaHS(maHS);
        hocSinhMoi.setTen(ten);
        hocSinhMoi.setLop(lop);
        hocSinhMoi.setKhoa(khoa);
        hocSinhMoi.setDiemTKHocKy(diemTKHocKy);
        listHocSinh.add(hocSinhMoi);
    }

    public void sortPoint() {
        for (int i = 0; i < listHocSinh.size(); i++) {
            for (int j = i + 1; j < listHocSinh.size(); j++) {
                HocSinh st1 = listHocSinh.get(i);
                HocSinh st2 = listHocSinh.get(j);
                if (st1.getDiemTKHocKy() < st2.getDiemTKHocKy()) {
                    listHocSinh.set(i, st2);
                    listHocSinh.set(j, st1);
                } else if (st1.getDiemTKHocKy() == st2.getDiemTKHocKy()) {
                    if (st1.getTen().compareTo(st2.getTen()) > 0) {
                        listHocSinh.set(i, st2);
                        listHocSinh.set(j, st1);
                    }
                }
            }
        }
        displayList(listHocSinh);
    }

    public static void displayList(List<HocSinh> listHocSinh){
        System.out.println("List Hoc Sinh:");
        for(HocSinh i : listHocSinh){
            i.inTT();
            System.out.println("");
        }
    }
}
