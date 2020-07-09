package NgocDo.StringExcercise;

public class CalculateEquation {
    public void calculateStr(String myString){

        myString = "+" + myString ;

        // list of operators
        char[] operationArray = new char[myString.length()];
        for (int i = 0; i < myString.length(); i++) {
            if(Character.isDigit(myString.charAt(i))){
                operationArray[i] =' ';
            }
            else
                operationArray[i] = myString.charAt(i);
        }
        String newOpStr = new String(operationArray);
        String[] opStr = newOpStr.split(" ");

        for(int j = 0; j < opStr.length; j++){
            boolean foundSub = false;
            for(int i=0; i< opStr[j].length(); ){
                if(opStr[j].charAt(i) == '-'){
                    foundSub = true;
                    i = opStr[j].length();
                }
                else{
                    i++;
                }
            }
            if(foundSub)
                opStr[j] = "-";
            else
                opStr[j] = "+";
        }
//        for(String op: opStr){
//            System.out.print(op+",");
//        }
//        System.out.println();

        //list of number
        char[] numberArray = new char[myString.length()];
        for (int i = 0; i < myString.length(); i++) {
            if(Character.isDigit(myString.charAt(i))){
                numberArray[i] = myString.charAt(i);
            }
            else
                numberArray[i] =' ';
        }

        String newNumStr = new String(numberArray);
        String[] numStr = newNumStr.split("( )+");

//        for(String num: numStr){
//            System.out.print(num+",");
//        }
//        System.out.println();

        //calculate
        int result = 0;
        for(int i = 1; i< numStr.length; i++){
            if( Character.compare(opStr[i-1].charAt(0),'+') == 0)
                result = result + Integer.valueOf(numStr[i]) ;
            else if (Character.compare(opStr[i-1].charAt(0),'-') == 0)
                result = result - Integer.valueOf(numStr[i]) ;
        }
        System.out.println(result);

    }
}
