package NgocDo.ArrayExcercises;

public class ShapeDrawer {
    void ex28(int h){
        System.out.println("Ex 28");
        for (int i = 1; i <= h; i++) {

            for (int j = h; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    void ex29(int h){
        System.out.println("Ex 29");
        for (int i = 1; i <= h; i++) {

            for (int j = h; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                if ( j == 1 || j == i || i == h)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    void ex30(int h){
        System.out.println("Ex 30");
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void ex31(int h){
        System.out.println("Ex 31");
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                if ( j == 1 || j == i || i == h)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    void ex32(int m, int n){
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    void ex33(int m, int n){
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if(i == 1 || i == m){
                    System.out.print("* ");

                }
                else{
                    if( j == 1 || j == n)
                        System.out.print("* ");
                    else
                        System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
}
