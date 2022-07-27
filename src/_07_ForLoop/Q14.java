package _07_ForLoop;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {

    /*  TASK :
        Girilen bir sayı kadar satır ve sütünu olan ve
        sağ kenara dayalı üçgeni basan kodu yazınız.

        Ekran Çıktısı
        Bir sayi giriniz: 5
            *
           **
          ***
         ****
        *****

        */
        Scanner scan=new Scanner(System.in);
        System.out.println("matriks yapisi icin bir sayi giriniz");
        int sayi= scan.nextInt();

        for (int satir = 1; satir <=sayi ; satir++) {//satir kontrolü
            for (int bosluk =satir; bosluk <sayi ; bosluk++) {//bosluk olusturma
                System.out.print(" ");
            }
            for (int yildiz = 1; yildiz <=satir ; yildiz++) {
                System.out.print("*");
            }
            System.out.println();
        }

     /*
                    *
                    * *
                    * * *
                    * * * *
                    * * * * *
                    şeklini yazdırınız
             */











    }
}
