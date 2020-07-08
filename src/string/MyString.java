package string;

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
            sum += (int) string.charAt(i);
        }
        return sum;
    }
}
