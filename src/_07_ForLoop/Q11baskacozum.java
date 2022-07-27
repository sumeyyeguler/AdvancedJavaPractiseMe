package _07_ForLoop;

import java.util.Scanner;

public class Q11baskacozum {
    public static void main(String[] args) {
        /*
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

            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen bir sayi giriniz: ");
            int sayi = scanner.nextInt();
            int toplam = 0;//Bölenlerin toplamını yazmak için bir variable açtık

            for (int i = 1; i <= sayi; i++) {//Bölenleri tespit etmek için for açtık
                // i yi sayiya kadar arttırdık sayı kadar da oldu

                if (sayi % i == 0 && sayi / i != sayi) {//Sayının i ye bölümünden kalan 0 sa
                    // ve sayının i ye bölümünün sonucu sayı ya eşit değilse
                    toplam += sayi / i;//Sayının i ye bölümünü toplama ekle
                }

            }
            System.out.println("Toplam = " + toplam);//Toplamı yazdırdık
            if (toplam == sayi) {//toplam sayıya eşitse sayı mükemmeldir değilse değildir
                System.out.println("Sayi Mükemmel Sayidir");
            } else System.out.println("Sayi Mukemmel Degildir");
        }
    }
