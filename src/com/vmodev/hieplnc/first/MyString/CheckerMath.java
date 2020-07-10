package com.vmodev.hieplnc.first.MyString;

public class CheckerMath{
    public static boolean checkValidMath(String strBracket){
        int open = 0;
        int close = 0;
        int len = strBracket.length();
        for(int i = 0; i < len; i++){
            char tempChar = strBracket.charAt(i);

            if(tempChar == '(') open++;
            else if(tempChar == ')') close++;

            if(close > open) return false;
        }
        if(close != open) return false;
        return true;
    }
}
