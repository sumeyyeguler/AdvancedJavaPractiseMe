package _07_ForLoop;

public class Q21_2 {
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

        for (int satir = 1; satir <=9 ; satir++) {
            for (int satirici = 1; satirici <=satir ; satirici++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
