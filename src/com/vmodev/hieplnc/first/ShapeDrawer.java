package com.vmodev.hieplnc.first;

import java.util.Scanner;

public class ShapeDrawer {
    public void isoscelesTriangle(){
        Scanner myScan = new Scanner(System.in);
        System.out.print("enter h: ");
        int h = myScan.nextInt();
        for(int i = 0; i < h; i++){
            for(int k = 0; k < h - i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void isoscelesTriangleBorder(){
        Scanner myScan = new Scanner(System.in);
        System.out.print("enter h: ");
        int h = myScan.nextInt();
        for(int i = 0; i < h; i++){
            for(int k = 0; k < h - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i || i == h - 1) System.out.print("*");
                else System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void rightTriangle(){
        Scanner myScan = new Scanner(System.in);
        System.out.print("enter h: ");
        int h = myScan.nextInt();
        for(int i = 0; i < h; i++){
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void rightTriangleBorder(){
        Scanner myScan = new Scanner(System.in);
        System.out.print("enter h: ");
        int h = myScan.nextInt();
        for(int i = 0; i < h; i++){
            for (int j = 0; j < i + 1; j++) {
                if(j == 0 || j == i || i == h - 1) System.out.print("*");
                else System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void rectangle(){
        Scanner myScan = new Scanner(System.in);
        System.out.print("enter x y: ");
        int x = myScan.nextInt();
        int y = myScan.nextInt();
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public void rectangleBorder(){
        Scanner myScan = new Scanner(System.in);
        System.out.print("enter x y: ");
        int x = myScan.nextInt();
        int y = myScan.nextInt();
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(j == 0 || j == y - 1 || i == 0 || i == x - 1)  System.out.print("*");
                else System.out.print(" ");
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        System.out.println("hello world");
        ShapeDrawer obj = new ShapeDrawer();
        obj.isoscelesTriangle();
    }
}
