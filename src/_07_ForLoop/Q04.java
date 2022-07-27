package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */

        Scanner scan = new Scanner(System.in);
        int toplam = 0;


        for (int i = 1; i <= 5; i++) {
            System.out.println("5 sayi giriniz");
            int sayi = scan.nextInt();
            if (5 < sayi && sayi < 10) {
                System.out.println("girdiginiz sayi 5 ile 10 arasind old. icin islem yok");
                continue;
            }
            toplam += sayi;
        }
        System.out.println(toplam);

    }

}
