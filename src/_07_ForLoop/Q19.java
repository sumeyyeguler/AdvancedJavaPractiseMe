package _07_ForLoop;

public class Q19 {
    public static void main(String[] args) {


    /*
     Yıldızlar (*) ile piramit oluşturabileceğiniz bir kod yazınız.
            Sonuç böyle olmalıdır;

               |    *
               |   * *
               |  * * *
               | * * * *
               |* * * * *

     */


        for (int satir = 1; satir <=5 ; satir++) {//satir kontrolu yapildi
            for (int bosluk = satir; bosluk <5 ; bosluk++) {//boslugumuzu olusturduk
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <=satir ; yildiz++) {
                System.out.print("* ");
            }
            System.out.println();
        }



        }}





