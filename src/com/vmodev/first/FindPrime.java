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



}
