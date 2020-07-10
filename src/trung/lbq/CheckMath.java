package trung.lbq;

public class CheckMath {
    public String str;

    public static boolean checkValidMath(String str){
        int start = 0;
        int end = 0;
        int length = str.length();
        for (int i = 0 ; i <= length ; i++){
            char temp = str.charAt(i);
            if(temp == '('){
            start++;
        }else if(temp == ')') end++;
            if(start != end) return false;
        }

        return true;
    }
    }

