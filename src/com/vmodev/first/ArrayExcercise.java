package com.vmodev.first;

public class ArrayExcercise {
    //In ra các số nguyên tố trong mảng
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        double value = Math.sqrt(n);
        for (int i = 2; i <= value; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static void inputPrime(int a[]) {
        System.out.println("Các số nguyên tố trong mảng là: ");
        for (int i = 1; i < a.length; i++) {
            if (isPrime(i)) {
                System.out.print(" " + i);

            }
        }
    }

}
