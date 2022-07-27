package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("harf giriniz");
        String harf=scan.next();

        String sesliHarfler="aeıioöuü";
        String sessizHarfler="bcdfghjklmnprstvyzxqw";

       if (harf.length()==1){
           for (int i = 0; i < 30; i++) {
               if (sesliHarfler.contains(harf)){
                   System.out.println("sesli harftir");
                   break;
               }else if (sessizHarfler.contains(harf)){
                   System.out.println("sessiz harftir");
                   break;
               }else System.out.println("yanlış giriş");
               break;

           }
       }else
        System.out.println("yanlıs karakter girdidiniz");


        }

    }




