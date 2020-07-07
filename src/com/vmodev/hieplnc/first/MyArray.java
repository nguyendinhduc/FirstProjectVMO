package com.vmodev.hieplnc.first;

import java.util.ArrayList;
import java.lang.Math;
import java.util.Arrays;

public class MyArray {
    //============================================//
    // variable

    ArrayList<Integer> array = null;

    //=============================================//
    // constructor

    public MyArray(ArrayList<Integer> array){
        this.array = array;
    }

    //=============================================//
    // method

    public boolean isPrimeNumber(Integer n){
        int max = (int) Math.sqrt(Double.valueOf(n));
        for(int i = 2; i <= max; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public void getPrimeNumber(){
        System.out.println("Prime Number: ");
        for(Integer i : array){
            if(isPrimeNumber(i)) System.out.println(i);
        }
    }

    public void subArrayIncrease(){
        int size = array.size();
        int min = array.get(0);
        int count = 0;
        for(int i = 0; i < size; i++){
            if(array.get(i) <= min){
                System.out.println("\nSub array " + Integer.toString(count) + " :");
                count++;
            }
            min = array.get(i);
            System.out.print(array.get(i));
            System.out.print(" ");
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,4,5,7,4,6,7,2,1));
        MyArray obj = new MyArray(arrayList);
        obj.subArrayIncrease();
    }
}
