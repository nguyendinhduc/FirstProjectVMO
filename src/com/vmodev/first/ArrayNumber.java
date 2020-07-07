//package com.vmodev.first;
//
//
//import java.util.HashSet;
//import java.util.Set;
//
//    public class ArrayNumber {
//
//        public static void main(String[] args) {
//            int[] a = {2,4,3,10,16,17,8,9,10,2,5,6,2,4,6,8,1};
//            Set<Integer> set2 = new HashSet<Integer>();
//            for (int i = 0; i < a.length; i++) {
//
//                if (isPrimeNumber(a[i])) {
//                    set2.add(a[i]);
//
//                    //System.out.print(" " + a[i]);
//                }
//            }
//            System.out.println("Số nguyên tố: " + set2);
//        }
//
//        public static boolean isPrimeNumber(int n) {
//            // so nguyen n < 2 khong phai la so nguyen to
//            if (n < 2) {
//                return false;
//            }
//            // check so nguyen to khi n >= 2
//            int squareRoot = (int) Math.sqrt(n);
//            for (int i = 2; i <= squareRoot; i++) {
//                if (n % i == 0) {
//                    return false;
//                }
//            }
//            return true;
//        }
//
//    }
