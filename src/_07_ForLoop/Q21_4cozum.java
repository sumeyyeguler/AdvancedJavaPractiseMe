package _07_ForLoop;

public class Q21_4cozum {
    public static void main(String[] args) {
         /*
                 *
                * *
               * * *
              * * * *
             * * * * *
            * * * * * *
           * * * * * * *
          * * * * * * * *
         * * * * * * * * *


          */

        for (int satir = 1; satir <=9 ; satir++) {
            for (int bosluk = satir; bosluk <=9 ; bosluk++) {
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <=satir ; yildiz++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
