package _07_ForLoop;

import java.util.Scanner;

public class Q11 {

    /*/*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();
        int toplam = 0;

        for (int i = 1; i <=sayi ; i++) {
            if (sayi%i==0 && sayi/i!=sayi){
                toplam+=sayi/i;
            }

    }System.out.println("toplam: "+toplam);
        if (sayi==toplam){
            System.out.println("sayi mukemmeldir ");
        }else System.out.println("sayi mukemmel degildir");


}}
