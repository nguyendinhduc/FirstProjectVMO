package NgocDo.StringExcercise;
public class Main {
    public static void main(String[] args) {
        String init = "Đỗ Thị Minh Ngọc ";
//        MyString str = new MyString();
//        str.setMyString(init);
//        str.removeAllNonAscii();

//        CheckerMath checker = new CheckerMath();
//        System.out.print(checker.checkValidMath("()()()"));

//        CalculateEquation calculator = new CalculateEquation();
//        calculator.calculateStr("3+4-5-6+9+1--+4-+23-103+4-5-6+9+1-0-4-23-10");

        CalculateWithoutConvert calculateNoConvert = new CalculateWithoutConvert();
        calculateNoConvert.calculateWithoutConvert("123456789123456789", "1", '+' );
    }
}
