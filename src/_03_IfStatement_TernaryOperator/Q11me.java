package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q11me {
    public static void main(String[] args) {
            /* TASK :
        Kullanıcıdan bir tarihi gün, ay ve yıl şeklinde alıp bu tarihi
        ay, gün, yıl ve yıl, ay, gün sıralarına çevirerek yazan bir kod yazınız.

        Örnek Ekran Çıktısı
        Lütfen günü giriniz: 10
        Lütfen ayı giriniz: 02
        Lütfen yılı giriniz: 2009
        Gün ay yıl: 10.02.2009
        Ay gün yıl: 02.10.2009
        Yıl ay gün: 2009.02.10
        */
        Scanner scan=new Scanner(System.in);
        System.out.print("gun : ");
        int gun= scan.nextInt();
        System.out.print("ay : ");
        int ay= scan.nextInt();
        System.out.print("yil : ");
        int yil= scan.nextInt();

        //BAGIMSIZ İF YAPİYORUZ CUNKU HER BİR VARİABLE SONUCUNU İSTİYORUZ
        //HER İF İN İCERİSİNE BOOLEAN DEGER ATARSAK, SONUC YANLIS OLSADA ASAGIDA SONUCU YAZDIIRYOR
        //EGER ATARSAK YAZDIRMAZ

        if (gun>=1 && gun<=31){
            System.out.println("gun : "+ gun);
        }else System.out.println("lütfen gecerli gün giriniz");
        if (ay>=1 && ay<=12){
            System.out.println("ay : "+ay);
        }else System.out.println("lütfen gecerli ay giriniz");
        if (yil>=1923 && gun<=2022){
            System.out.println("yil : " +yil);
        }else System.out.println("lütfen gecerli yil giriniz");

        System.out.println(gun+"/"+ay+"/"+yil);
        System.out.println(yil+"/"+ay+"/"+gun);

    }
}
