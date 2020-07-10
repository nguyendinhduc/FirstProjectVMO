package com.vmodev.hieplnc.first;

public class DanhBa {
    private String name;
    private String phone;

    public DanhBa(String name, String phone){
        setName(name);
        setPhone(phone);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void display(){
        System.out.println("Danh Ba: ");
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phone);
    }
}
