package NgocDo.StringExcercise;

public class CalculateWithoutConvert {
    public void calculateWithoutConvert(String a, String b, char c){

        String result = "";
        int length;
        int remNum = 0;
        MyString strMethod = new MyString();
        a = strMethod.reverseString(a);
        b = strMethod.reverseString(b);
        if(a.length() >= b.length()){
            length = a.length();
            for(int i = b.length(); i < length; i++){
                b = b + '0';
            }
        }
        else {
            length = b.length();
            for(int i = a.length(); i < length; i++)
                a = a + '0';
        }

        for(int i = 0; i < length; i++ ){
            int res = Character.getNumericValue(a.charAt(i))+Character.getNumericValue(b.charAt(i)) + remNum;
            if(res >=  10){
                res = res - 10;
                remNum = 1;
            }
            else{
                remNum = 0;
            }

            result = result + ((char)(res+'0'));
        }
        result = strMethod.reverseString(result);
        System.out.print(result);
    }
}
