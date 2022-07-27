package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08meYapamadim {
    public static void main(String[] args) {
        /*
         * TASK :

         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
         * alirsa %10 indirim yapan code create ediniz.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("kac adet urun aldiginizi giriniz");
        int urunAdedi= scan.nextInt();

        System.out.println("ürün liste fiyatinizi giriniz");
        double fiyat= scan.nextDouble();

        System.out.println("müsteri kartiniz var mi? varsa V, yoksa Y yaziniz");
        char kart=scan.next().toLowerCase().charAt(0);


            if (urunAdedi>10 && kart=='y'){
                System.out.println(urunAdedi*fiyat);

            }
        }




    }

