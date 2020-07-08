package com.vmodev.hieplnc;

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

    public static void display(String value){
        System.out.println("Display integer:");
        System.out.println(value);
    }
}
