package NgocDo.ArrayExcercises;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayExcercise {

    //Ex1
    private static boolean isPrimeNumber(int n) {
        double value = Math.sqrt(Double.valueOf(n));
        for (int i = 2; i <= value; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
    public static void printPrimeNumber( int[] array){
        for(int i : array){
            if(isPrimeNumber(i))
                System.out.println(i);
        }
    }

    //Ex 2
    private static boolean isBiggerNumber(int a, int b){
        if( b > a){
            return true;
        }else{
            return false;
        }
    }
    public static void printChildArray(int[] array){
        int length = array.length;
        for(int i = 0 ; i < length; i++){
            int j = i;
            if((j+1) < length && isBiggerNumber(array[j], array[j+1])) {
                System.out.print("Child Array: ");
                System.out.print(array[j]);
                while((j+1) < length && isBiggerNumber(array[j], array[j+1])){
                    System.out.print(" "+array[j+1]);
                    j++;
                }
                System.out.println();
            }
        }
        System.out.println();
        System.out.println("Shorten childens: ");
        for(int i = 0 ; i < length; i++){
            if((i+1) < length && isBiggerNumber(array[i], array[i+1])) {
                System.out.print("Child Array: ");
                System.out.print(array[i]);
                while((i+1) < length && isBiggerNumber(array[i], array[i+1])){
                    System.out.print(" "+array[i+1]);
                    i++;
                }
                System.out.println();
            }
        }
    }

    //Ex 3
    private static boolean isBiggerNumberByStep(int a, int b, int step){
        if( b > a && b-a == step){
            return true;
        }else{
            return false;
        }
    }
    public static void printChildArrayInStep(int[] array, int step){
        int length = array.length;
        for(int i = 0 ; i < length; i++){
            int j = i;
            if( (j+1) < length && isBiggerNumberByStep(array[j], array[j+1],step)) {
                System.out.print("Child Array: ");
                System.out.print(array[j]);
                while( (j+1) < length && isBiggerNumberByStep(array[j], array[j+1],step)){
                    System.out.print(" "+array[j+1]);
                    j++;
                }
                System.out.println();
            }
        }
    }

    //Ex4
    public static void elementInNumber(int m,int[] array){
        int length = array.length;
        int number = m;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        String result = "";
        for(int i = 0; i < length; i++){
            if(number > array[i]){
                System.out.println(array[i]);
                number -= array[i];
                System.out.println(number);
                System.out.println();
            }
            else {
                i--;
                number = m;
            }
        }
    }
}
