package _07_ForLoop;

import java.util.Scanner;

public class Q04me {
    public static void main(String[] args) {

         /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner scan = new Scanner(System.in);
        int sayiToplam = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("lütfen sayi giriniz");
            int sayi = scan.nextInt();
            if (sayi > 5 && sayi < 10) {
                System.out.println("5 ile 10 arasinda deger giriniz");
                continue;
            } else
                sayiToplam += sayi;
        }
        System.out.println("sayilarin toplami : "+sayiToplam);


    }
}
