package string;

public class Main {
    public static void main(String[] args) {
        MyString myString = new MyString();

        String inputString = myString.creatNewString();
        System.out.println("chuỗi vừa nhập:" + inputString);

        int sum = myString.sumAscii(inputString);
        System.out.println("tổng chuỗi kí tự ascii: " + sum);



    }
}
