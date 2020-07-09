package com.vmodev.hieplnc;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.text.Normalizer;
import java.util.ArrayList;

public class MyString {
    private final String varString;

    public MyString(String varString){
        this.varString = varString;
    }

    public int sumASCII(){
        int len = varString.length();
        int sum = 0;
        for(int i = 0; i < len; i++){
            sum += varString.charAt(i);
        }
        return sum;
    }

    public int sumInt(){
        int len = varString.length();
        int sum = 0;
        int tempDigit;
        for(int i = 0; i < len; i++){
            tempDigit = varString.charAt(i) - '0';
            if(tempDigit <= 9 && tempDigit >= 0){
                sum += tempDigit;
            }
        }
        return sum;
    }

    public String sort(){
        int size = varString.length();
        char[] tempArray = new char[size];
        for(int i = 0; i < size; i++){
            tempArray[i] = varString.charAt(i);
        }
        sortArray(tempArray, size);
        String result = "";
        for(char i : tempArray){
            result += i;
        }
        return result;
    }

    public String getUpperCase(){
        int len = varString.length();
        String sum = "";
        for(int i = 0; i < len; i++){
            if(Character.isUpperCase(varString.charAt(i))){
                sum += varString.charAt(i);
            }
        }
        return sum;
    }

    public String isSymmetry(){
        String revert = "";
        int len = varString.length();
        for(int i = len - 1; i >= 0; i--){
            revert += varString.charAt(i);
        }

        if(varString.equals(revert)) return new String("Symmetry String");
        else return new String("Not Symmetry String");
    }

    public String intellijFirstLetter(){
        int state = 0;
        int len = varString.length();
        String tempS = new String();
        for(int i = 0; i < len; i++){
            char tempChar = varString.charAt(i);
            if(state == 0 && !isSpace(tempChar)){
                tempChar = Character.toUpperCase(tempChar);
                state = 1;
            } else if(state == 1 && isSpace(tempChar)) state = 0;
            tempS += tempChar;
        }
        return tempS;
    }

    public String revertWord(){
        int state = 0;
        int len = varString.length();
        String tempS = "";
        String revertTempS = "";
        for(int i = 0; i < len; i++){
            char tempChar = varString.charAt(i);

            if(state == 0 && !isSpace(tempChar)){
                state = 1;
            } else if(state == 1 && isSpace(tempChar)){
                state = 0;
                tempS += revertString(revertTempS);
                revertTempS = "";
            }

            if(state == 0) tempS += tempChar;
            else revertTempS += tempChar;

            if(i == len - 1 && state == 1){
                tempS += revertString(revertTempS);
            }
        }
        return tempS;
    }

    private ArrayList<Integer> getNumInString(){
        ArrayList<Integer> num = new ArrayList<>();
        String tempStringNum = "";
        int state = 0;
        int len = varString.length();
        for(int i = 0; i < len; i++){
            char tempChar = varString.charAt(i);

            if(state == 0 && isDigit(tempChar)){
                state = 1;
            } else if(state == 1 && !isDigit(tempChar)){
                state = 0;
                num.add(Integer.parseInt(tempStringNum));
                tempStringNum = "";
            }

            if(state == 1) tempStringNum += tempChar;

            if(state == 1 && i == len - 1) num.add(Integer.parseInt(tempStringNum));
        }
        return num;
    }

    public int sumNumber(){
        ArrayList<Integer> num = getNumInString();
        int rslt = 0;
        for(Integer i : num){
            rslt += i;
        }
        return rslt;
    }

    public String normalizeString(){
        String normalized = Normalizer.normalize(varString, Normalizer.Form.NFD);
        String result = normalized.replaceAll("[^\\p{ASCII}]", "");
        return result;
    }

    private ArrayList<Integer> getOperatorInString(){
        ArrayList<Integer> operator = new ArrayList<>();
        int len = varString.length();
        int state = 0;
        int decider = 1;
        for(int i = 0; i < len; i++){
            char tempChar = varString.charAt(i);
            if(state == 0 && getOperator(tempChar) >= 0){
                state = 1;
            } else if(state == 1 && getOperator(tempChar) < 0){
                state = 0;
                operator.add(decider);
                decider = 1;
            }
            if(state == 1) decider *= getOperator(tempChar);

            if(state == 1 && i == len - 1){
                operator.add(decider);
            }
        }
        return operator;
    }

    public int calculateString(){
        ArrayList<Integer> num = getNumInString();
        ArrayList<Integer> operator = getOperatorInString();

        int len = num.size();
        int result = num.get(0);
        int valueChecker;
        if(getOperator(varString.charAt(0)) >= 0){
            result = operator.get(0) == 1 ? result : -1 * result;
            operator.remove(0);
        }

        for(int i = 1; i < len; i++){
            if(operator.get(i - 1) == 1){
                result += num.get(i);
            } else {
                result -= num.get(i);
            }
        }
        return result;
    }

    private static int getOperator(char value){
        if(value == '+') return 1;
        else if(value == '-') return 0;
        return -1;
    }

    private static boolean isDigit(char value){
        int num = value - '0';
        return num <= 9 && num >= 0;
    }

    private static String revertString(String value){
        int len = value.length();
        String rst = "";
        for(int i = len - 1; i >= 0; i--){
            rst += value.charAt(i);
        }
        return rst;
    }

    private  static boolean isSpace(char value){
        return value == ' ' || value == '\t';
    }

    private static void sortArray(char[] array, int sz){
        for(int i = 0; i < sz; i++){
            for(int j = sz - 1; j > i; j--){
                if(array[j] < array[j - 1]){
                    char tempChar = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tempChar;
                }
            }
        }
    }

    public static void display(int value){
        System.out.println("Display integer:");
        System.out.println(value);
    }

    private String sumString(String numA, String numB){
        int buff = 0;
        int len = numA.length();
        String result = "";
        for(int i = len - 1; i >= 0; i--){
            int digit = numA.charAt(i) + numB.charAt(i) - 2 * '0' + buff;
            result = ((char) ((digit % 10) + '0')) + result;
            buff = digit / 10;
        }
        if(buff != 0) result = '1' + result;
        return result;
    }

    private String minusString(String numA, String numB){
        int buff = 0;
        int d_A, d_B;
        int len = numA.length();
        String result = "";
        for(int i = len - 1; i >= 0; i--){
            d_A = numA.charAt(i) - '0';
            d_B = numB.charAt(i) - '0' + buff;
            if(d_A < d_B) {
                d_A += 10;
                buff = 1;
            } else{
                buff = 0;
            }
            result = (char) (d_A - d_B + '0') + result;
        }
        return result;
    }

    private String multiplyString(String numA, String numB){
        int buff = 0;
        String zero = "";
        String finalMulti = "0";
        String tempMulti = "";
        int len = numA.length();
        for(int i = len - 1; i >= 0; i--){
            for(int j = len - 1; j >= 0; j--){
                int multiValue= (numA.charAt(j) - '0') * (numB.charAt(i) - '0') + buff;
                tempMulti += (char) (multiValue % 10 + '0') + tempMulti;
                buff = multiValue / 10;
            }
            if(buff != 0) tempMulti += (char) (buff + '0') + tempMulti;
            tempMulti += zero;
            System.out.println(tempMulti);
            zero += "0";
            finalMulti = calculateString(finalMulti, tempMulti, "+");
            tempMulti = "";
        }
        return finalMulti;
    }

    public String calculateString(String numA, String numB, String operator){
        int lenA = numA.length();
        int lenB = numB.length();

        // padding zero
        int interval = lenA - lenB;
        if(lenA < lenB) {
            interval *= -1;
            for(int i = 0; i < interval; i++){
                numA = '0' + numA;
            }
            String temp = numA;
            numA = numB;
            numB = temp;
        } else{
            for(int i = 0; i < interval; i++){
                numB = '0' + numB;
            }
        }
        if(operator.equals("+")) return sumString(numA, numB);
        else if(operator.equals("-")) return minusString(numA, numB);
        else if(operator.equals("*")) return multiplyString(numA, numB);
        else return null;
    }

    public static void display(String value){
        System.out.println("Display integer:");
        System.out.println(value);
    }
}
