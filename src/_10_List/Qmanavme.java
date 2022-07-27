package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Qmanavme {

    static List<String> urunListesi=new ArrayList<String>();
    static List<Double> urunFiyatlari=new ArrayList<Double>();
    static double toplamOdeme;
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        urunListesi.add("domates - urun kodu: 1 ");
        urunListesi.add("muz - urun kodu: 2 ");
        urunListesi.add("elma - urun kodu: 3 ");
        urunListesi.add("erik - urun kodu: 4 ");
        urunListesi.add("cilek - urun kodu: 5 ");

        urunFiyatlari.add(15.0);
        urunFiyatlari.add(18.0);
        urunFiyatlari.add(8.0);
        urunFiyatlari.add(47.0);
        urunFiyatlari.add(27.0);

        System.out.println(urunListesi);

        musteriSecimi();



    }

    private static void musteriSecimi() {
        System.out.println("sectiginiz urun kodunu giriniz : ");
        int secim=scan.nextInt();
        System.out.println("sectiginiz urunden kaç kg alacaksınız : ");
        double kg= scan.nextDouble();
        double urunTutar=kg*urunFiyatlari.get(secim-1);//toplam ödemeye eklememiz lazım
        toplamOdeme+=urunTutar;
        System.out.println("alısverise devam etmek istiyorsanız 1 kas a için 2 seciniz : ");
        int devamlilik= scan.nextInt();
        if (devamlilik==1){
            musteriSecimi();//burda dongu olustu method methodu cağırdı
        }else
            kasaM();

    }

    private static void kasaM() {
        System.out.println("tekrar bekleriz.. odenecek tutar :"+toplamOdeme);
    }
}
