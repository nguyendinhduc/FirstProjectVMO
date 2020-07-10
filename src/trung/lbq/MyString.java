package trung.lbq;

import java.util.Arrays;
import java.util.Stack;

public class MyString {
    String s;

    public static void input(String s) {
        System.out.println(s);

    }

    public static void ASCII(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int asciiValue = s.charAt(i);
            System.out.println(s.charAt(i) + "=" + asciiValue);
            sum += asciiValue;
        }
        System.out.println("ASCII of " + s + "=" + sum);
    }
    public static void sumDigitsInString(String s){
        int sumDigits = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i))){
                sumDigits += Character.getNumericValue(s.charAt(i));
            }
        }

        System.out.println("\nTotal value of all number in string is: "+sumDigits);
    }
    public static void sortByAsciiValue(String s) {
        int[] asciiArray = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);
            asciiArray[i] = ascii;
        }
        Arrays.sort(asciiArray);

        for (int ascii : asciiArray) {
            System.out.print((char) ascii + "-" + ascii + " ");
        }
    }

    public static void findUppercaseCharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                System.out.print(s.charAt(i) + " ");
            }
        }
    }

    public static void symmetricCharacter(String s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) == s.charAt(length - 1 - i)) {
                System.out.println("Symmetric character: " + s.charAt(i));
            }
        }
    }

    public static void AutoUpperCase(String s) {
        String s1 = s.replace(s.charAt(0), Character.toUpperCase(s.charAt(0)));
        for (int i = 0; i < s.length(); i++) {
            if (Character.isSpaceChar(s.charAt(i))) {
                s1 = s.replace(s.charAt(i + 1), Character.toUpperCase(s.charAt(i + 1)));
            }
        }
        System.out.println(s1);
    }
    public static String reverseEachWord(String s){
        String words[] = s.split("\\s");
        String reverseWord = "";
        for(String w:words){
            StringBuilder sb = new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }
    public static int sumNumber(String s) {
        String temp = "";
        // holds sum of all numbers present in the string
        int sum = 0;// read each character in input string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch))
                temp += ch;
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }

    public static void findSum(String s) {
        System.out.println(sumNumber(s));
    }
    public static void removeAllNonAscii(String s){
        String newstr = s.replaceAll("[^\\p{ASCII}]", "");
        System.out.print(newstr);
    }

}
