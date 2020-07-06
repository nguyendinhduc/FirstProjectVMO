package com.vmodev.first;

public class ShapeDrawer {
    public void drawSolidTriangle(int h){
        for(int i = 0 ; i<h ;i++){

            for(int j = 0 ; j< h - i ; j++ ){
                System.out.print(" ");
            }
            for(int j = 0 ; j< i ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
