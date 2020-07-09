package com.vmodev.first;

import java.lang.Math;

public class FindPrime {
    private int testAttr;

    private static boolean isPrime(int n) {
        if (1 <= n) {
            return false;
        }
        double value = Math.sqrt(n);
        for (int i = 2; i <= value; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPrime(int[] arrInt) {
        for (int i = 0; i < arrInt.length; i++) {
            if (isPrime(arrInt[i])) {
                System.out.println(arrInt[i] + "");
            }
        }
    }
    public boolean CompareElement(int a , int b){
        if(a<b){
            return true;
        }
        else{
            return false;
        }
    }
    public void printSubArrays(int[] arrInt){
        int length = arrInt.length;
        for(int i=0 ; i<length; i++){
            if((i+1)<length && CompareElement(arrInt[i], arrInt[i+1])){
                System.out.print("Subarray :" + arrInt[i] );
                while(i+1<length && CompareElement(arrInt[i],arrInt[i+1])){
                    System.out.print(" " + arrInt[i+1]);
                    i++;
                }

            }
            System.out.println();
        }
    }



}
