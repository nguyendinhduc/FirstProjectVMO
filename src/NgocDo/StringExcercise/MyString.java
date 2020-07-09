package NgocDo.StringExcercise;
import java.text.Normalizer;
import java.util.Arrays;

public class MyString {
    private String myString ;

    public String getMyString() {
        System.out.println("The string is: "+myString);
        return myString;
    }

    public void setMyString(String myString) {
        System.out.println("The string is set as: "+myString);
        this.myString = myString;
    }

    public int sumAsciiOfCharacterInString(){
        char[] charArray = new char[myString.length()];

        for (int i = 0; i < myString.length(); i++) {
            charArray[i] = myString.charAt(i);
        }

        int sumAscii = 0;

        for(char c: charArray){
            int ascii = c;
            sumAscii += ascii;
        }

        System.out.println("\nTotal ASCII value of all charater in string is: "+sumAscii);

        return sumAscii;
    }

    public int sumDigitsInString(){
        int sumDigits = 0;
        for (int i = 0; i < myString.length(); i++) {
            if(Character.isDigit(myString.charAt(i))){
                sumDigits += Character.getNumericValue(myString.charAt(i));
            }
        }

        System.out.println("\nTotal value of all number in string is: "+sumDigits);

        return sumDigits;
    }

    public String sortByAsciiValue(){
        int[] asciiArray = new int[myString.length()];

        for (int i = 0; i < myString.length(); i++) {
            int ascii = myString.charAt(i);
            asciiArray[i] = ascii;
        }
        Arrays.sort(asciiArray);

        for(int ascii : asciiArray){
            System.out.print((char)ascii+"-"+ascii+" ");
        }

        String result = asciiArray.toString();
        return result;
    }

    public String findUppercaseCharacter(){
        char[] charArr = new char[ myString.length()];
        for (int i = 0; i < myString.length(); i++) {
            if(Character.isUpperCase(myString.charAt(i))){
                charArr[i] = myString.charAt(i);
                System.out.print(myString.charAt(i)+" ");
            }
        }
        return new String(charArr);
    }

    public boolean symmetricCharacter(){
        int length = myString.length();
        for (int i = 0; i < length/2; i++) {
            if(myString.charAt(i) == myString.charAt(length - 1 -i)){
                System.out.println(myString.charAt(i)+" is symmetric character");
                return true;
            }
        }
        return false;
    }

    public boolean symmetricString(){
        int length = myString.length();
        for (int i = 0; i < length/2; i++) {
            if(myString.charAt(i) != myString.charAt(length - 1 -i))
                return false;
        }
        return true;
    }

    public boolean symmetricWordInString(String s){
        int length = myString.length();
        boolean found = false;
        boolean isSym = false;
        String[] strSplit = myString.split(" ");
        for (int i =0; i < Math.ceil(strSplit.length/2.0);) {
            if(strSplit[i].equals(s)){
                found = true;
                if(strSplit[i].equals(strSplit[strSplit.length-1-i])){
                    System.out.print(strSplit[i]+": is symmetric");
                    isSym = true;
                }else{
                    System.out.print(strSplit[i]+": is not symmetric");
                }
                i = (int) Math.ceil(strSplit.length/2.0);
            }
            else{
                i++;
            }
        }
        if(!found){
            System.out.print("Word not found");
        }
        return isSym;
    }


    public String autoUppercase(){
        myString = myString.replace(myString.charAt(0),Character.toUpperCase(myString.charAt(0)));
        for (int i = 0; i < myString.length(); i++) {
            if(Character.isSpaceChar(myString.charAt(i)) ){
                myString =  myString.replace(myString.charAt(i+1),Character.toUpperCase(myString.charAt(i+1)));
            }
        }
        return myString;
    }

    public String reverseString(String str){
        char[] charArray = new char[str.length()];
        int len = str.length();
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(len-1-i);
        }
//        for(char c: charArray){
//            System.out.print(c);
//        }
        return new String(charArray);
    }

    public void reverseWordInString(){
        String[] splitStr = myString.split("( )+");
        for( String s:splitStr){
            int len = s.length();
            char[] charArray = new char[len];
            for (int i = 0; i < s.length(); i++) {
                charArray[i] = s.charAt(len-1-i);
            }
            for(char c: charArray){
                System.out.print(c);
            }
            System.out.print(" ");
        }

    }

    public int sumNumbersInString(){
        int sumNumber = 0;
        char[] charArray = new char[myString.length()];
        for (int i = 0; i < myString.length(); i++) {
            if(Character.isDigit(myString.charAt(i))){
                charArray[i] = myString.charAt(i);
            }
            else
                charArray[i] = ' ';
        }
        String newStr = new String(charArray);
        String[] str = newStr.split("( )+");
        for(String s:str)
            sumNumber +=Integer.valueOf(s);

        System.out.println(sumNumber);
        return sumNumber;
    }

    public String removeAllNonAscii(){
        String normalized_string = myString.replace("Đ", "D");
        normalized_string = normalized_string.replace("đ", "d");
        normalized_string = Normalizer.normalize(normalized_string, Normalizer.Form.NFD)
                                .replaceAll("[^\\p{ASCII}]", "");
        System.out.println(normalized_string);
        return normalized_string;
    }

}
