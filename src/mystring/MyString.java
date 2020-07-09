package mystring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyString {

    public static String creatNewString() {
        System.out.println("nhập chuỗi:");
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.nextLine();
        return myString;
    }

    public static int sumAscii(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            sum += string.charAt(i);
        }
        return sum;
    }

    public static int sumNumber(String value) {
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (c - '0' >= 0 && c <= '9') {
                sum = sum + c - '0';
            }
        }
        return sum;
    }

    public static boolean isNumber(char c) {
        return c >= '0' && c <= '9';
    }

    public static int sumNumberOfString(String value) {
        String buffer = "";
        int state = 0;
        int sum = 0;
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (isNumber(c) && state == 0) {
                state = 1;
            }
            if (state == 1) {
                if (!isNumber(c)) {
                    sum += Integer.parseInt(buffer);
                    //bat dau khoi phuc lai ban dau
                    state = 0;
                    buffer = "";
                    //ket thuc
                } else {
                    buffer += c;
                }
            }
        }
        if (!buffer.equals("")) {
            sum += Integer.parseInt(buffer);
        }
        return sum;


    }

    public static int sumNumberOfStringSecond(String value) {
        int sum = 0;
        int index = -1;
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);
            if (isNumber(c)) {
                if (index == -1) {
                    index = i;
                }
            }else {
                if ( index >-1){
                    String valueInt = value.substring(index, i);
                    sum+= Integer.parseInt(valueInt);
                    index=-1;
                }
            }

        }
        if (index > -1){
            String valueInt = value.substring(index);
            sum+= Integer.parseInt(valueInt);
        }
        return sum;

    }

    public static boolean checkValidMath(String value){
        int start = 0;
        int end = 0;
        for(int i = 0 ; i < value.length(); i++){
            char temp = value.charAt(i);
            if(temp == '('){
                start++;
            }
            else if(temp == ')'){
                end++;
            }
            if(start < end)
                return false;
        }
        return start == end;
    }

}
