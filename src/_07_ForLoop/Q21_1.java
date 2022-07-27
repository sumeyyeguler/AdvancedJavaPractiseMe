package _07_ForLoop;

public class Q21_1 {
    public static void main(String[] args) {
        /* TASK : aşagıdaki şekli console'a yazdırınız


         *
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */


        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
        }
        System.out.println();
        }

    }

