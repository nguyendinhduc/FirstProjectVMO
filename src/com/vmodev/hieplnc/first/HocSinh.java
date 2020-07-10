package com.vmodev.hieplnc.first;

public class HocSinh {
    String maHS;
    String ten;
    String lop;
    String khoa;
    Double diemTKHocKy;

    public String getMaHS() {
        return maHS;
    }

    public void setMaHS(String maHS) {
        this.maHS = maHS;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public Double getDiemTKHocKy() {
        return diemTKHocKy;
    }

    public void setDiemTKHocKy(Double diemTKHocKy) {
        this.diemTKHocKy = diemTKHocKy;
    }

    public void inTT(){
        System.out.println("Thong tin hoc sinh:");
        System.out.println("Ma Hoc Sinh: " + maHS + "\nTen: " + ten + "\nLop: " + lop + "\nKhoa: " + khoa + "\nDiem Tong Ket Hoc Ky: " + diemTKHocKy.toString());
    }
}
