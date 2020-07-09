package trung.lbq;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        System.out.println("Enter String: ");
        Scanner sc = new Scanner(System.in);
        MyString myString= new MyString();
        myString.s = sc.nextLine();
        MyString.ASCII(myString.s);
    }
}
