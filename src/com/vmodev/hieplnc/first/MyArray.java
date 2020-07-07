package com.vmodev.hieplnc.first;

import java.lang.annotation.Target;
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
        System.out.println("Get increase sub array:");
        int size = array.size();
        int min = array.get(0);
        int count = 0;
        for(int i = 0; i < size; i++){
            if(array.get(i) <= min){
                System.out.println("\nSub array " + count + " :");
                count++;
            }
            min = array.get(i);
            System.out.print(array.get(i));
            System.out.print(" ");
        }
    }

    public void subArrayIncSteadily(){
        System.out.println("Get increase steadily sub array:");
        int size = array.size();
        int min = array.get(0);
        int hop = 0;
        int count = 0;
        for(int i = 0; i < size; i++){
            if(hop == 0){
                hop = array.get(i) - min;
            }
            if(array.get(i) - min != hop || hop <= 0){
                System.out.println("\nSub array " + count + " :");
                count++;
                hop = 0;
            }
            min = array.get(i);
            System.out.print(array.get(i));
            System.out.print(" ");
        }
    }

    private int sumArray(ArrayList<Integer> temp){
        int result = 0;
        for(Integer i : temp){
            result += i;
        }
        return result;
    }

    private void displayArray(ArrayList<Integer> temp){
        System.out.println("Array List: ");
        for(Integer i : temp){
            System.out.print(i.toString() + " ");
        }
        System.out.println("");
    }

    private void rcsArray(int pos, int num, ArrayList<Integer> temp, int target){
        int size = array.size();
        for(int i = pos; i < size; i++){
            if(num == 0){
                if(sumArray(temp) + array.get(i) == target) {
                    ArrayList<Integer> finalArray = new ArrayList(temp);
                    finalArray.add(array.get(i));
                    displayArray(finalArray);
                }
            } else{
                ArrayList<Integer> conArray = new ArrayList(temp);
                conArray.add(array.get(i));
                rcsArray(i + 1, num - 1, conArray, target);
            }
        }
    }

    public void listHasSumEqual(int M){
        int size = array.size();
        for(int i = 0; i < size; i++) {
            rcsArray(0, i, new ArrayList<Integer>(), M);
        }
    }

    public static void main(String[] args){
        ArrayList<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(1,2,4,5,7,4,6,8));
        MyArray obj = new MyArray(arrayList);
        obj.listHasSumEqual(9);
    }
}
