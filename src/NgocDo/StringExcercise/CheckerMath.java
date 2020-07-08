package NgocDo.StringExcercise;

import java.util.Stack;

public class CheckerMath {
    private  String a;
    public boolean checkValidMath(String strBracket){
        Stack<Character> STACK = new Stack<Character>();
        System.out.println(strBracket);
        if(strBracket.charAt(0) == ')'){
            return false;
        }
        else{
            for(int i = 0; i < strBracket.length();i++ ){
                if(strBracket.charAt(i) == '(')
                    STACK.push(strBracket.charAt(i));
                else if(!STACK.empty() && strBracket.charAt(i) == ')')
                    STACK.pop();
                else
                    return false;
                System.out.println(i+" "+STACK);
            }
            if(STACK.empty()){
                return true;
            }else{
                return false;
            }
        }

    }
}
