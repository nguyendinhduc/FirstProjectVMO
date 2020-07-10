package trung.lbq;

import java.util.Scanner;

import static trung.lbq.CheckMath.checkValidMath;

public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        MyString ex2 = new MyString();
        ex2.s = sc.nextLine();
        MyString.findSum(ex2.s);
    }
}
