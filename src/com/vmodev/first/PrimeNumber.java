package com.vmodev.first;

public class PrimeNumber {

        //In ra các số nguyên tố trong mảng
        public boolean isPrime(int n) {
            if (n <= 1) {
                return false;
            } else {
                for (int i = 2; i <= Math.sqrt(n)
                        ; i++) {
                    if (n % i == 0)
                        return false;
                }
            }
            return true;
        }

        public void inputPrime(int a[]) {
            System.out.println("Các số nguyên tố trong mảng là: ");
            for (int i = 1; i < a.length; i++) {
                if (isPrime(i)) {
                    System.out.print(" " + i);

                }
            }
        }
}
