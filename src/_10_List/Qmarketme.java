package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Qmarketme {

    static List<String>gunler=new ArrayList<>(Arrays.asList("pazartesi","sali","carsamba","persembe","cuma","cumartesi","pazar"));
    //add yapmadan tek satirda ekledik
    static List<Double>gunlukKazanc=new ArrayList<>(); //kullanicidan gelen data ile atanacak boş bir list
    static Scanner scan=new Scanner(System.in);
    static double toplamCiro;
    public static void main(String[] args) {

        int gun=0;
        while (gun<7){
            System.out.println(gunler.get(gun)+" gununun kazancını giriniz : ");
            double gunlukHasilat=scan.nextDouble();
            gunlukKazanc.add(gunlukHasilat);
            toplamCiro+=gunlukHasilat;
            gun++;

            gettOrtalamaKazanc();
            getOrtalamUzerindekiGunler();
            System.out.println("gunluk kazançlar : "+gunlukKazanc);
            System.out.println("hafta toplami :"+toplamCiro);
            System.out.println("haftalık ortalama : "+gettOrtalamaKazanc());
            System.out.println("ortalama üzeri kazanç getiren gün : "+getOrtalamUzerindekiGunler());
        }
    }

    private static String getOrtalamUzerindekiGunler() {
        String ortalamaUstundekiGun="";
        for (int i = 0; i <gunlukKazanc.size() ; i++) {
            if (gunlukKazanc.get(i)>gettOrtalamaKazanc()){
                ortalamaUstundekiGun= gunler.get(i);
            }
        }return ortalamaUstundekiGun;
    }

    private static double gettOrtalamaKazanc() {
        double ortalamaKazanc=toplamCiro/7;
        return ortalamaKazanc;
    }
}
