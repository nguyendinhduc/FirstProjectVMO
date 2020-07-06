package com.vmodev.first;

public class ShapeDrawer {
    public void drawSolidTriangle(int h){
        for(int i = 0 ; i<h ;i++){

            for(int j = 0 ; j< h - i ; j++ ){
                System.out.print(" ");
            }
            for(int j = 0 ; j<= i ; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
    public void drawBalancedBorderedTriangle(int h){
        for (int i = 1; i <= h; i++) {

            for (int j = h; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ( j == 1 || j == i || i == h)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
